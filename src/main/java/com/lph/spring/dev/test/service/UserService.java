package com.lph.spring.dev.test.service;

import com.lph.spring.dev.test.dao.UserDao;
import com.lph.spring.dev.test.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //出现重复phone，返回前台禁止修改
    public void updatePhone(Integer userId,String phone) {
        UserEntity userEntity = userDao.findById(userId).get();
        if(userEntity.getPhone().equals(phone)) {
//            return "phone is same";
            System.out.println("sssssssssssssss");
        } else if( phone !=null) {
            userEntity.setPhone(phone);
            //判断是否有重复
            List<String> userAllPhone = findUserAllPhone();
            for (String integer : userAllPhone) {
                if(phone.equals(integer)){
//                    return "repeat phone";
                    break;
                }
            }
            userEntity.setPhone(phone);
        } else {
            userEntity.setPhone("");
        }
        try {
            userDao.save(userEntity);
        } catch (Exception e) {
//            return e.toString();
            System.out.println(e.toString());
        }
    }
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    //查询所有phone
    public List<String> findUserAllPhone() {
        List<UserEntity>  user  = userDao.findAll();
        List<String> res = new ArrayList<>();
        for (UserEntity userEntity : user) {
            res.add(userEntity.getPhone());
        }
        return res;
    }
//    //查询所有email
//    public List<String> findUserAllEmail() {
//        return userDao.findDistinctByEmail();
//    }
//    //查询所有idcard
//    public List<Integer> findUserAllIdcard() {
//        return userDao.findDistinctByIdcard();
//    }


//    //查找UserId对应的Phone
//    public Integer findUserPhone(Integer userId) {
//        return userDao.findById(userId).get().getPhone();
//    }
//    //查找UserId对应的email
//    public String findUserEmail(Integer userId) {
//        return userDao.findById(userId).get().getEmail();
//    }
//    //查找UserId对应的idcard
//    public Integer findUserIdcard(Integer userId) {
//        return userDao.findById(userId).get().getIdcard();
//    }

}
