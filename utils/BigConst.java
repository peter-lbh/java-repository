package com.xmg.p2p.base.utils;

import java.math.BigDecimal;

/**
 * 系统相关常量
 */
public class BigConst {
    /**
     * 储存精度
     */
    public static final int STOCK_CONST = 4;
    /**
     * 运算精度
     */
    public static final int COUNT_CONST = 8;
    /**
     * 显示精度
     */
    public static final int SHOW_CONST = 2;

    /**
     * 自定义的0元
     */
    public static final BigDecimal BIG_DECIMAL_ZERO = new BigDecimal(0000.0000);
    /**
     * 定义初始5000的额度，显示小数后4位
     */
    public static final BigDecimal BIG_DECIMAL_BORROWLIMIT = new BigDecimal(5000.0000);

    /**
     * 超级管理员的默认用户名
     */
    public static final String MANAGER_USERNAME = "admin";

    /**
     * 超级管理员的默认密码
     */
    public static final String MANAGER_PASSWOERD = "1111";

    /**
     * 发送验证码的时间间隔
     */
    public static final int VERIFYCODE_INTERVAL_TIME = 90;

    /**
     * 验证码有效期
     */
    public static final int VERIFYCODE_VALIDATE_TIME = 90;
    /**
     * 邮箱绑定链接有效器期
     */
    public static final int EMAIL_VALIDATE_TIME = 5;

    /**
     * 信用贷认证后可用金额
     */
    public static final BigDecimal AUTH_CAN_BORROW = new BigDecimal(5000.00);

    /**
     * 材料认证分数要求
     */
    public static final int DATA_AUTH_SCORE = 30;
    /**
     * 访问slaveds数据
     */
    public static final String SLAVE_DS = "slaveds";

    /**
     * 访问主数据库
     */
    public static final String MASTER_DS = "masterds";

    /**
     * 存放图片的公共文件夹
     */


}
