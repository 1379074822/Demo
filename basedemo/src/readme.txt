
ucarinc-framework 对 react 前后端分离的支持（基于springboot的jar包形式开发及部署）

该模板为大家提供一个简单的前后端分离的增删查demo，可参考该demo完成大部分的功能开发。

注意：springboot的项目需要一个启动配置类，该类不要放在com或者com.ucarinc或者com.ucarinc.framework路径下；
springboot默认从启动配置类开始，作为根路径进行扫描，com.ucarinc.framework 路径为框架的底层包，在项目启动时，已经默认指定加载了，
如果将启动配置放在com.ucarinc.framework目录下，会重复加载框架的底层包，导致项目启动失败。



项目结构介绍：

src
    main/
        filters/           --  环境相关的配置，
        java/
        react/             --  该目录存放的是从VDP下载的已经设计好的文件
        resources/         --  项目的配置目录
            mappers/       --  数据库相关的sql.xml文件
            static/        --  静态文件（js，css，图片等）
            templates/     --  html文件（目前html视图使用的是springboot提供的thymeleaf模板）
            application.properties        -- 项目的主要配置文件，配置项目中用到的一些固定不变的值，具体的值下面会详细说明。
            bootstrap.properties          -- 配置中心相关的配置， 该文件中的变量值通过maven编译将filters下对应的文件中的值填充。
            log4j2_ucarinc.properties     -- 项目的日志配置文件，该文件为空即可，具体的log4j配置在配置中心

    test/                  --  测试目录
    readme.txt             --  readme.txt
pom.xml                    --  maven的配置文件



说明：

    filters中各个环境的配置值 目前为demo的中用到的配置，在实际应用中需要替换成自己的配置。

    react 目录存放的是从VDP下载的已经设计好的文件（包含html，js，css等），在通过maven打包的时候，会将对应的文件打包到响应的目录下
    （html文件放在templates目录下，js、css等静态文件放在static目录下）


    项目在真正开发的时候，需要将bootstrap.properties中的项目名，业务线，配置中心的key等替换成自己项目的真实数据。






application.properties 中系统默认的参数列表：

    1、#配置启动的端口号
    server.port=8080

    2、配置项目名称
    server.servlet.context-path=/react

    3、配置数据源名称，（具体的数据应该在sddlAdmin上申请，）
    ubatis.jndi.name=jndi_mysql
    ubatis.jndi1.name=jndi_mysql2 #（多个数据源的情况）

    4、#hbase配置（扫描hbase注解类，在使用hbase 注解的时候，需要配置该参数）
    hbase.scan.package=com.ttp

    5、更多配置参数介绍，参见wiki




