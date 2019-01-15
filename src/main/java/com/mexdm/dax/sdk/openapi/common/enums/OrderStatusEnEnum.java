package com.mexdm.dax.sdk.openapi.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mexdm-sdk-team
 * @date 2018/04/28
 */
public enum OrderStatusEnEnum {
    /**
     * 未成交
     */
    OPEN("open"),
    /**
     * 部分成交
     */
    PARTIALLY("partially-filled"),
    /**
     * 全部成交
     */
    FILLED("filled"),
    /**
     * 已撤单
     */
    CANCELED("canceled");

    private final String typeName;

    private OrderStatusEnEnum(final String typeName) {
        this.typeName = typeName;
    }

    public static OrderStatusEnEnum fromName(final String typeName) {
        if (StringUtils.isEmpty(typeName)) {
            return null;
        }
        for (final OrderStatusEnEnum o : OrderStatusEnEnum.values()) {
            if (o.typeName.equalsIgnoreCase(typeName)) {
                return o;
            }
        }
        return null;
    }

    public String getTypeName() {
        return this.typeName;
    }
}