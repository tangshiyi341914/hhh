<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/dashboard/">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/dashboard.css" rel="stylesheet">
    <link href="css/1.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">${sessionScope.loginUser}</a>
    <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
    <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
            <a class="nav-link" href="#">Sign out</a>
        </li>
    </ul>
</nav>

<div class="container-fluid">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="SeletCuserServlet">
                            <span data-feather="home"></span>
                            用户管理<span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="SelectCourseServlet">
                            <span data-feather="file"></span>
                            课程管理
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="selectionservlet">
                            <span data-feather="shopping-cart"></span>
                            学生信息
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="users"></span>
                            学生选课
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="bar-chart-2"></span>
                            通知公告
                        </a>
                    </li>
                </ul>
                <ul id="parent">
                    <li>
                        <span><p></p>列表</span>
                        <ul>
                            <li>子列表</li>
                            <li>子列表</li>
                            <li>子列表</li>
                        </ul>
                    </li>
                    <li>
                        <span><p></p>列表</span>
                        <ul>
                            <li>子列表</li>
                            <li>子列表</li>
                            <li>子列表</li>
                        </ul>
                    </li>
                    <li>
                        <span><p></p>列表</span>
                        <ul>
                            <li>子列表</li>
                            <li>子列表</li>
                            <li>子列表</li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column" style="left: 120px">
            <div class="page-header">
                <h1>
                    <small>用户列表 —— 显示所有用户信息</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column" style="left: 120px">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/register.jsp">新增</a>
<%--            <a class="btn btn-primary" href="${pageContext.request.contextPath}/">删除</a>--%>
<%--            <a class="btn btn-primary" href="${pageContext.request.contextPath}/">修改</a>--%>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/select.jsp">查询</a>
        </div>
    </div>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>在表格中的应用</legend>
    </fieldset>

    <div style="max-width: 728px;">
        <table class="layui-hide" id="test-dropdown-table" lay-filter="test-dropdown-table"></table>
    </div>
    <script type="text/html" id="test-dropdown-toolbar-barDemo">
        <a class="layui-btn layui-btn-xs layui-btn-primary" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-xs" lay-event="more">更多 <i class="layui-icon layui-icon-down"></i></a>
    </script>
    <div style="margin-top: 15px">
    <div class="row clearfix">
        <div class="col-md-12 column" style="left: 120px">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>用户ID</th>
                    <th>用户姓名</th>
                    <th>用户密码</th>
                    <th>用户性别</th>
                    <th>用户年龄</th>
                    <th>用户角色</th>
                    <th>增添时间</th>
                </tr>
                </thead>
                <tbody>
                <% List<Map<String,Object>> list= (List<Map<String, Object>>) request.getAttribute("maplist"); %>
                <%  for (Map<String, Object> stringObjectMap : list) {
                    Object[] array = stringObjectMap.values().toArray(); %>
                <tr>
                    <td><%= array[0]%></td>
                    <td><%= array[1]%></td>
                    <td><%= array[2]%></td>
                    <td><%= array[3]%></td>
                    <td><%= array[4]%></td>
                    <td><%= array[5]%></td>
                    <td><%= array[6]%></td>
                    <td>
                        <form action="DeleteUserServlet" method="post">
                            <input type="hidden" value="<%=array[0]%>" name="id">
                            <input type="submit" value="更改">
                        </form>
                    </td>
                    <td>
                        <form action="DeleteUserServlet" method="post">
                            <input type="hidden" value="<%=array[0]%>" name="Uid">
                            <input type="submit" value="删除">
                        </form>
                    </td>
                <tr>
                        <%} %>

                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
<script src="../../assets/js/vendor/popper.min.js"></script>
<script src="css/bootstrap.min.js"></script>


<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace()
</script>


<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
<script>
    var ctx = document.getElementById("myChart");
    var myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
            datasets: [{
                data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
                lineTension: 0,
                backgroundColor: 'transparent',
                borderColor: '#007bff',
                borderWidth: 4,
                pointBackgroundColor: '#007bff'
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: false
                    }
                }]
            },
            legend: {
                display: false,
            }
        }
    });
</script>
</body>
</html>