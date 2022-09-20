package test.beanfactoryprocessor;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author ZhaoJinLiang
 * @Date 2022/4/20 4:49 下午
 */
//@Component
public class BeanBFactory implements FactoryBean<BeanB> {
	@Override
	public BeanB getObject() throws Exception {
		return new BeanB();
	}

	@Override
	public Class<?> getObjectType() {
		return BeanB.class;
	}
}
