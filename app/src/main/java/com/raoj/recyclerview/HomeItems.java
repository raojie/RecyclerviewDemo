package com.raoj.recyclerview;

/**
 * Method: HomeItems
 * Decription:首页显示item项
 * Author: raoj
 * Date: 2018/2/11
 **/
public class HomeItems {
    private String sign;//签到
    private String pay;//充值
    private String inquiry;//查询

    public String getInquiry() {
        return inquiry;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
