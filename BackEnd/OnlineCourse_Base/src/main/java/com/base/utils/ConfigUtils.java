package com.base.utils;

import com.base.Constant;
import com.base.dto.ConfigDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ConfigUtils {
    public static ConfigDto getConfig() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        ConfigDto configDto = objectMapper.readValue(new File(Constant.getBackEndAbsolutePath() + "Config.json"), ConfigDto.class);
        return configDto;
    }
}
