package Config;

import Entity.Corporation;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotatedTypeMetadata;


@Order
public class CorporationCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        String[] beanNamesForType = beanFactory.getBeanNamesForType(Corporation.class);
        boolean b = beanNamesForType != null && beanNamesForType.length > 0;
        return b;
    }
}
