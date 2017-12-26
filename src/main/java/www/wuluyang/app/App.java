package www.wuluyang.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages="www.wuluyang.com")//扫描包
@EnableAutoConfiguration
public class App {
public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
}
