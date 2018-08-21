package pei.java.spring.lab.utils;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author pei
 */
public class Utils {

    static public GenericXmlApplicationContext getGenericXmlAppCtx(String... resourceLocations) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load(resourceLocations);
        ctx.refresh();
        return ctx;
    }

}
