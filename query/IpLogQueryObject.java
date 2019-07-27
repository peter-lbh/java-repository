package com.xmg.p2p.base.query;

import com.xmg.p2p.base.utils.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * 用于查询日记的“传输对象”，封装了通过什么查询日记的属性
 * 定义这个类的属性，看页面设计和实际需求
 * 因为属性值是controller层即springMVC根据页面提交注入进来的
 * 注意：
 * 1.springMvc注入属性值时可以理解为通过set值注入，注入属性类型为日期时，必须注明日期的格式！！！！！
 * 2.注入字符串的时候必须定义空值就注入null！！！
 * 3.在使用最后时间查询的时候需要定义查询的为该日期当天最后一秒的时间
 * 4.属性对应的名字与表单中提交参数的name标签要一致
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class IpLogQueryObject extends QueryObject {
    private Date beginDate;

    private Date endDate;

    private int status=-1;

    private String username;

    private int userType=-1;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setBeginDate(Date beginDate){
        this.beginDate = beginDate;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }
    //有结束时间就默认查询到结束时间当天最后一秒，用get方法写就行，映射查询中的el表达式
    public Date getEndDate(){
        return beginDate==null?null: DateUtil.endOfDay(endDate);
    }
    //判断字符串,用框架对应的工具类,类似BeanUtils
    public String getUsername(){
        return StringUtils.hasLength(username)?username:null;
    }


}
