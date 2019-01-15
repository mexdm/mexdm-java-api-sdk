package com.mexdm.dax.sdk.openapi.perpetual.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CurrentPosition {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 是Base和Quote之间的组合 P_BTC_USDT，R_BTC_USDT1109
     */
    private String contractCode;

    /**
     * 基础货币名,如BTC、ETH
     */
    private String base;

    /**
     * 计价货币名，USD,CNY,USDT
     */
    private String quote;

    /**
     * 基础货币最小交易小数位
     */
    private Integer minTradeDigit;

    /**
     * 计价货币最小交易小数位
     */
    private Integer minQuoteDigit;

    /**
     * 0全仓，1逐仓
     */
    private Integer type;

    /**
     * 仓位类型，long多，short空
     */
    private String side;
    /**
     * 杠杆
     */
    private BigDecimal lever;
    /**
     * 成交数量
     */
    private BigDecimal closingAmount;

    /**
     * 已实现盈亏
     */
    private BigDecimal realizedSurplus;
    /**
     * 成交均价
     */
    private BigDecimal price;
    /**
     * 委托数量
     */
    private BigDecimal amount;

    /**
     * 手续费
     */
    private BigDecimal fee;
    /**
     * 开仓保证金
     */
    private BigDecimal openMargin;

    /**
     * 维持保证金
     */
    private BigDecimal maintenanceMargin;
    /**
     * 预强平价
     */
    private BigDecimal preLiqudatePrice;
    /**
     * 仓位价值
     */
    private BigDecimal size;
    /**
     * 标记价格
     */
    private BigDecimal markPrice;
    /**
     * 创建时间
     */
    private Date createdDate;

}