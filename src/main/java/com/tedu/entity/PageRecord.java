package com.tedu.entity;

import java.util.Objects;

/**
 * 封装分页查询结果的实体类
 */
public class PageRecord<T> {

    private Integer pageSize; // 每页数据条数
    private Integer count; // 总数据条数
    private Integer pageCount; // 总页数
    private Integer currentPage; // 当前页码
    private T data; // 当前页数据

    public PageRecord() {
    }

    public PageRecord(Integer pageSize, Integer count, Integer pageCount, Integer currentPage, T data) {
        this.pageSize = pageSize;
        this.count = count;
        this.pageCount = pageCount;
        this.currentPage = currentPage;
        this.data = data;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageRecord<?> that = (PageRecord<?>) o;
        return Objects.equals(pageSize, that.pageSize) &&
                Objects.equals(count, that.count) &&
                Objects.equals(pageCount, that.pageCount) &&
                Objects.equals(currentPage, that.currentPage) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageSize, count, pageCount, currentPage, data);
    }

    @Override
    public String toString() {
        return "PageRecord{" +
                "pageSize=" + pageSize +
                ", count=" + count +
                ", pageCount=" + pageCount +
                ", currentPage=" + currentPage +
                ", date=" + data +
                '}';
    }
}
