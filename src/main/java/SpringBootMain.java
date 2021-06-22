import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import java.util.TimeZone;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import cronapp.framework.boot.CronappInitializer;

@SpringBootApplication
@ComponentScan(basePackages = { "cronapp.framework.authentication.token", "cronapp.framework.authentication.security", "cronapp.framework.rest", "cronapp.framework.scheduler", "auth.permission", "api.rest.events", "api.rest.webservices", "reports", "cronapi", "blockly", "app" })
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class SpringBootMain extends CronappInitializer {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootMain.class, args);
    }
}
