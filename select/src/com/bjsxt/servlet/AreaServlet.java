package com.bjsxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
@WebServlet("/area")
public class AreaServlet  extends HttpServlet{
      @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  resp.setCharacterEncoding("utf-8");
    	  resp.setContentType("application/json;charset=utf-8");
    	int i=Integer.parseInt(req.getParameter("cid"));
    	 Map<String , String >  map=new HashMap<>();
    	  Map<String , String >  map2=new HashMap<>();
    	  Map<String , String >  map3=new HashMap<>();
    	  List<Map<String, String>> list=new ArrayList<>();
    	  if(i==11) {
    		  map.put("name", "大兴区");
        	  map.put("aid", "111");
        	  list.add(map);
        	  
        	  map2.put("name", "通州区");
        	  map2.put("aid", "112");
        	  list.add(map2);
        	  
        	  map3.put("name", "海淀区");
        	  map3.put("aid", "113");
        	  list.add(map3);
        	  
        	  
        	  
        	  
    	  }else if(i==22) {
    		  map.put("name", "静安区");
        	  map.put("aid", "221");
        	  list.add(map);
        	  
        	  map2.put("name", "普陀区");
        	  map2.put("aid", "222");
        	  list.add(map2);
        	  
        	  map3.put("name", "闵行区");
        	  map3.put("aid", "223");
        	  list.add(map3);
        	  
    		  
    	  }else if(i==31) {
    		  map.put("name", "小店区");
        	  map.put("aid", "311");
        	  list.add(map);
        	  
        	  map2.put("name", "迎泽区");
        	  map2.put("aid", "312");
        	  list.add(map2);
        	  
        	  map3.put("name", "杏花岭区");
        	  map3.put("aid", "313");
        	  list.add(map3);
        	  
    	  }else if (i==32) {
    		  map.put("name", "运城1区");
        	  map.put("aid", "321");
        	  list.add(map);
        	  
        	  map2.put("name", "运城2区");
        	  map2.put("aid", "322");
        	  list.add(map2);
        	  
        	  map3.put("name", "运城3区");
        	  map3.put("aid", "323");
        	  list.add(map3);
        	  
    	  }else if(i==33) {
    		  map.put("name", "大同1区");
        	  map.put("aid", "331");
        	  list.add(map);
        	  
        	  map2.put("name", "大同2区");
        	  map2.put("aid", "332");
        	  list.add(map2);
        	  
        	  map3.put("name", "大同3区");
        	  map3.put("aid", "333");
        	  list.add(map3);
    		  
    		  
    	  }
    		  

    	  String json = new Gson().toJson(list);
    	 // System.out.println(json);
    	  resp.getWriter().print(json);
    	  
    }
}
