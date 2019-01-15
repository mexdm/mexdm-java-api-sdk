package com.mexdm.dax.sdk.openapi.common.enums;

import lombok.Getter;

/**
 *
 * @author mexdm-sdk-team
 * @date 2019-01-15
 */
@Getter
public enum SupportedLocaleEnum {
    EN_US("en-US", "English"),
    ZH_CN("zh-CN", "Simplified chinese"),
    ZH_TW("zh-TW", "Traditional chinese");

    private final String name;
    private final String comment;

    SupportedLocaleEnum(final String name, final String comment) {
        this.name = name;
        this.comment = comment;
    }
}
