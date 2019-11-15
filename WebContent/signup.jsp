<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userdao" class="database.UserDAO" />
	<%
		request.setCharacterEncoding("UTF-8");
		String ip = request.getRemoteAddr();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		switch(userdao.signup(ip,username,password)){
			case 0:
				out.print("정상적으로 회원가입 되었습니다.");
			case -1:
				out.print("이미 중복된 사용자 이름이 있습니다.");
			case -2:
				out.print("데이터베이스 오류가 발생하였습니다. 관리자에게 문의하세요.");
			}
	%>
</body>
</html>