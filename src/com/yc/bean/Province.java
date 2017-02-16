package com.yc.bean;

import java.util.List;

public class Province {
    private int pid;
    private String pname;
    
    private List<City> citys;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<City> getCitys() {
        return citys;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
    }

    @Override
    public String toString() {
        return "Province [pid=" + pid + ", pname=" + pname + ", citys=" + citys + "]";
    }
}
