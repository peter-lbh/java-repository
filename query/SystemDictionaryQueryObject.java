package com.xmg.p2p.base.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.util.StringUtils;

/**
 * 数据字典分类和数据字典明细共同的查询对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SystemDictionaryQueryObject extends QueryObject {
    private String keyWord;//根据关键字查询
    private Long parentId;

    /**
     * 因为刚点击都相当于查询了一次，关键字什么的会为空字符串，为了对应mapper的查询
     * 还有页面回显方法，因为freemaker 属性为null要显示为空字符串
     */
    public String getKeyWord(){
        return this.keyWord = StringUtils.hasLength(keyWord)?keyWord:null;

    }
}
