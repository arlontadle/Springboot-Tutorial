package myproject.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class I18nUtil {

    private static MessageSource messageSource;

    @Autowired
    I18nUtil(MessageSource messageSource) {
        I18nUtil.messageSource = messageSource;
    }

    public static String get(String msgKey) {
        //源代码
//        try {
//            return messageSource.getMessage(msgKey, null, Locale.CHINA);
//        } catch (Exception e) {
//            return msgKey;
//        }
        // 老版本
        //更新后
//        Locale locale = LocaleContextHolder.getLocale();
//        System.out.println(locale+"获取");

        // 直接设置us
        // return messageSource.getMessage(msgKey, null, Locale.US);

        // 新版本
        if (BaseContextHandler.getMessagesproperties().equals("zh_CN")) {
            return messageSource.getMessage(msgKey, null, Locale.CHINA);
        } else {
            return messageSource.getMessage(msgKey, null, Locale.US);
        }

    }

}
