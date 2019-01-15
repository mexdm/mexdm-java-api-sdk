package com.mexdm.dax.sdk.openapi.perpetual.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderSystemTypeEnum {
    // 限价
    LIMIT(10),
    // 市价
    MARKET(11),
    // 强平
    FORCED_LIQUIDATION(13),
    // 爆仓
    EXPLOSION(14),
    // 对敲
    CONTRA_TRADE(15),
    ;

    private final int systemType;

    public int getSystemType() {
        return this.systemType;
    }
}
