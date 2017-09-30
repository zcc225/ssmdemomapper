# SSM集成的基础项目，项目使用Maven管理

# MyBatis3.3.0

# Spring[MVC]4.1.2.RELEASE

项目使用Spring4.1.2.RELEASE + SpringMVC4.1.2.RELEASE + Mybatis3.3.0

项目集成了Mybatis分页插件和通用Mapper插件

项目使用的mysql数据库，根据需要可以切换为其他数据库

集成分页插件 5.0.0 版本，注意配置变化：
```xml
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource"/>
    <property name="mapperLocations">
        <array>
            <value>classpath:mapper/*.xml</value>
        </array>
    </property>
    <property name="typeAliasesPackage" value="com.isea533.mybatis.model"/>
    <property name="plugins">
        <array>
            <bean class="com.github.pagehelper.PageInterceptor">
                <!-- 这里的几个配置主要演示如何使用，如果不理解，一定要去掉下面的配置 -->
                <property name="properties">
                    <value>
                        helperDialect=mysql
                        reasonable=true
                        supportMethodsArguments=true
                        params=count=countSql
                        autoRuntimeDialect=true
                    </value>
                </property>
            </bean>
        </array>
    </property>
</bean>
```
- 拦截器 `com.github.pagehelper.PageInterceptor`
- 原来的 `dialect` 变成了 `helperDialect`，这是基于 PageHelper 方式的分页
- 具体变化看文档


CSDN博客：http://blog.csdn.net/isea533/article/details/73555400

GitHub项目：https://github.com/mybatis-book/book


## 作者信息

- 作者博客：http://blog.csdn.net/isea533

- 作者邮箱：abel533@gmail.com

- Mybatis工具群： <a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=7c2f018e4cddc7d4aad04fc312b2d69361a0a896a4f59219a7914953a57bffc2"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Mybatis工具群" title="Mybatis工具群"></a>
