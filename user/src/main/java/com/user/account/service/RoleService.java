package com.user.account.service;

import com.user.account.entity.ResultVO;
import com.user.account.entity.Role;

/**
 * <p>
 * 角色的业务层接口
 * </p>
 *
 * @author:wells
 * @since:2020/9/8
 */
public interface RoleService {


    ResultVO saveRole(Role role);

}
