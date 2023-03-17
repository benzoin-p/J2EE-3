package Config;

import Entity.Corporation;
import Entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

    @Bean
    Corporation corporation()
    {
        return new Corporation();
    }

    @Bean
    @Conditional(value = CorporationCondition.class)
    Employee employee()
    {
        return new Employee();
    }
}
