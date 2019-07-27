package com.xmg.p2p.base.utils;

import com.xmg.p2p.base.domain.LoginInfo;
import com.xmg.p2p.base.vo.VerifyCodeVo;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * 用于管理用户登录信息的Session管理
 * session相关的调用应该出现在controller层
 */
public class UserContext {
    /* 定义一个绑定用户信息的session的name（常量）*/
    public static final String USERINFO_IN_SESSION = "logininfo";
    /*绑定验证码等信息的常量*/
    public static final String VERIFYCODEVO_IN_SESSION = "verifyCode";

    /* 利用ruquestContextHolder 这个类获取请求的session
       使用springMVC的requestcontext来获取requestcontext进而获取session必须配置监听器来捕捉requestcontext */
    private static HttpSession getSession(){
       return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
    }
    /* 绑定用户登录信息到session对象*/

    public static void putCurrent(LoginInfo loginInfo){
        getSession().setAttribute(UserContext.USERINFO_IN_SESSION,loginInfo);
    }
    /* 用于其他业务中获取登录过的session信息*/
    public static LoginInfo getCurrent(){
        return (LoginInfo) getSession().getAttribute(UserContext.USERINFO_IN_SESSION);
    }
    /* 绑定验证码和手机等信息到session对象*/

    public static void putVerifyCodeVo(VerifyCodeVo verifyCodeVo){
        getSession().setAttribute(UserContext.VERIFYCODEVO_IN_SESSION,verifyCodeVo);
    }
    public static VerifyCodeVo getVerifyCodeVo(){
        return (VerifyCodeVo)(getSession().getAttribute(UserContext.VERIFYCODEVO_IN_SESSION));
    }

}
