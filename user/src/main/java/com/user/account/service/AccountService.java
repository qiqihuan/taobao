package com.user.account.service;


import com.user.account.entity.Account;
import com.user.account.entity.ResultVO;
import com.user.account.entity.util.page.PageCondition;

/**
 * <p>
 *
 * </p>
 *
 * @author:wells
 * @since:2020/9/5
 */
public interface AccountService {
    ResultVO saveAccount(Account account);

    ResultVO updateAccount(Account account);

    ResultVO pageAccount(PageCondition pageCondition);


}
