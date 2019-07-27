package com.xmg.p2p.base.utils;

/**
 * 用户状态类，记录用户在平台使用系统中所有的状态。
 * 
 * @author Administrator
 */
public class BitStatesUtils {
	public final static Long OP_BIND_PHONE = 1L << 0; // 用户绑定手机状态码
	public final static Long OP_BIND_EMAIL = 1L << 1; // 用户绑定邮箱
	public final static Long OP_BLIND_BASICINFO = 1L<<2;//基本信息状态的检验
	public final static Long OP_BLIND_REALAUTH = 1L<<3;//身份认证状态的校验
	public final static Long OP_BLIND_VIDEOAUTH = 1L<<4;//视频认证的状态校验


	/**
	 * @param states
	 *            所有状态值
	 * @param value
	 *            需要判断状态值
	 * @return 是否存在
	 */
	public static boolean hasState(long states, long value) {
		return (states & value) != 0;
	}

	/**
	 * @param states
	 *            已有状态值
	 * @param value
	 *            需要添加状态值
	 * @return 新的状态值
	 */
	public static long addState(long states, long value) {
		if (hasState(states, value)) {
			return states;
		}
		return (states | value);
	}

	/**
	 * @param states
	 *            已有状态值
	 * @param value
	 *            需要删除状态值
	 * @return 新的状态值
	 */
	public static long removeState(long states, long value) {
		if (!hasState(states, value)) {
			return states;
		}
		return states ^ value;
	}
}
