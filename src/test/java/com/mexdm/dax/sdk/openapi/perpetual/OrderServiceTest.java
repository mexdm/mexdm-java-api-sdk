package com.mexdm.dax.sdk.openapi.perpetual;

import com.alibaba.fastjson.JSON;
import com.mexdm.dax.sdk.openapi.common.enums.OrderDetailSideEnum;
import com.mexdm.dax.sdk.openapi.perpetual.domain.DepthOrderBook;
import com.mexdm.dax.sdk.openapi.perpetual.domain.OrderBook;
import com.mexdm.dax.sdk.openapi.perpetual.domain.OrderRequest;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public class OrderServiceTest extends BaseTest {


    private static final String contractCode = "ethusd";

    @Test
    public void testList() throws IOException {

        final List<OrderBook> result = this.mexdmRestClient.perpetual().ccex().order()
                .list(contractCode);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void testOpenLongOrder() throws IOException {
        final OrderRequest request = OrderRequest.builder().type(10).side(OrderDetailSideEnum.OPEN_LONG.getSide()).price(new BigDecimal(89))
                .beMaker(0).amount(new BigDecimal(5000)).build();
        final Map result = this.mexdmRestClient.perpetual().ccex().order()
                .postOrder(contractCode, request);
        System.out.println(result);
    }

    @Test
    public void testOpenShortOrder() throws IOException {
        final OrderRequest request = OrderRequest.builder().type(10).side(OrderDetailSideEnum.OPEN_SHORT.getSide()).price(new BigDecimal(85))
                .beMaker(0).amount(new BigDecimal(5000)).build();
        final Map result = this.mexdmRestClient.perpetual().ccex().order()
                .postOrder(contractCode, request);
        System.out.println(result);
    }

    @Test
    public void testDeleteOrder() throws IOException {
        this.mexdmRestClient.perpetual().ccex().order().deleteOrder(contractCode, 760L);
    }

    @Test
    public void testDeleteOrders() throws IOException {
        this.mexdmRestClient.perpetual().ccex().order().deleteOrders(contractCode);
    }

    @Test
    public void testGetOrder() throws IOException {
        final OrderBook orderBook = this.mexdmRestClient.perpetual().ccex().order().getOrder(contractCode, 39352L);
        System.out.println(orderBook);
    }

    @Test
    public void testDepth() throws IOException {
        final DepthOrderBook depthOrderBook = this.mexdmRestClient.perpetual().ccex().order().depth(contractCode, 100);
        System.out.println(JSON.toJSONString(depthOrderBook));
    }
}
