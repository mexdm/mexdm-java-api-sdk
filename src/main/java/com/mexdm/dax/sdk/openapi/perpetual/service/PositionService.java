package com.mexdm.dax.sdk.openapi.perpetual.service;


import com.mexdm.dax.sdk.openapi.perpetual.domain.CurrentPosition;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public interface PositionService {
    /**
     *获取用户仓位列表
     * @return
     * @throws IOException
     */
    List<CurrentPosition> list() throws IOException;
}
