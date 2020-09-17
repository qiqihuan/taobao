package com.user.account.mapper;

import com.user.account.entity.Account;
import com.user.account.entity.centre.AccountRoleCentre;
import com.user.account.entity.util.page.PageCondition;

import java.util.List;

/**
 * <p>
 * 账户管理的mapper接口
 * </p>
 *
 * @author:wells
 * @since:2020/9/5
 */
public interface AccountMapper {

    /**
     * 新增账户
     * @param account 账户信息
     * @return 操作成功数
     */
    int saveAccount(Account account);

    /**
     * 在账户和角色中间表添加数据
     * @param accountRoleCentre 账户id和角色id封装对象
     */
    void addAccountRoleCentre(AccountRoleCentre accountRoleCentre);

    /**
     * 修改账户信息
     * @param account 新的账户信息
     * @return 修改影响的条数
     */
    int updateAccount(Account account);

    /**
     * 根据账户id删除所有账户和角色对应的中间表
     * @param ids 账户id列表
     */
    void deleteAccountRoleCentreByAccountId(List<Integer> ids);

    /**
     * 根据账户id列表移除账户
     * @param ids 账户id列表
     * @return 移除成功条数
     */
    int removeAccount(List<Integer> ids);


    /**
     * 查询所有的用户信息
     * @param pageCondition 约束规则
     * @return 账户列表
     */
    List<Account> selectAccountList(PageCondition pageCondition);
}
