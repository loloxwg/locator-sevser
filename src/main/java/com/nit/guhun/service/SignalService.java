package com.nit.guhun.service;

import com.nit.guhun.entity.SignalEntity;
import com.nit.guhun.mapper.SignalEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignalService {
    @Autowired
    private SignalEntityMapper signalEntityMapper;
    public int insert(List<SignalEntity> list){
        signalEntityMapper.deleteByWifiId(list.get(0).getSignalWifiId());
        return signalEntityMapper.insert(list);
    }
}
