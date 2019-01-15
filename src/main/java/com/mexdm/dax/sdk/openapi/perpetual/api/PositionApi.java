package com.mexdm.dax.sdk.openapi.perpetual.api;

import com.mexdm.dax.sdk.openapi.perpetual.domain.CurrentPosition;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public interface PositionApi {
    /**
     * 获取持仓列表
     *
     * @return
     */
    @GET("perpetual/position/list-all")
    Call<List<CurrentPosition>> list();
}
