package com.user.account.controller;

import com.user.account.entity.ResultVO;
import com.user.account.entity.Role;
import com.user.account.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * 控制角色的controller
 * </p>
 *
 * @author:wells
 * @since:2020/9/8
 */
@Controller
@RequestMapping("/v1/count/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResultVO saveRole(Role role){

        return service.saveRole(role);
    }




}






