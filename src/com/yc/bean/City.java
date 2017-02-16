package com.yc.bean;

public class City {
    private int cid;
    private String cname;
    
    //关联对象：通过Classes对象得到Teacher的信息
    private Province province;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "City [cid=" + cid + ", cname=" + cname + ", province=" + province + "]";
    }

}
