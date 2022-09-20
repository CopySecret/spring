package test.beanfactoryprocessor;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author ZhaoJinLiang
 * @Date 2022/4/15 2:43 下午
 */
@Component
public class BeanB {

	private final static String str = "1234";

	@PostConstruct
	public void init(){
		System.out.println("PostConstruct ---------------");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("PreDestroy ---------------");
	}
}
