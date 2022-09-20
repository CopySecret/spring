package test.beanfactoryprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import test.BeansTest;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author ZhaoJinLiang
 * @Date 2022/4/15 10:37 上午
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinition beansTest = beanFactory.getBeanDefinition("beansTest");
//		((AbstractBeanDefinition)beansTest).setAutowireMode(RootBeanDefinition.AUTOWIRE_BY_TYPE);
	}
}
