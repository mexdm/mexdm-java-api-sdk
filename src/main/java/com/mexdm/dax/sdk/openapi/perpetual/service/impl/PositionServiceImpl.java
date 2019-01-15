package com.mexdm.dax.sdk.openapi.perpetual.service.impl;


import com.mexdm.dax.sdk.openapi.client.ApiClient;
import com.mexdm.dax.sdk.openapi.perpetual.api.PositionApi;
import com.mexdm.dax.sdk.openapi.perpetual.domain.CurrentPosition;
import com.mexdm.dax.sdk.openapi.perpetual.service.PositionService;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;
/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public class PositionServiceImpl implements PositionService {

    private final PositionApi positionApi;

    public PositionServiceImpl(final ApiClient client) {
        this.positionApi = client.create(PositionApi.class);
    }
    @Override
    public List<CurrentPosition> list() throws IOException {
        final Call<List<CurrentPosition>> call = this.positionApi.list();
        return call.execute().body();
    }
}
