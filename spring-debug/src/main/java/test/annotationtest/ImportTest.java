package test.annotationtest;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author ZhaoJinLiang
 * @Date 2022/4/16 3:10 下午
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyImportSelector.class)
public @interface ImportTest {
}
