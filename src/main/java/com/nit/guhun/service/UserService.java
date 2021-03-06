package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.EmployeeEntity;
import com.nit.guhun.entity.UserEntity;
import com.nit.guhun.entity.UserInfoEntity;
import com.nit.guhun.mapper.EmployeeEntityMapper;
import com.nit.guhun.mapper.UserEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserEntityMapper userEntityMapper;
    @Autowired
    private EmployeeEntityMapper employeeEntityMapper;

    public int insert(UserEntity userEntity){
        if(userEntityMapper.login(userEntity)==null){
            return userEntityMapper.insertSelective(userEntity);
        }else{
            return -1;
        }
    }
    public int delete(String userId){
        return userEntityMapper.deleteByPrimaryKey(userId);
    }
    public int setpwd(String userId,String password){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userId);
        userEntity.setUserPwd(password);
        return userEntityMapper.updateByPrimaryKeySelective(userEntity);
    }
    public int update(UserEntity userEntity){
        return userEntityMapper.updateByPrimaryKeySelective(userEntity);
    }

    public PageInfo<UserEntity> query(Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<UserEntity> list = userEntityMapper.query();
        PageInfo<UserEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public int login(UserEntity userEntity){
        UserEntity user = userEntityMapper.login(userEntity);
        if(user==null){
            return -1;
        }

        if(user.getUserPwd().equals(userEntity.getUserPwd())){
            switch (user.getUserRight()){
                case "master":return 10;
            }
            return 1;
        }
        return -2;
    }
    public UserInfoEntity getuserinfo(String userId){
        return userEntityMapper.selectUserInfo(userId);
    }
    public int setuserinfo(UserInfoEntity userInfoEntity) {
        int count = 0;
        UserEntity userEntity = new UserEntity();
        EmployeeEntity employeeEntity = new EmployeeEntity();
        // ?????????user????????????
        userEntity.setUserId(userInfoEntity.getUserId());
        userEntity.setUserEmpId(userInfoEntity.getUserEmpId());
        userEntity.setUserRight(userInfoEntity.getUserRight());
        count += userEntityMapper.updateByPrimaryKeySelective(userEntity);
        // ??????empId????????????
        employeeEntity.setEmpId(userInfoEntity.getEmpId());
        List<EmployeeEntity> list = employeeEntityMapper.selectByEntity(employeeEntity);
        boolean isnull = list.size()==0;
        employeeEntity.setEmpName(userInfoEntity.getEmpName());
        employeeEntity.setEmpSex(userInfoEntity.getEmpSex());
        employeeEntity.setEmpAge(userInfoEntity.getEmpAge());
        employeeEntity.setEmpTel(userInfoEntity.getEmpTel());
        employeeEntity.setEmpJob(userInfoEntity.getEmpJob());
        employeeEntity.setEmpHobby(userInfoEntity.getEmpHobby());
        employeeEntity.setEmpMsg(userInfoEntity.getEmpMsg());
        count *= 10;
        if(isnull){
            count += employeeEntityMapper.insertSelective(employeeEntity);
            //??????
        }else {
            count += employeeEntityMapper.updateByPrimaryKeySelective(employeeEntity);
            //??????
        }
        // 1??????emp?????????10??????user?????????11???????????????
        return count;
    }
}
