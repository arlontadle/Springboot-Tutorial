package myproject.util;

import java.util.HashMap;
import java.util.Map;

public class BaseContextHandler {

    public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();

    // public  static FastThreadLocal<Map<String,Object>> fastThreadLocal= new FastThreadLocal<>();
    public static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        map.put(key, value);
    }

    public static Object get(String key) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        return map.get(key);
    }

    public static String getUserID() {
        Object value = get(ProjectConstant.CONTEXT_KEY_USER_ID);
        return returnObjectValue(value);
    }

    public static String getUsername() {
        Object value = get(ProjectConstant.CONTEXT_KEY_USERNAME);
        return returnObjectValue(value);
    }

    public static String getToken() {
        Object value = get(ProjectConstant.CONTEXT_KEY_USER_TOKEN);
        return String.valueOf(value);
    }

    public static String getOperatorIp(){
        Object value = get(ProjectConstant.CURRENT_KEY_OPERATOR_IP);
        return returnObjectValue(value);
    }

    public static void setToken(String token) {
        set(ProjectConstant.CONTEXT_KEY_USER_TOKEN, token);
    }

    public static void setUserID(String userID) {
        set(ProjectConstant.CONTEXT_KEY_USER_ID, userID);
    }

    public static void setOperatorIp(String ipAddr) {
        set(ProjectConstant.CURRENT_KEY_OPERATOR_IP , ipAddr);
    }

    public static void setWtUserId(String codeUserId) {
        set(ProjectConstant.CONTEXT_KEY_STY_USER_ID, codeUserId);
    }

    public static Long getWtUserId() {
        Object value = get(ProjectConstant.CONTEXT_KEY_STY_USER_ID);
        if (null == value) {
            return null;
        }
        String s = returnObjectValue(value);
        return Long.parseLong(s);
    }

    public static void setUsername(String username) {
        set(ProjectConstant.CONTEXT_KEY_USERNAME, username);
    }

    private static String returnObjectValue(Object value) {
        return value == null ? null : value.toString();
    }

    public static void remove() {
        threadLocal.remove();
    }


    public static void setMessagesproperties(String acceptLanguage) {
        set(ProjectConstant.SETMESSAGESPROPERTIES, acceptLanguage);
    }

    public static String getMessagesproperties() {
        Object value = get(ProjectConstant.SETMESSAGESPROPERTIES);
        return String.valueOf(value);
    }

}
