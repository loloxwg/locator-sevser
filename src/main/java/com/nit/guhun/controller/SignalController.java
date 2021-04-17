package com.nit.guhun.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nit.guhun.entity.SignalEntity;
import com.nit.guhun.service.SignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("signal")
public class SignalController {
    @Autowired
    SignalService signalService;
    @PostMapping("insert")
    public int insert(@RequestBody List<SignalEntity> signalList){
        return signalService.insert(signalList);
    }

    @PostMapping("locate")
    public Map<String, Object> locate(@RequestBody String res){
        JSONObject object = JSON.parseObject(res);
        List<SignalEntity> signalList = JSON.parseArray(object.getString("signalList"),SignalEntity.class);
        String userId = object.getString("userId");
        return signalService.locate(signalList,userId);
    }
    @GetMapping("signalbywifiid")
    public List<SignalEntity> getSignalByWifiId(String wifiId){
        return signalService.getSignalByWifiId(wifiId);
    }
}
