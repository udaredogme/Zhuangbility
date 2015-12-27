# Zhuangbility(装逼立体)

## 学生成绩管理系统
> Zhuangbility,学生~~*装逼*~~__成绩__管理系统。

### 开发环境及版本：
IDE：`IntelliJ IDEA 15`
数据库：`mysql`（不知道版本）

` Spring 3.2.2RELEASE`

`Hibernate 4.2.0.Final`

`Maven 3`
***
使用时请注意用`Eclipse`或者`IntelliJ IDEA`等其他IDE打开来保障`Maven`配置需要的依赖库以及插件。

* 由于部分依赖可能被墙，您需要学习一个科学上网或者百度一下Maven的uk镜像。


使用前需要自己照着model手动建下数据库 至于怎么建，请[百度一下](www.baidu.com)。(为什么要手动呢？ 因为我不知道Hibernate怎么自动建表)

默认数据库端口号为**8889**，用户名和密码都为**root**，修改数据库连接信息 `/src/main/resource/application.properties`

初始运行的时候应该是先`$ mvn:clean`然后`$ mvn jetty:run`

其他问题请[@SunskyXH](http://weibo.com/2864813750/profile?topnav=1&wvr=6&is_all=1)。虽然估计我都不会 嘻嘻嘻：）