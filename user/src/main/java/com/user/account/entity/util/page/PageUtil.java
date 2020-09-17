package com.user.account.entity.util.page;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 分页工具
 * </p>
 *
 * @author:wells
 * @since:2020/9/8
 */
@Component
public class PageUtil<T> {

    public PageInfoVO<T> pageSplit(List<T> tList, PageCondition pageCondition) {
        return pageSplit(tList, pageCondition.getPageNumber(), pageCondition.getPageSize(), pageCondition.getHasRemove());
    }


    public PageInfoVO<T> pageSplit(List<T> tList, int page, int size) {
        return pageSplit(tList, page, size, null);
    }


    public PageInfoVO<T> pageSplit(List<T> tList, int currentPageNumber, int currentPageSize, Boolean hasRemove) {
        if (tList == null || tList.size() == 0)
            throw new NullPointerException("集合为空");
        if (currentPageNumber == 0)
            throw new NullPointerException("页码为0");
        if (currentPageSize == 0)
            throw new NullPointerException("页码中的数据为0");
        int totalSize = tList.size();
        int beginIndex = 0;
        int endIndex = 0;
        int totalPage = 0;

        // 计算总共有多少页
        totalPage = totalSize / currentPageSize;
        if (totalSize % currentPageSize != 0) {
            totalPage += 1;
        }
        beginIndex = (currentPageNumber - 1) * currentPageSize;
        endIndex = beginIndex + currentPageSize;
        // 将数据封装到PageInfoVO中
        PageInfoVO<T> pageInfoVO;
        if (currentPageNumber == totalPage)
            pageInfoVO = new PageInfoVO<T>(tList.subList(beginIndex, totalSize),
                    currentPageNumber, totalPage, currentPageSize, totalSize, beginIndex, endIndex, hasRemove);
        else
            pageInfoVO = new PageInfoVO<T>(tList.subList(beginIndex, endIndex),
                    currentPageNumber, totalPage, currentPageSize, totalSize, beginIndex, endIndex, hasRemove);

        return pageInfoVO;
    }
}
