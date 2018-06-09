<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/select.js"></script>
<script type="text/javascript">
   window.onload= function () {
	  sendAjax("get","address", function (result) {
		  //console.info(result);
		    var prv=JSON.parse(result);
		    for (var i = 0; i < prv.length; i++) {
			   var op=	new Option(prv[i].name,prv[i].pid);
			   //console.info(prv);
			    $("province").options.add(op);
			}
	  });
	  $("province").onchange= function () {
		    sendAjax("get","city?pid="+this.value, function (result) {
				 var city=JSON.parse(result);
				 $("city").options.length=1;
				 $("area").options.length=1;
				// console.info(city);
				 for(var i=0;i<city.length;i++){
					 //console.info(city[0].name+"  " +city[0].cid);
					 var op=new Option(city[i].name,city[i].cid);
					 $("city").options.add(op);
				 }
			});
	 }
	  
	  $("city").onchange= function () {
		  console.info(this.value);
		    sendAjax("get","area?cid="+this.value, function (result) {
				 var area=JSON.parse(result);
				 //console.info(result);
				 $("area").options.length=1;
				 
				 for(var i=0;i<area.length;i++){
					 var op=new Option(area[i].name,area[i].aid);
					 $("area").options.add(op);
				 }
			});
	 }
}

</script>

</head>
<body>
   省:
     <select name="" id="province">
         <option value="-1" >请选择</option>
     </select>
  市:
  <select name="" id="city">
         <option value="-1" >请选择</option>
     </select>
 区/县:
 <select name="" id="area">
         <option value="-1" >请选择</option>
 </select>
</body>
</html>