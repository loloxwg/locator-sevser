package com.nit.guhun.controller;


import com.nit.guhun.entity.SignalEntity;
import com.nit.guhun.service.SignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("signal")
public class SignalController {
    @Autowired
    SignalService signalService;
    @PostMapping("insert")
    public int insert(@RequestBody List<SignalEntity> signalList){
        return signalService.insert(signalList);
    }

}
