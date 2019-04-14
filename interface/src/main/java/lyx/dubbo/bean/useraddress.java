package lyx.dubbo.bean;

import java.io.Serializable;

/**
 * @Title useraddress
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\10 0010 16:28
 */

public class useraddress implements Serializable {
    private Integer id;
    private String useraddress; //�û���ַ
    private String userid; //�û�id
    private String consignee; //�ջ���
    private String phonenum; //�绰����
    private String isdefault; //�Ƿ�ΪĬ�ϵ�ַ    Y-��     N-��

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
