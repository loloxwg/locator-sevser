package com.nit.guhun.controller;

import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.UserEntity;
import com.nit.guhun.entity.UserInfoEntity;
import com.nit.guhun.service.UserService;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("query")
    public PageInfo<UserEntity> query(Entity entity){
        return userService.query(entity);
    }
    @PostMapping("insert")
    public int insert(UserEntity userEntity){return userService.insert(userEntity);}
    @PostMapping("setpwd")
    public int setpwd(String userId, String userPwd){return userService.setpwd(userId,userPwd);}
    @GetMapping("update")
    public int update(UserEntity userEntity){return userService.update(userEntity);}
    @GetMapping("delete")
    public int delete(String userId){return userService.delete(userId);}
    @PostMapping("login")
    public int login(UserEntity userEntity){return userService.login(userEntity);}
    @GetMapping("getuserinfo")
    public UserInfoEntity getuserinfo(String userId){
        return userService.getuserinfo(userId);
    }
    @GetMapping("setuserinfo")
    public int setuserinfo(UserInfoEntity userInfoEntity){
        return userService.setuserinfo(userInfoEntity);
    }
}
