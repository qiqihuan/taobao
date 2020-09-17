package com.user.account.entity;


import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * <p>
 * 封装账户的类
 * </p>
 *
 * @author:wells
 * @since:2020/9/4
 */
@Data
public class Account implements Serializable {
    private static final long serialVersionUID = -3823066231092619372L;
    /**
     * 唯一id
     */
    private Integer id;

    /**
     * 登录用户名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户居住地
     */
    private String location;

    /**
     * 账户创建时间
     */
    private Instant gmtCreate;

    /**
     * 账户最后一次修改时间
     */
    private Instant gmtModified;

    /**
     * 最后一次修改该账户的用户id
     */
    private Integer modifiedId;

    /**
     * 当前账户的角色
     */
    private String role;

    /**
     * 当前账户的角色列表
     */
    private List<Integer> roleIds;

    /**
     * 当前账户拥有的权限列表
     */
    private List<Integer> permissionIds;

    /**
     * 是否被移除
     */
    private Boolean hasRemove;


}





