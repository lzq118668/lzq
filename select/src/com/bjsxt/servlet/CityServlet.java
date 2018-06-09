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
@WebServlet("/city")
public class CityServlet  extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  resp.setCharacterEncoding("utf-8");
    	  resp.setContentType("application/json;charset=utf-8");
    	int i=Integer.parseInt(req.getParameter("pid"));
    	 Map<String , String >  map=new HashMap<>();
    	  Map<String , String >  map2=new HashMap<>();
    	  Map<String , String >  map3=new HashMap<>();
    	  List<Map<String, String>> list=new ArrayList<>();
    	  if(i==1) {
    		  map.put("name", "北京");
        	  map.put("cid", "11");
        	  list.add(map);
    	  }else if(i==2) {
    		  map2.put("name", "上海");
        	  map2.put("cid", "22");
        	  list.add(map2);
    		  
    	  }else if(i==3) {
    		  map.put("name", "太原");
        	  map.put("cid", "31");
        	  
        	  map2.put("name", "运城");
        	  map2.put("cid", "32");
              
        	  map3.put("name", "大同");
        	  map3.put("cid", "33");
        	  
        	  list.add(map);
        	  list.add(map2);
        	  list.add(map3);
    	  }
    	  
    	  
    	  
    	  String json = new Gson().toJson(list);
    	 // System.out.println(json);
    	  resp.getWriter().print(json);

      	System.out.println(json);
    }
}
