package com.mexdm.dax.sdk.openapi.perpetual;

import com.alibaba.fastjson.JSON;
import com.mexdm.dax.sdk.openapi.perpetual.domain.CurrentPosition;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public class PositionServiceTest extends BaseTest {

    @Test
    public void testList() throws IOException {

        final List<CurrentPosition> result = this.mexdmRestClient.perpetual().ccex().position()
                .list();
        System.out.println(JSON.toJSONString(result));
    }
}
