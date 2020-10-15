/**
 * Project Name: alibabCloudRobot
 * File Name: RemoteClient
 * Package Name: com.newvision.nacosfeign.hystrix
 * Date: 2020/10/14 4:28 下午
 * Copyright (c) 2020,All Rights Reserved.
 */

package com.newvision.nacosfeign.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: XM
 * @Date: Created in 4:28 下午 2020/10/14
 * @Modified By:
 */
@FeignClient(name = "nacos-provide",fallback = RemoteHystrix.class)
public interface RemoteClient {

    @GetMapping("/helloNacos")
    String helloNacos();
}

