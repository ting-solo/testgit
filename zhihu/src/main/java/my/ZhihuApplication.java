package my;

import my.sys.intercepter.AuthInter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan(basePackages = "my.app.dao")
public class ZhihuApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuApplication.class, args);


    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInter()).addPathPatterns("/**")
                .excludePathPatterns("/api/user/login","/api/user/register");
    }
}
