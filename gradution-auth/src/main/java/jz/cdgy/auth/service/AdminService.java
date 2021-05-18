package jz.cdgy.auth.service;

import jz.cdgy.common.model.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "admin")
public interface AdminService {

    @GetMapping("/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
