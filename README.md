# spring-boot
spring-boot中文文档翻译版：https://www.gitbook.com/book/qbgbook/spring-boot-reference-guide-zh/details

一.spring-boot中的maven的精选配置
1.spring-boot-starter-parent中配置特性
a.默认编译级别为Java 1.6
b.源码编码为UTF-8
c.一个Dependency management节点，允许你省略常见依赖的<version>标签，继承自spring-boot-dependencies POM
d.恰到好处的资源过滤
e.恰到好处的插件配置（exec插件，surefire，Git commit ID，shade）
f.恰到好处的对application.properties和application.yml进行筛选，

注：最后一点：由于配置文件默认接收Spring风格的占位符（${...}），
所以Maven filtering需改用@..@占位符（你可以使用Maven属性resource.delimiter来覆盖它）。

附：
maven学习笔记
1.maven中resource的作用:http://jjhpeopl.iteye.com/blog/2325375
2.maven中依赖的作用域:http://uule.iteye.com/blog/2087485，
http://elim.iteye.com/blog/2057317
3.maven依赖中的type概念:http://blog.csdn.net/yao123long/article/details/49925659

二.项目结构命名方式
1.不推荐使用default package方式
2.强烈推荐使用root package方式
a.使用java包命名规范，使用反转域名
b.这样可以隐式指定包搜索路径，在不指定basePackage的情况下使用@ComponentScan注解

只要将@EnableAutoConfiguration注解在main类上，main类在最顶层包下。
@SpringBootApplication，@Configuration也可以注解main类

注： 
@EnableAutoConfiguration注解
  第二个类级别的注解是@EnableAutoConfiguration，这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
由于spring-boot-starter-web添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个web应用，
并对Spring进行相应地设置。
  Starters和Auto-Configuration：Auto-configuration设计成可以跟"Starters"一起很好的使用，
但这两个概念没有直接的联系。你可以自由地挑选starters以外的jar依赖，Spring Boot仍会尽最大努力去自动配置你的应用。


三.IDEA与spring-boot结合remote debug
1.启动spring boot jar
a.1.5及以后：java -Xdebug -agentlib:jdwp=server=y,transport=dt_socket,address=8000,suspend=n -jar boot-primary-1.0-SNAPSHOT.jar
b.1.3-1.4：java -Xdebug -runjdwp=server=y,transport=dt_socket,address=8000,suspend=n -jar boot-primary-1.0-SNAPSHOT.jar

2.配置IDEA
a.增加remote，然后配置remote IP和Port，其中ip是远程服务器，port是remote debug端口，如上：是8000。将本地IDE中的项目增加到remote中
b.启动remote，打上断点

参考：http://blog.csdn.net/u010136084/article/details/62044423


四.spring boot运行方式
1.在IDE中通其他的java应用程序一样运行或者debug方式启动
2.利用spring-boot的maven插件打成jar后，直接启动运行，支持remote debug模式启动
mvn package
java -jar boot-primary-1.0-SNAPSHOT.jar


3.利用spring-boot maven插件的run目标运行，这种方式和IDE运行一样，支持热加载
mvn spring-boot:run
注：可以使用操作系统环境变量
export MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=128M


五.spring-boot devtools的restart、livedLoad以及VS reload技术

六.spring-boot的特性
1.SpringApplication



2.外部化配置
properties文件，YAML文件，环境变量和命令行参数。springApplication会将所有命令行配置参数（以'--'开头，比如--server.port=9000）转化成一个property，
并将其添加到Spring Environment中。springApplication会将application.properties转化成一个property，并将其添加到Spring Environment中。








































































