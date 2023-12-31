package com.base.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 课程营销信息
 * </p>
 *
 * @author LSK
 * @since 2023-06-17
 */
@TableName("course_market")
public class CourseMarket implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，课程id
     */
    private Long id;

    /**
     * 收费规则，对应数据字典
     */
    private String charge;

    /**
     * 现价
     */
    private Float price;

    /**
     * 原价
     */
    private Float originalPrice;

    /**
     * 咨询qq
     */
    private String qq;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 电话
     */
    private String phone;

    /**
     * 有效期天数
     */
    private Integer validDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    @Override
    public String toString() {
        return "CourseMarket{" +
            "id=" + id +
            ", charge=" + charge +
            ", price=" + price +
            ", originalPrice=" + originalPrice +
            ", qq=" + qq +
            ", wechat=" + wechat +
            ", phone=" + phone +
            ", validDays=" + validDays +
        "}";
    }
}
