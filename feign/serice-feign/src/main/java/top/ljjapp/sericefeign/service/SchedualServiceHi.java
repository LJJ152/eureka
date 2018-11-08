package top.ljjapp.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FileName: SchedualServiceHi.java
 * @Package: top.ljjapp.sericefeign.service
 * @Author: lijiajun
 * <br/>
 * @Created: 2018/11/8 11:17
 */

@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @GetMapping(value = "/hi")
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
