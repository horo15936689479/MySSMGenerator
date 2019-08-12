package com.horo.ssm.service;

import com.horo.ssm.pojo.TbOrder;
import com.horo.ssm.pojo.TbUser;

import java.util.List;

public interface UserService {

    public List<Tbuser> getMyOrderOne();
    public List<TbUser> getUsers();
    public List<TbOrder> getMyOrderDetail();
}
