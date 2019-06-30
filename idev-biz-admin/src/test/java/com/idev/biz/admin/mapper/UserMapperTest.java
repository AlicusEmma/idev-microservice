package com.idev.biz.admin.mapper;

import com.idev.biz.admin.entity.UserEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAll() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        Assert.assertEquals(1,users.size());
    }

    @Test
    public void queryUser() throws Exception {
//        UserEntity user = new UserEntity();
//        user.setUsername("l");
//        System.out.println(userMapper.queryUser(user));
    }

}
