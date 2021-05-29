package jz.cdgy.common.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OssCallbackParam {
    private String callbackUrl;
    private String callbackBody;
    private String callbackBodyType;
}
