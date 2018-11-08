package top.ljjapp.sericefeign.service;/**
 * @FileName: SchedualServiceHiHystric.java
 * @Package: top.ljjapp.sericefeign.service
 * @Author: lijiajun
 * <br/>
 * @Created: 2018/11/8 11:43
 */

import org.springframework.stereotype.Component;

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

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClient(String name) {
        return "sorry "+name;
    }
}