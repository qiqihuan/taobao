package com.user.account.entity.util.page;


import java.io.Serializable;

/**
 * <p>
 * 封装前端提交分页条件
 * </p>
 *
 * @author:qiqihuan
 * @since:2020/9/8
 * @version:1.0.0
 */
public class PageCondition implements Serializable {

    private static final long serialVersionUID = -2287052227961811819L;
    /**
     * 第几页
     */
    private Integer pageNumber;

    /**
     * 每页多少条数据
     */
    private Integer pageSize;

    /**
     * 是否是回收站数据
     *  -hasRemove为true的时候表示是回收站数据
     *  -hasRemove为false的时候表示不是回收站数据
     */
    private Boolean hasRemove;


    public PageCondition() {
    }

    public PageCondition(Integer pageNumber, Integer pageSize, Boolean hasRemove) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.hasRemove = hasRemove;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getHasRemove() {
        return hasRemove;
    }

    public void setHasRemove(Boolean hasRemove) {
        this.hasRemove = hasRemove;
    }

    @Override
    public String toString() {
        return "PageCondition{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", hasRemove=" + hasRemove +
                '}';
    }
}
