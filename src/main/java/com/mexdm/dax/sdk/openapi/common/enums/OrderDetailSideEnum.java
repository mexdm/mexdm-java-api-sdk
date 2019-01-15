package com.mexdm.dax.sdk.openapi.common.enums;

import com.mexdm.dax.sdk.openapi.perpetual.enums.OrderSideEnum;
import lombok.AllArgsConstructor;

/**
 * 订单的做多做空方向：多为买或平卖，空为卖或者平买
 * @author newex-team
 * @date 2019-01-09
 */
@AllArgsConstructor
public enum OrderDetailSideEnum {
  // 开多
  OPEN_LONG("open_long"),
  // 开空
  OPEN_SHORT("open_short"),
  // 平多
  CLOSE_LONG("close_long"),
  // 平空
  CLOSE_SHORT("close_short"),
  ;

  private final String side;

  public static OrderSideEnum getOrderSideEnum(final String side) {
    if (OPEN_LONG.side.equals(side) || CLOSE_SHORT.side.equals(side)) {
      return OrderSideEnum.LONG;
    } else if (OPEN_SHORT.side.equals(side) || CLOSE_LONG.side.equals(side)) {
      return OrderSideEnum.SHORT;
    }
      return null;
  }

  /**
   * 判断是否为开仓
   *
   * @param side
   * @return
   */
  public static boolean isOpen(final String side) {
    if (side.equals(OrderDetailSideEnum.OPEN_LONG.getSide())
        || side.equals(OrderDetailSideEnum.OPEN_SHORT.getSide())) {
      return true;
    }
    return false;

  }

  /**
   * 判断是否为平仓
   *
   * @param side
   * @return
   */
  public static boolean isClose(final String side) {
    if (side.equals(OrderDetailSideEnum.CLOSE_LONG.getSide())
        || side.equals(OrderDetailSideEnum.CLOSE_SHORT.getSide())) {
      return true;
    }
    return false;
  }

  public String getSide() {
    return this.side;
  }
}
