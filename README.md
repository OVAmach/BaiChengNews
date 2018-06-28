
# BaiChengNews
一个前后端分离部署的练手Web项目

SSM+Maven+Bootstrap

`基本功能可用，但项目并未完全切存在未清除的冗余内容`
## 本人部署编译及开发环境
* Windows 10 Home x64 1803
* JDK 1.8.0_111 x64
* Nginx 1.14.0 
* MySQL 5.7.13 x64
* Tomcat 7.0 x64
* Eclipse For JAVA EE Oxygen.1a Release (4.7.1a) x86_64
* WebStorm 2017.3.2

## 部署安装说明
* `项目默认使用UTF-8编码，未做说明处编码请使用UTF-8`
* 第一步:导入bcnews.sql到数据库bcnews中
* 第二步:修改src\main\resources\jdbc.properties中的数据库连接方式
* 第三步:按照nginx-default.conf的配置修改nginx.conf，并将root路径指定为StaticWeb的文件夹位置
* 第四步:修改src/main/java/com/iteamcn/baichengnews/mvc/controller/ApiHandler.java中的@CrossOrigin跨域路径为你的前端URL
* 第五步:编译网站，将编译好的war文件放入tomcat服务器中
* 第六步:修改public.js中的backSideURL为你配置的后端URL
* 第七步:启动Tomcat和Nginx
* 第八步:打开浏览器验证是否正常运行，管理员admin密码123456
