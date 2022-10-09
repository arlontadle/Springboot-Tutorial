package miniproject.util;

public class ProjectConstant {

    public static final String BASE_PACKAGE = "com.xinhao";//生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";//生成的Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";//生成的Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//生成的Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//生成的ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";//生成的Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";//Mapper插件基础接口的完全限定名


    // 用户token信息key
    public static final String USER_TOKEN_PREFIX = "user_token_";
    public static final int USER_TOKEN_EXPIRE =  1800;//半小时
    //public static final int USER_TOKEN_EXPIRE = 60;//1天

    public static final String CONTEXT_KEY_USER_ID = "currentUserId";
    public static final String CONTEXT_KEY_USERNAME = "currentUserName";
    public static final String CONTEXT_KEY_USER_TOKEN = "currentUserToken";
    public static final String CURRENT_KEY_OPERATOR_IP ="currentOperatorIp";

    public static final String CONTEXT_KEY_STY_USER_ID = "currentWtUserId";

    public class RoleConstant{
        public static final String ADMIN = "admin";
        public static final String EDITOR = "editor";
    }

    public static final String YES = "1";
    public static final String NO = "0";



    // 用户token信息key
    public static final String WT_USER_TOKEN = "wt_user_token_";
    public static final int WT_USER_EXPIRE = 3 * 24 * 3600;//3天

    /**
     * 轮训USDT ID
     */
    public static final String WT_USDT_ACCOUNT_ID = "wt_usdt_account_id";

    public static final String SETMESSAGESPROPERTIES = "setMessagesproperties";

    /** redis websocket 订阅消息通道标识*/
    public final static String WEB_SOCKET_REDIS_CHANNEL = "brbWebsocket";
    //分页最大值
    public final static int LIMIT_MAX=2000;
}
