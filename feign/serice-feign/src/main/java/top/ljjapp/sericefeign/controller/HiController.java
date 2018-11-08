package top.ljjapp.sericefeign.controller;
/**
 * @FileName: HiController.java
 * @Package: top.ljjapp.sericefeign.controller
 * @Author: lijiajun
 * <br/>
 * @Created: 2018/11/8 11:20
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.ljjapp.sericefeign.service.SchedualServiceHi;

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
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;//编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClient( name );
    }
}