package com.user.account.entity.util.page;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 分页的信息
 * </p>
 *
 * @author:wells
 * @since:2020/9/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfoVO<T> implements Serializable {

    private static final long serialVersionUID = 1051754754571411645L;
    /**
     * 当前页数据
     */
    private List<T> pageList;

    /**
     * 当前页码
     */
    private Integer currentPageNumber;

    /**
     * 总页码
     */
    private Integer totalPage;

    /**
     * 当前页包含的条数
     */
    private Integer currentPageSize;

    /**
     * 总条数
     */
    private Integer totalSize;

    /**
     * 当前页起始位置
     */
    private Integer beginIndex;

    /**
     * 当前页终止位置
     */
    private Integer endIndex;

    /**
     * 是否是被移除的数据
     */
    private Boolean hasRemove;

}
