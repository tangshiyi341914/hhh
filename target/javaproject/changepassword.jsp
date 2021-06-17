<%--
  Created by IntelliJ IDEA.
  User: 唐适益
  Date: 2021/5/31
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ChangePassword</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head" id="add" style="margin-top: 10%;text-align: center;"><strong><span class="icon-pencil-square-o"></span>修改密码</strong></div>
    <div class="body-content" style="margin-left: 38%">
        <p style="color: red" >${sessionScope.msg1}</p>
        <form method="post" class="form-x"  action="change">
            <div class="form-group">
                <div class="label">
                    <label>姓名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Uname" value="">
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>旧密码：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Password" value="">
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>新密码：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="newPassword" value="">
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
