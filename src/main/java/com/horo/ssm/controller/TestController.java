package com.horo.ssm.controller;

import com.horo.ssm.pojo.TbOrder;
import com.horo.ssm.pojo.TbUser;
import com.horo.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){

        List<TbUser> list = userService.getMyOrderOne();
        return list.get(0).getTbOrder().getId()+":"+list.get(0).getUsername();
    }

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    @ResponseBody
    public String test2(){

        List<TbOrder> myOrderDetail = userService.getMyOrderDetail();
        return myOrderDetail.get(0).getDetails().get(0).getGoodsname();
    }
}
