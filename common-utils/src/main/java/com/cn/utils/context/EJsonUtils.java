package com.cn.utils.context;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.List;
import java.util.Map;

public class EJsonUtils extends JSONObject{

    public String toString(Object o) {
        return JSON.toJSONString(o);
    }

    public Map<String, Object> toMap(String json) {
        return (Map<String, Object>) JSON.parse(json);
    }

    public <T> T toObject(String json ,Class<T> clz) {
        return JSON.parseObject(json, clz);
    }

    public <T> List<T> toObjectArray(String json , Class<T> clz) {
        return JSONObject.parseArray(json,clz);
    }

}
