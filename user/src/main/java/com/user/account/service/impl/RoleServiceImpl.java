package com.user.account.service.impl;

import com.user.account.entity.ResultVO;
import com.user.account.entity.Role;
import com.user.account.mapper.RoleMapper;
import com.user.account.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作角色的业务层
 * </p>
 *
 * @author:wells
 * @since:2020/9/8
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public ResultVO saveRole(Role role) {

//        int saveRoleCount = roleMapper.saveRole();



//        return ResultVO.buildOkResult(saveRoleCount);
        return null;
    }

}






