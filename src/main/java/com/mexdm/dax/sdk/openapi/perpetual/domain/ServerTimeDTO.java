package com.mexdm.dax.sdk.openapi.perpetual.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mexdm-sdk-team
 * @date 2019-01-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ServerTimeDTO {
    private String epoch;
    private String iso;
    private long timestamp;
}
