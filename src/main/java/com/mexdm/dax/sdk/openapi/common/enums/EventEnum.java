package com.mexdm.dax.sdk.openapi.common.enums;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public enum EventEnum {

    /**
     * 登录
     */
    SIGNIN("signin"),
    /**
     * 订阅
     */
    SUBSCRIBE("subscribe"),
    /**
     * 取消订阅
     */
    UNSUBSCRIBE("unsubscribe");

    private final String typeName;

    EventEnum(final String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }

}
