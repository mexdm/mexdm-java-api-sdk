package com.mexdm.dax.sdk.openapi.perpetual.service;

import com.mexdm.dax.sdk.openapi.perpetual.domain.DepthOrderBook;
import com.mexdm.dax.sdk.openapi.perpetual.domain.OrderBook;
import com.mexdm.dax.sdk.openapi.perpetual.domain.OrderRequest;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public interface OrderService {

    List<OrderBook> list(String contractCode) throws IOException;

    DepthOrderBook depth(String contractCode, Integer size) throws IOException;

    Map postOrder(String contractCode, OrderRequest param) throws IOException;

    void deleteOrder(String contractCode, Long id) throws IOException;

    void deleteOrders(String contractCode) throws IOException;

    OrderBook getOrder(String contractCode, Long id) throws IOException;
}
