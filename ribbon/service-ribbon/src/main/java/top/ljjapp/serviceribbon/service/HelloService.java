package top.ljjapp.serviceribbon.service;
/**
 * @FileName: HelloService.java
 * @Package: top.ljjapp.serviceribbon.service
 * @Author: lijiajun
 * <br/>
 * @Created: 2018/11/8 10:46
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
    }
}