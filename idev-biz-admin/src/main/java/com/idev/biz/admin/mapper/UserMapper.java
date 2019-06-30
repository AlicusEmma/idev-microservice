package com.idev.biz.admin.mapper;

import com.idev.biz.admin.entity.UserEntity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from dkusermst")
    @Results({ @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age") })
    List<UserEntity> getAll();

}
