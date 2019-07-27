package com.xmg.p2p.base.query;

import lombok.Data;


/**
 * 所有高级查询共有属性的父类
 * 为什么设定默认值，这样刚点登录记录时其实就查询了一次，不写默认值
 * 下面start的值没有，会报错的，所以在前端页面点击查询时，提交前也会设置currentPage的值为1
 * 不然mvc注入currentPage这个值为空，顶掉原来默认值，还是会报错
 */
@Data
public class QueryObject {
    protected int currentPage = 1;//默认当前页数为1，后期前端通过分页点击会提交一个currentPage来改变这属性
    protected int pageSize = 5;//设计mapper查询使用Limit时通过这个值来定义每页显示的页数
    /**
     * 在sql用limit查询时，跳过的条数
     * 定义为get开头的方法利用el表达式的特性
     */
    public int getStart(){

        return (currentPage-1)*pageSize;
    }
}
