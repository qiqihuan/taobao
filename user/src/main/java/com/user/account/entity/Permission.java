package com.user.account.entity;

import lombok.Data;

import java.time.Instant;

/**
 * <p>
 * 封装权限的类
 * </p>
 *
 * @author:wells
 * @since:2020/9/4
 */
@Data
public class Permission {

    /**
     * 权限创建时间
     */
    private Integer id;

    /**
     * 当前权限控制的uri
     */
    private String uri;

    /**
     * 是否拥有创建的权限
     */
    private Boolean create;

    /**
     * 是否拥有删除的权限
     */
    private Boolean delete;

    /**
     * 是否拥有修改的权限
     */
    private Boolean update;

    /**
     * 是否拥有查询的权限
     */
    private Boolean retrieve;

    /**
     * 当前权限创建的时间
     */
    private Instant gmtCreate;

    /**
     * 当前权限修改的时间
     */
    private Instant gmtModified;

}
