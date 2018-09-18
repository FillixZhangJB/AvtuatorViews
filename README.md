# AvtuatorViews
spring boot admin server端demo
基于de.codecentric对springboot actuator做的可使唤项目spring-boot-admin，server端的demo
参考网址 http://codecentric.github.io/spring-boot-admin/2.0.2/

1、版本解释
springboot版本 1.5.16
spring-boot-admin-server 版本 1.5.6
jdk版本 1.8

2、使用步骤
  2.1 pom文件中引入以下依赖
   <dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-server</artifactId>
    <version>1.5.6</version>
   </dependency>
   <dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-server-ui</artifactId>
    <version>1.5.6</version>
   </dependency>
  2.2 项目引导类加注解@EnableAdminServer
