package com.horo.ssm.service.impl;

import com.horo.ssm.dao.TbOrderDao;
import com.horo.ssm.dao.TbUserDao;
import com.horo.ssm.pojo.TbOrder;
import com.horo.ssm.pojo.TbUser;
import com.horo.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    TbUserDao tbUserDao;

    @Resource
    TbOrderDao tbOrderDao;

    @Override
    public List<TbUser> getMyOrderOne() {
        return tbOrderDao.selectOneOrder();
    }

    @Override
    public List<TbOrder> getMyOrderDetail() {
        return tbOrderDao.selectOrderDetail();
    }


    @Override
    public List<TbUser> getUsers() {
        return tbUserDao.selectAll();
    }
}
