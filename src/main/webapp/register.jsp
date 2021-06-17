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
    <div class="panel-head" id="add" style="margin-top: 5%;text-align: center;"><strong><span class="icon-pencil-square-o"></span>用户注册</strong></div>
    <div class="body-content" style="margin-left: 38%">
        <form method="post" class="form-x"  action="addUser">
            <div class="form-group">
                <div class="label" style="">
                    <label>ID：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Uid" data-validate="required:请输入ID" required/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>姓名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Uname" required/>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>密码：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Password" required/>
                    <div class="tips"></div>
                </div>
            </div>

            <div class="clear"></div>

            <div class="form-group">
                <div class="label">
                    <label>年龄：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Age" value=""/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>性别：</label>
                </div>
                <select name="Gender" id="Gender" required>
                    <option>男</option>
                    <option>女</option>
                </select>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>角色：</label>
                </div>
                <select name="Role" id="Role" required>
                    <option>管理员</option>
                    <option>教师</option>
                    <option>学生</option>
                </select>
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
