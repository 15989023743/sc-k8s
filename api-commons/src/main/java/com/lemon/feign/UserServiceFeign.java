package com.lemon.feign;

import com.lemon.service.IUserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "user-service")
public interface UserServiceFeign extends IUserServiceApi {
}
