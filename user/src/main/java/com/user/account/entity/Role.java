package com.user.account.entity;

import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * <p>
 * 封装角色的类
 * </p>
 *
 * @author:wells
 * @since:2020/9/4
 */
@Data
public class Role {

    /**
     * 角色的唯一id
     */
    private Integer id;

    /**
     * 角色的创建时间
     */
    private Instant gmtCreate;

    /**
     * 角色的修改时间
     */
    private Instant gmtModified;

    /**
     * 当前角色拥有的权限列表
     */
    private List<Integer> permission;

    /**
     * 当前角色包含的具体的权限列表
     */
    private List<Integer> uri;
}
