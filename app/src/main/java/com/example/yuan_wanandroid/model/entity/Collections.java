package com.example.yuan_wanandroid.model.entity;

import java.util.List;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/27
 *     desc   : 收藏列表
 * </pre>
 */


public class Collections {
            /**
            * curPage : 1
            * datas : []
            * offset : 0
            * over : true
            * pageCount : 1
            * size : 20
            * total : 3
            */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<Collection> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Collection> getDatas() {
        return datas;
    }

    public void setDatas(List<Collection> datas) {
        this.datas = datas;
    }
}
