package com.xmg.p2p.base.utils;
/**
 * 用于读写分离的路由分发器
 * 没向数据库请求时都有该类分配躯体访问那个数据库，会调用下面的重写的方法，所以
 * 要在方法里告诉分发器要请求的是那个数据库
 */

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class P2pRoutingDataSource extends AbstractRoutingDataSource {
    /**
     * 该方法用于告知使用那个数据库
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContext.get();
    }
}
