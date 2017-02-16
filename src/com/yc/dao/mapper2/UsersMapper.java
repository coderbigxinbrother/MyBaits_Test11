package com.yc.dao.mapper2;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yc.bean.Province;


//这是一个接口。这个接口跟UsersMapper.xml一样
public interface UsersMapper {
    //.xml 中的
    @Select("select * from users where usid = #{usid}")
    public Province selectUser(int usid);
    
    @Insert("insert into users values(seq_users.nextval,#{uname},#{upwd})")
    public void insertUser(Province user);
    
    @Delete("delete from users WHERE usid = #{usid}")
    public void deleteUser(Province user);
    
    @Update("update users set uname = #{uname} , upwd = #{upwd} where usid = #{usid}")
    public void updateUser(Province user);
}
