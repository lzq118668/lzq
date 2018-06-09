  
function $(id) {
	return document.getElementById(id);
}

function sendAjax(method,uri,success) {
	 var xmlhttp;
	 if (window.XMLHttpRequest) {
		xmlhttp=new XMLHttpRequest;
	}else {
		xmlhttp=new ActiveXObject("Micrsoft.XMLHTTP");
	}
	 
	xmlhttp.onreadystatechange= function(){
		if(xmlhttp.readyState==4){
			if(xmlhttp.status==200||xmlhttp.status==304){
				var result=xmlhttp.responseText;
				success(result);
			}
		}
	};
			
	xmlhttp.open(method,uri);
	xmlhttp.send();
	
	 
}
