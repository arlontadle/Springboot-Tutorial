package myproject.annotations;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {
    /**
     * Excel标题
     *
     * @return
     */
    String value() default "";

    /**
     * Excel标题方式2 读取内容转表达式 (如: 1=合作商,2=渠道商,3商务)
     *
     * @return
     */
    String valueSelect() default "";

    /**
     * Excel标题方式2 读取内容转表达式 1,2,3
     *
     * @return
     */
    int valueSelectKey() default 0;

    /**
     * Excel从左往右排列位置
     *
     * @return
     */
    int col() default 0;

    /**
     * 读取内容转表达式 (如: 0=男,1=女,2=未知)
     */
    String readConverterExp() default "";

}
