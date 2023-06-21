package com.base.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static boolean create_folder(String folder_loc) {
        // Replace with your desired folder path
        File folder = new File(folder_loc);
        System.out.println(folder_loc);
        if (!folder.exists()) {
            boolean success = folder.mkdirs();
            System.out.println("create folder: " + success);
            return success;
        } else {
            return true;
        }
    }

    /**
     * Transfer inputstream to outputstream.
     * @param bufferSize
     * @param inputStream
     * @param outputStream
     * @throws Exception
     */
    public static void inputstream_to_outputstream(int bufferSize, InputStream inputStream, OutputStream outputStream) throws Exception{
        byte[] buffer = new byte[bufferSize];
        int len = 0;
        while((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer,0,len);
        }
    }

    /**
     * Save files to the designated location
     * @param location
     * @param files
     * @throws Exception
     */
    public static void save_file(String location, MultipartFile... files) throws Exception {
        int i = 0;
        for(MultipartFile multipartFile: files) {
            File file = new File(location);
            if(file.exists()) {
                return;
            }
            if(!file.createNewFile()) {
                throw new RuntimeException("Error creating file");
            }
            OutputStream outputStream = new FileOutputStream(file);
            InputStream inputStream = multipartFile.getInputStream();
            inputstream_to_outputstream(1024,inputStream, outputStream);
            inputStream.close();
            outputStream.close();
            System.out.println("Save Image successful" + location);
            i++;
        }
    }

    public static List<String> getFileNameUnderFolder(String folderName) {
        List<String> ret = new ArrayList<>();
        File folder = new File(folderName);
        if(folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            for(File file1: files) {
                ret.add(file1.getName());
            }
        }
        return ret;
    }

    /**
     * 删除一个文件夹下所有的文件（包括这个文件夹）
     * @param folderLoc, absolute path
     * @return
     */
    public static void deleteFolder(String folderLoc) {
        File folder = new File(folderLoc);
        if(folder.exists() && folder.isDirectory()) {
            File[]files = folder.listFiles();
            for(File file: files) {
                if(file.isDirectory()) {
                    deleteFolder(file.getAbsolutePath());
                } else {
                    file.delete();
                }
            }
        }
        folder.delete();

    }
}
