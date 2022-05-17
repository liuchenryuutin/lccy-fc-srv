package lc.cy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

/**
 * 类名称： <br>
 * 类描述： <br>
 *
 * @Date: 2022/05/17 17:08 <br>
 * @author: liuchen11
 */
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        log.info("Begin to starting the xxxx......");
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        log.info("The xxxx started!......{}", context.getApplicationName());
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }
}
