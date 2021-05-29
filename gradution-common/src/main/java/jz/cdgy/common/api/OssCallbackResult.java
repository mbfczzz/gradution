package jz.cdgy.common.api;

import lombok.Data;

@Data
public class OssCallbackResult {
    private String filename;
    private String size;
    private String mimeType;
    private String width;
    private String height;
}
