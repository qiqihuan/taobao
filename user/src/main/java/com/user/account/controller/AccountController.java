package com.user.account.controller;

import com.user.account.entity.Account;
import com.user.account.entity.ResultVO;
import com.user.account.entity.util.page.PageCondition;
import com.user.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 账户管理的controller
 * </p>
 *
 * @author:wells
 * @since:2020/9/1
 */
@RestController
@RequestMapping("/v1/account/account")
public class AccountController {

    @Autowired
    AccountService accService;


    /**
     * 新增账户
     * @param account 账户信息
     * @return 新增账户的结果
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResultVO saveAccount(Account account){

        return accService.saveAccount(account);
    }


    /**
     * 修改账户
      * @param account 账户信息
     * @return 修改账户信息及状态的操作结果
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultVO updateAccount(Account account){
        System.out.println("修改账户中");

        return accService.updateAccount(account);
    }


    /**
     * 按页查询账户信息
     * @param pageCondition 页信息
     * @return 查询出来的数据
     */
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public ResultVO pageAccount(PageCondition pageCondition){

        return accService.pageAccount(pageCondition);
    }




}










