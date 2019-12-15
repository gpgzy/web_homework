<%--
  Created by IntelliJ IDEA.
  User: gzy
  Date: 2019/12/14
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="X-UA-Compatible" content="IE=edge"/>
    <meta name="keywords" content="软件工程系"/>
    <meta name="description" content="东北林业大学软件工程系"/>
    <title>软件工程系</title>
    <link rel="stylesheet" type="text/css" href="/jsp/css/style.css"/>
    <style>
        #right{
            text-align: center;
            margin: 20px;
            padding: 20px;
            font-size: 20px;
        }
        #right button{
            background-color: red;
            color: white;
            border: none;
            border-radius: 5px;
            padding-left: 20px;
            padding-right: 20px ;
            padding-bottom: 10px;
            padding-top: 10px;
            margin: 10px;
        }
        .box textarea{
            width: 600px;
            height: 300px;
            font-size: 20px;
        }
    </style>
</head>
<body>
<!--header-->
<div class="top_wrap">
    <!--top index-->
    <div class="top">
        <span class="welcome">您已经进入东北林业大学软件工程系网站后台！</span>
        <div class="corner">
            <a onclick=SetHome(this,window.location) title="设为首页" href="javascript:void(0);">设为首页</a>
            <span>|</span>
            <a onclick=addFavorite(window.location,document.title) title="添加收藏" href="javascript:void(0);">加入收藏</a>
        </div>
        <div class="clear"></div>
    </div>
</div>
<!--logo and nav-->
<div class="header_wrap">
    <div class="header">
        <a href="/helloServlet" class="logo"><img src="/jsp/images/logo.png" /></a>
        <div class="nav_list">
            <ul id="nav" class="nav clearfix">
                <li class="nLi" style="display: none;"></li>
                <li class="nLi">
                    <h3><a href=""></a></h3>
                </li>
                <li class="nLi">
                    <h3><a href=""></a></h3>

                </li>
                <li class="nLi">
                    <h3><a href="/updateServlet"></a></h3>

                </li>
                <li class="nLi">
                    <h3><a href="/getallServlet"></a></h3>
                </li>
            </ul>
        </div>
        <div class="clear"></div>
    </div>
</div>
<!--banner-->
<!--<div class="i_banner">
    <img src="images/banner1.jpg" />
</div>-->
<!--content-->
<div class="i_content">
    <div class="c_area">
        <div class="left_list">
            <div class="nav_title">后台管理系统</div>
            <div class="sidemenu">
                <ul>
                    <li class="on"><a href="about.html">新闻管理</a></li>
                    <li><a href="about.html">个人信息</a></li>
                </ul>
            </div>
            <div class="contact"> <a><img src="/jsp/images/tel.jpg" /></a> </div>
        </div>
        <div class="right_content">
            <div class="con_title">新闻修改页面</div>
            <div id="right">
                <form  action="/updateServlet" method="post" name=form1 οnsubmit="return check()">
                    <table>
                        <tr>
                            <td>新闻标题：</td>
                            <td>
<%--                                <input type="text" name="title" placeholder="长度控制在1-20个字符"  >--%>
                        <input style="width: 300px" value="${title}" name="title"><br>
                            </td>
                        </tr>
                        <tr>
                            <td>时间：</td>
                            <td>
                               <input style="width: 300px" value="${date}" name="date"><br>
                            </td>
                        </tr>
                        <tr>
                            <td>新闻内容：</td>
                            <td>
<%--                                <textarea cols="60" value="${content}" name="content"  rows="6"></textarea>--%>

<div class="box">  <textarea name="content" cols="60"  name="content"  rows="6">${content}</textarea></div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <button>提交</button>
                            </td>
                        </tr>

                    </table>
                </form>
            </div>
            <table id="line">
                <tr>
                    <td valign="top"></td>
                </tr>
            </table>

        </div>
        <div class="clear"></div>
    </div>
</div>
<!--footer-->
<div class="footer_wrap">
    <div class="line"></div>
    <div class="footer">
        <div class="f_left">
            <img src="images/f_logo.png" class="f_logo" />
            <div class="contact">
                <p><a href="contact.html">联系我们</a><a href="javascrip:void(0);">站长统计</a></p>
                <p>香坊校区&nbsp;&nbsp;&nbsp;&nbsp;所在地址：黑龙江省哈尔滨市香坊区和兴路26号</p>
                <p>版权所有：  东北林业大学软件工程系&nbsp;&nbsp;&nbsp;&nbsp;电话：110&nbsp;&nbsp;&nbsp;&nbsp;邮箱：8888888@163.com</p>
            </div>
        </div>
        <div class="f_right">
            <p><a href="" style="text-decoration: underline;">软件工程官网入口</a></p>
            <p><a href=""></a></p>
        </div>
        <div class="clear"></div>
    </div>
</div>
<script type="text/javascript" src="/jsp/js/jquery-1.11.0.min.js" ></script>
<script type="text/javascript" src="/jspjs/jquery.SuperSlide.2.1.js" ></script>
<script type="text/javascript" src="/jspjs/common.js" ></script>
</body>
</html>
