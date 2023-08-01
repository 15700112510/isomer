package com.isomer.device.service.impl;

import com.isomer.common.pojo.ApiResult;
import com.isomer.device.domain.DeviceBasic;
import com.isomer.device.service.DeviceService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author likain
 * @since 2023/7/31 10:28
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    @Override
    public ApiResult<?> register(DeviceBasic basic) {
        System.out.println(basic);
        return ApiResult.succeed();
    }
}
