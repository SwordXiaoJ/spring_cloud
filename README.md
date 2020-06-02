# spring_cloud

作业要求2 是模块netflix_eureka_clinet与netflix_eureka_server。其中netflix_eureka_server是通用的注册中心，后续也会用

作业要求3 是模块netflix_zuul。

作业要求4 是模块config-client与config-server，它们都是netflix_eureka_server为注册中心

作业要求5 是模块producer，consumer，netflix_zuul与netflix_eureka_server







2020年6月2日
netflix_eureka_server 8761

netflix_eureka_client 8760

netflix_zuul 8764

producer 8763

consumer 8762

consumer_ribbon 8765

consumer_feign  8766

config-server 8082

config-client 8083



consumer

consumer_ribbon

consumer_feign是负载的三种实现方式



然后熔断，是在consumer_feign基础上进行改动，Producer正常启动的时候，可以正常访问，手动关闭producer，熔断提示hello world,再次重新启动producer，又恢复正常



手动动态更新配置是在config-client中进行修改在appiacation.properties中加入    #management.endpoints.web.exposure.include=refresh  用于手动刷新

我们在这其中，要调用http://localhost:8083/actuator/refresh，因为要发送的是POST命令，所以我是在Postman中发送的

然后就实现了更新的同步


最后是在config-client中加入了Bus,并用RabbitMQ进行了测试
