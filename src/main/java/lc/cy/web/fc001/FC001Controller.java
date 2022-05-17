package lc.cy.web.fc001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称： <br>
 * 类描述： <br>
 *
 * @Date: 2022/05/17 17:11 <br>
 * @author: liuchen11
 */
@RestController
@RequestMapping("/fc001")
public class FC001Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello FC001.";
    }
}
