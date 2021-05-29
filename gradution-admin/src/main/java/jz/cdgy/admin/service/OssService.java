package jz.cdgy.admin.service;

import jz.cdgy.common.api.OssCallbackResult;
import jz.cdgy.common.api.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
