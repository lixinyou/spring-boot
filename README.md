# spring-boot

spring-boot中的maven的精选配置
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
2.maven中依赖的作用域:http://uule.iteye.com/blog/2087485
3.