package com.mexdm.dax.sdk.openapi.client;

import com.mexdm.dax.sdk.openapi.common.domain.ClientParameter;
import com.mexdm.dax.sdk.openapi.common.enums.Content;
import com.mexdm.dax.sdk.openapi.common.enums.SupportedLocaleEnum;
import com.mexdm.dax.sdk.openapi.perpetual.PerpetualApiFacade;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

/**
 * 
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
public class MexdmRestClient {
    private final ApiClient apiClient;
    private final ClientParameter configuration;

    private MexdmRestClient(final Builder builder) {
        this.configuration = builder.configuration;
        Validate.notNull(this.configuration, "configuration is null");
        Validate.notNull(this.configuration.getApiKey(), "apiKey is null");
        Validate.notNull(this.configuration.getSecretKey(), "secretKey is null");
        Validate.notNull(this.configuration.getPassphrase(), "passphrase is null");

        this.configuration.setBaseUrl(StringUtils.defaultIfBlank(this.configuration.getBaseUrl(), Content.BASE_URL));
        this.configuration.setTimeout(ObjectUtils.defaultIfNull(this.configuration.getTimeout(), Content.TIME_OUT));
        this.configuration.setLocale(ObjectUtils.defaultIfNull(this.configuration.getLocale(), SupportedLocaleEnum.EN_US.getName()));

        this.apiClient = new ApiClient(this.configuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * 永续 REST API Endpoint
     *
     * @return PerpetualApiFacade
     */
    public PerpetualApiFacade perpetual() {
        return new PerpetualApiFacade(this.apiClient);
    }

    public static class Builder {
        private ClientParameter configuration;

        public Builder configuration(final ClientParameter value) {
            this.configuration = value;
            return this;
        }

        public MexdmRestClient build() {
            return new MexdmRestClient(this);
        }
    }
}
