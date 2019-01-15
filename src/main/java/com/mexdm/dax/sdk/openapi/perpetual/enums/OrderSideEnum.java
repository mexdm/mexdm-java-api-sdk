package com.mexdm.dax.sdk.openapi.perpetual.enums;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单的做多做空方向：多为买或平卖，空为卖或者平买
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
@AllArgsConstructor
public enum OrderSideEnum {
    LONG("long", (o1, o2) -> {
        // 买单价格小于卖单价格，价格没有交叉
        return o1.compareTo(o2);
    }), // 做多
    SHORT("short", (o1, o2) -> {
        // 买单价格小于卖单价格，价格没有交叉
        return o2.compareTo(o1);
    }), // 做空
    ;

    private static final Map<String, OrderSideEnum> SIDE_MAP = new HashMap<>();

    static {
        for (final OrderSideEnum orderSideEnum : OrderSideEnum.values()) {
            SIDE_MAP.put(orderSideEnum.side, orderSideEnum);
        }
    }

    private final String side;
    private final Comparator<BigDecimal> priceComparator;

    public static Comparator<BigDecimal> getPriceComparator(final String side) {
        final OrderSideEnum orderSideEnum = SIDE_MAP.get(side);
        return orderSideEnum == null ? null : orderSideEnum.priceComparator;
    }

    public String getSide() {
        return this.side;
    }
}
