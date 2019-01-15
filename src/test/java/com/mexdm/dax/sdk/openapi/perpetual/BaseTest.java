package com.mexdm.dax.sdk.openapi.perpetual;

import com.mexdm.dax.sdk.openapi.client.MexdmRestClient;
import com.mexdm.dax.sdk.openapi.common.domain.ClientParameter;
import com.mexdm.dax.sdk.openapi.common.enums.SupportedLocaleEnum;
import org.junit.After;
import org.junit.Before;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public class BaseTest {

    /**
     * 用户 apiKey
     */
    private final String apiKey = "mdm-313ae07b1b61aeb083891e5f14c99d1f";
    /**
     * 用户 secretKey
     */
    private final String secretKey = "0185995605b2a5ee2430a5a962d76d5ed97168e707f350e067c89446f1812139";
    /**
     * 口令
     */
    private final String passphrase = "111111";
    /**
     * ccex open api 根路径
     */
    private final String baseUrl = "http://daily.mdm.com/api/v1/";
    private final ClientParameter parameter = ClientParameter.builder()
            .apiKey(this.apiKey)
            .secretKey(this.secretKey)
            .passphrase(this.passphrase)
            .baseUrl(this.baseUrl)
            .locale(SupportedLocaleEnum.EN_US.getName())
            .build();
    MexdmRestClient mexdmRestClient;

    @Before
    public void setup() {
        this.mexdmRestClient = MexdmRestClient.builder()
                .configuration(this.parameter)
                .build();
    }

    @After
    public void tearDown() {

    }
}
