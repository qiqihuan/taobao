package com.user.account.entity;

import lombok.Data;

import java.time.Instant;

/**
 * <p>
 * 封装菜单的类
 * </p>
 *
 * @author:wells
 * @since:2020/9/4
 */
@Data
public class Menu {

    /**
     * 菜单的唯一id
     */
    private Integer id;

    /**
     * 菜单的名称
     */
    private String name;

    /**
     * 父菜单的id
     */
    private Integer parentId;

    /**
     * 当前菜单的创建时间
     */
    private Instant gmtCreate;

    /**
     * 当前菜单修改时间
     */
    private Instant gmtModified;

}




