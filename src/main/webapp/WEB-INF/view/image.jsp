<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>image</title>
</head>
<body>
	
</body>
<script type="text/javascript" src="../js/jquery3.3.1.js"></script>
<script type="text/javascript">
	var img = new Image();
	img.onload = function () {		
   		alert("image is loaded");
   		if(true){
   			alert(true);
   			document.body.appendChild(img);
   		}else{
   			alert(false);
   		}
	};
	img.src = "../image/logo.jpg";
</script>
</html>