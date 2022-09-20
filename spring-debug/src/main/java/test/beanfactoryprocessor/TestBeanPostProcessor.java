package test.beanfactoryprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author ZhaoJinLiang
 * @Date 2022/4/28 10:15 上午
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
}
