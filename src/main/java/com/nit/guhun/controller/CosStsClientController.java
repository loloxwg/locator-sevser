package com.nit.guhun.controller;


import com.nit.guhun.utils.AcmeProperties;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;

@RestController
@RequestMapping("/cossts")
public class CosStsClientController {
    @Autowired
    private AcmeProperties acmeProperties;

    @ResponseBody
    @RequestMapping(method= RequestMethod.GET)
    public Object GetCredential(){
        TreeMap<String, Object> config = new TreeMap<String, Object>();

        try {
            // 替换为您的 SecretId
            config.put("SecretId", acmeProperties.getSecretId());
            // 替换为您的 SecretKey
            config.put("SecretKey", acmeProperties.getSecretKey());

            // 临时密钥有效时长，单位是秒，默认1800秒，目前主账号最长2小时（即7200秒），子账号最长36小时（即129600秒）
            config.put("durationSeconds", 1800);

            // 换成您的 bucket
            config.put("bucket", acmeProperties.getBucket());
            // 换成 bucket 所在地区
            config.put("region", acmeProperties.getRegion());

            // 这里改成允许的路径前缀，可以根据自己网站的用户登录态判断允许上传的具体路径，例子：a.jpg 或者 a/* 或者 * 。
            // 如果填写了“*”，将允许用户访问所有资源；除非业务需要，否则请按照最小权限原则授予用户相应的访问权限范围。
            config.put("allowPrefix", "img/*");

            // 密钥的权限列表。简单上传、表单上传和分片上传需要以下的权限，其他权限列表请看 https://cloud.tencent.com/document/product/436/31923
            String[] allowActions = new String[] {
                    // 简单上传
                    "name/cos:PutObject",
                    // 表单上传、小程序上传
//                    "name/cos:PostObject",
                    // 分片上传
//                    "name/cos:InitiateMultipartUpload",
//                    "name/cos:ListMultipartUploads",
//                    "name/cos:ListParts",
//                    "name/cos:UploadPart",
//                    "name/cos:CompleteMultipartUpload"
            };
            config.put("allowActions", allowActions);

            JSONObject credential = com.tencent.cloud.CosStsClient.getCredential(config);
            //成功返回临时密钥信息，如下打印密钥信息
//            System.out.println(credential);

            return credential.toMap();
        } catch (Exception e) {
            //失败抛出异常
            new IllegalArgumentException("no valid secret !");
            return e;
        }

    }
}
