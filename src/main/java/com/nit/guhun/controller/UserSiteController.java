package com.nit.guhun.controller;

import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.UserSiteEntity;
import com.nit.guhun.service.UserSiteService;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("usersite")
public class UserSiteController {

    @Autowired
    private UserSiteService userSiteService;

    @GetMapping("query")
    public PageInfo<UserSiteEntity> query(UserSiteEntity userSiteEntity,Entity entity){
        return userSiteService.query(userSiteEntity,entity);
    }
    @GetMapping("select")
    public UserSiteEntity selectByUserId(String userId){
        return userSiteService.selectByUserId(userId);
    }
}
