package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LSK
 * @since 2023-06-16
 */
@TableName("video_user")
public class VideoUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private String userEmail;

    private String userAddress;

    /**
     * 用户头像地址
     */
    private String userAvatarLoc;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserAvatarLoc() {
        return userAvatarLoc;
    }

    public void setUserAvatarLoc(String userAvatarLoc) {
        this.userAvatarLoc = userAvatarLoc;
    }

    @Override
    public String toString() {
        return "VideoUser{" +
            "userId=" + userId +
            ", userName=" + userName +
            ", userPassword=" + userPassword +
            ", userPhone=" + userPhone +
            ", userEmail=" + userEmail +
            ", userAddress=" + userAddress +
            ", userAvatarLoc=" + userAvatarLoc +
        "}";
    }
}
