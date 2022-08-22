package com.yuan.mytest;

/**
 * @author wl
 * @date 2022-08-08
 */
public class CurCountVo {

    /**
     * 名称
     */
    private String name;

    /**
     * 数量
     */
    private Integer totalCount;

    public CurCountVo(String name, Integer totalCount) {
        this.name = name;
        this.totalCount = totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "CurCountVo{" +
                "name='" + name + '\'' +
                ", totalCount=" + totalCount +
                '}';
    }
}
