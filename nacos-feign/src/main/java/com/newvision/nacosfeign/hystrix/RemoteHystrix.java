/**
 * Project Name: alibabCloudRobot
 * File Name: RemoteHystrix
 * Package Name: com.newvision.nacosfeign.hystrix
 * Date: 2020/10/14 4:27 下午
 * Copyright (c) 2020,All Rights Reserved.
 */

package com.newvision.nacosfeign.hystrix;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: XM
 * @Date: Created in 4:27 下午 2020/10/14
 * @Modified By:
 */
@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}

