package lyx.dubbo.bean;

import java.io.Serializable;

/**
 * @Title useraddress
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\10 0010 16:28
 */

public class useraddress implements Serializable {
    private Integer id;
    private String useraddress; //用户地址
    private String userid; //用户id
    private String consignee; //收货人
    private String phonenum; //电话号码
    private String isdefault; //是否为默认地址    Y-是     N-否

    public useraddress(Integer id, String useraddress, String userid, String consignee, String phonenum, String isdefault) {
        this.id = id;
        this.useraddress = useraddress;
        this.userid = userid;
        this.consignee = consignee;
        this.phonenum = phonenum;
        this.isdefault = isdefault;
    }

    @Override
    public String toString() {
        return "useraddress{" +
                "id=" + id +
                ", useraddress='" + useraddress + '\'' +
                ", userid='" + userid + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", isdefault='" + isdefault + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }
}
