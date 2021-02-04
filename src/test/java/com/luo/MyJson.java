package com.luo;

import com.alibaba.fastjson.JSON;
import com.luo.entity.User;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class MyJson {
    public static String jsonmap = "{\"001\":{\"name\":\"xiaohong\",\"password\":\"654321\"},\"002\":[{\"$ref\":\"$.001\"},{\"name\":\"xixi\",\"password\":\"789\"}]}";
    public static String jsonuser = "{\"name\":\"xiaohong\",\"password\":\"654321\"}";
    public static String jsonlist = "[{\"name\":\"xiaohong\",\"password\":\"654321\"},{\"name\":\"xixi\",\"password\":\"789\"}]";

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("xiaohong");
        user1.setPassword("654321");

        User user2 = new User();
        user2.setName("xiaoluo");
        user2.setPassword("112233");

        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);


        Map<String,Object> map = new HashMap();
        map.put("001", user1);
        map.put("002", list);

        System.out.println(user1);
        System.out.println(list);
        System.out.println(map);

        // toJsonString  - java对象转换为json字符串
        System.out.println(JSONObject.toJSONString(user1));
        System.out.println(JSONObject.toJSONString(list));
        System.out.println(JSONObject.toJSONString(map));

        System.out.println("---------------------------------------");

        System.out.println(JSONObject.parseObject(jsonuser,User.class));

        System.out.println("---------------------------------------");

        List list1 = JSONObject.parseObject(jsonlist, List.class);
        for(int i=0;i<list1.size();i++) {
            System.out.println(JSONObject.parseObject(JSONObject.toJSONString(list1.get(i)),User.class));
        }
        Map map1 = JSONObject.parseObject(jsonmap, Map.class);
        Iterator iterator = map1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.println("key :"+entry.getKey()+"   value: " + entry.getValue());
        }

        System.out.println("Json  -- 实体类转换为json字符串");

        // Json  -- 实体类转换为json字符串
        System.out.println(JSON.toJSONString(user1));
        System.out.println(JSON.toJSONString(list));
        System.out.println(JSON.toJSONString(map));

        System.out.println("json  -- json 转 java对象");
        // json  -- json 转 java对象
        System.out.println(JSON.parseObject(jsonuser,User.class));
        List list2 = JSON.parseObject(jsonlist, List.class);
        for(int i=0;i<list2.size();i++) {
            System.out.println(JSON.parseObject(JSON.toJSONString(list1.get(i)),User.class));
        }
        Map map2 = JSON.parseObject(jsonmap, Map.class);
        Iterator iterator2 = map1.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry= (Map.Entry) iterator2.next();
            System.out.println("key :"+entry.getKey()+"   value: " + entry.getValue());
        }


    }
}
