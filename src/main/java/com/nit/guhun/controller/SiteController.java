package com.nit.guhun.controller;

import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.SiteEntity;
import com.nit.guhun.service.SiteService;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/site")
public class SiteController {
    @Autowired
    private SiteService siteService;
    @GetMapping("query")
    public PageInfo<SiteEntity> query(Entity entity){
        return siteService.query(entity);
    }
    @GetMapping("insert")
    public int insert(SiteEntity siteEntity){return siteService.insert(siteEntity);}
    @GetMapping("update")
    public int update(SiteEntity siteEntity){return siteService.update(siteEntity);}
    @GetMapping("delete")
    public int delete(Integer siteId){return siteService.delete(siteId);}
    @GetMapping("select")
    public PageInfo<SiteEntity> select(Entity entity,SiteEntity siteEntity){
        return siteService.select(entity,siteEntity);
    }
}
