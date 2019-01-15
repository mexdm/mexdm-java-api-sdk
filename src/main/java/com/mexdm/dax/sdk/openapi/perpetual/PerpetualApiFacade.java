package com.mexdm.dax.sdk.openapi.perpetual;

import com.mexdm.dax.sdk.openapi.client.ApiClient;
import com.mexdm.dax.sdk.openapi.perpetual.service.OrderService;
import com.mexdm.dax.sdk.openapi.perpetual.service.PositionService;
import com.mexdm.dax.sdk.openapi.perpetual.service.impl.OrderServiceImpl;
import com.mexdm.dax.sdk.openapi.perpetual.service.impl.PositionServiceImpl;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public class PerpetualApiFacade {
    private final ApiClient apiClient;

    public PerpetualApiFacade(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 永续 REST API Endpoint
     *
     * @return CCEXEndpoint
     */
    PerpetualEndpoint ccex() {
        return new PerpetualEndpoint(this.apiClient);
    }

    public static class PerpetualEndpoint {
        private final ApiClient apiClient;

        PerpetualEndpoint(final ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        /**
         * 永续订单服务
         */
        OrderService order() {
            return new OrderServiceImpl(this.apiClient);
        }
        /**
         * 永续持仓服务
         */
        PositionService position() {
            return new PositionServiceImpl(this.apiClient);
        }
    }

}
