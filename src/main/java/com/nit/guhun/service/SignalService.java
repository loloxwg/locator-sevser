package com.nit.guhun.service;

import com.nit.guhun.entity.SignalEntity;
import com.nit.guhun.entity.UserEntity;
import com.nit.guhun.mapper.SignalEntityMapper;
import com.nit.guhun.mapper.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SignalService {
    @Autowired
    private SignalEntityMapper signalEntityMapper;
    @Autowired
    private UserEntityMapper userEntityMapper;

    public int insert(List<SignalEntity> list){
        signalEntityMapper.deleteByWifiId(list.get(0).getSignalWifiId());
        return signalEntityMapper.insert(list);
    }
    public Map<String, Object> locate(List<SignalEntity> list,String userId){
        Map<String, Object> locate = signalEntityMapper.locate(list).get(0);
        if(locate==null){
            Map<String, Object> error = new HashMap<>();
            error.put("size", "0");
            return error;
        }
        UserEntity user = new UserEntity();
        user.setUserId(userId);
        user.setUserWifiId(Integer.valueOf(locate.get("wifi_id").toString()));
        userEntityMapper.updateByPrimaryKeySelective(user);
        return locate;
    }
}
