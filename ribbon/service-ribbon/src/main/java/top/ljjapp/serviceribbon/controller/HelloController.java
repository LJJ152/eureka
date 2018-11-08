package top.ljjapp.serviceribbon.controller;
/**
 * @FileName: HelloController.java
 * @Package: top.ljjapp.serviceribbon.controller
 * @Author: lijiajun
 * <br/>
 * @Created: 2018/11/8 10:48
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.ljjapp.serviceribbon.service.HelloService;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR> 修改记录
 * <BR>-----------------------------------------------
 * <BR> 修改日期 修改人 修改内容
 * </PRE>
 *
 * @author lijiajun
 */

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}