package com.yc.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yc.bean.City;
import com.yc.bean.Province;


public class MybatisHelperxml {
    public static void main(String[] args) {
        MybatisHelperxml mh = new MybatisHelperxml();
        mh.find();
        //mh.findCity();
        //mh.delete();
        //mh.update();
        //mh.insert();
    }
    
    public void find(){
        
        //通过session工厂得到一个session
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Province c = session.selectOne("com.yc.dao.mapper.ProviceMapper.findProvince", 2);
            System.out.println(c);
        } finally {
        session.close();
        }
    }
    
    public void findCity(){
        
        //通过session工厂得到一个session
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            City c = session.selectOne("com.yc.dao.mapper.CityMapper.findCity", 8);
            System.out.println(c);
        } finally {
        session.close();
        }
    }
    public void delete(){
        SqlSession session = MybatisUtils.getSqlSession();
        try {
            //session中有很多操作方法
            //会由mybatis框架自动根据你的usersMapper.xml中的select id为selectUser
            Province u  = new Province();
            int  num = session.delete("com.yc.dao.mapper.UsersMapper.deleteUser", u);
            session.commit();
            System.out.println(num);
        } finally {
        session.close();
        }
    }
}
