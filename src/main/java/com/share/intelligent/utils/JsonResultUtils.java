package com.share.intelligent.utils;

public class JsonResultUtils   {
    public static final String MSG_FAILED="FAILED";
    public static final String MSG_SUCCESS="SUCCESS";

    /**
     *  ERROR 错误
     * @param code
     * @param msg
     * @return
     */
    public static JsonResult ERROR(int code, String msg){
        JsonResult utils = new JsonResult(code,msg);
        return utils;
    }

    /**
     * SUCCESS_DATA
     * @param data
     * @return
     */
    public static JsonResult SUCCESS_DATA(Object data){
        JsonResult utils = new JsonResult(data);
        return utils;
    }

    /**
     * CODE_MSG
     * @param code
     * @param msg
     * @return
     */
    public static JsonResult CODE_MSG(int code, String msg){
        JsonResult utils = new JsonResult(code,msg);
        return utils;
    }

    /**
     * MSG_DATA
     * @param msg
     * @param data
     * @return
     */
    public static JsonResult MSG_DATA(String msg, Object data){
        JsonResult utils = new JsonResult(msg,data);
        return utils;
    }

    /**
     * SUCCESS
     * @return
     */
    public static JsonResult SUCCESS(){
        JsonResult utils = new JsonResult();
        return utils;
    }

}
