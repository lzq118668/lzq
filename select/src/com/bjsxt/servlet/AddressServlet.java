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


@WebServlet("/address")
public class AddressServlet  extends HttpServlet{
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  resp.setCharacterEncoding("utf-8");
    	  resp.setContentType("application/json;charset=utf-8");
    	 
    	 Map<String , String >  map=new HashMap<>();
    	  Map<String , String >  map2=new HashMap<>();
    	  Map<String , String >  map3=new HashMap<>();
    	  map.put("name", "北京");
    	  map.put("pid", "1");
    	  
    	  map2.put("name", "上海");
    	  map2.put("pid", "2");
          
    	  map3.put("name", "山西");
    	  map3.put("pid", "3");
    	  
    	  List<Map<String, String>> list=new ArrayList<>();
    	  list.add(map);
    	  list.add(map2);
    	  list.add(map3);
    	  
    	  String json = new Gson().toJson(list);
    	  System.out.println(json);
    	  resp.getWriter().print(json);
      }
}
