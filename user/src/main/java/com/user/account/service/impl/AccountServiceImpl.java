package com.user.account.service.impl;

import com.user.account.entity.Account;
import com.user.account.entity.ResultVO;
import com.user.account.entity.centre.AccountRoleCentre;
import com.user.account.entity.util.page.PageCondition;
import com.user.account.entity.util.page.PageInfoVO;
import com.user.account.entity.util.page.PageUtil;
import com.user.account.mapper.AccountMapper;
import com.user.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 账户的service层
 * </p>
 *
 * @author:wells
 * @since:2020/9/5
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accMapper;

    @Autowired
    PageUtil pageUtil;

    @Override
    public ResultVO saveAccount(Account account) {
        account.setGmtCreate(Instant.now());
        int addAccountNumber = accMapper.saveAccount(account);
        AccountRoleCentre accountRoleCentre = new AccountRoleCentre(account.getId(), account.getRoleIds());
        accMapper.addAccountRoleCentre(accountRoleCentre);
        return ResultVO.buildOkResult(addAccountNumber);
    }

    @Override
    public ResultVO updateAccount(Account account) {
        account.setGmtModified(Instant.now());
        int updateAccountNumber = accMapper.updateAccount(account);
        // 如果用户提交的角色id列表为空说明没有修改当前账户的角色信息
        if (account.getRoleIds() != null && account.getRoleIds().size() !=0){
            List<Integer> ids = new ArrayList<>();
            ids.add(account.getId());
            accMapper.deleteAccountRoleCentreByAccountId(ids);
            AccountRoleCentre accountRoleCentre = new AccountRoleCentre(account.getId(), account.getRoleIds());
            accMapper.addAccountRoleCentre(accountRoleCentre);
        }
        return ResultVO.buildOkResult(updateAccountNumber);
    }

    @Override
    public ResultVO pageAccount(PageCondition pageCondition) {

        // 查出所有数据
        List<Account> accountList = accMapper.selectAccountList( pageCondition);
        // 使用分页工具分页
        PageInfoVO pageInfoVO = pageUtil.pageSplit(accountList, pageCondition);

        return ResultVO.buildOkResult(pageInfoVO);
    }
}
