# spring-cloud-alibaba-demo

### 介绍
本项目是基于SpringCloud 与SpringCloud alibaba 的探索实践项目  
关联本人博客springcloud经验总结专题  
地址: https://blog.csdn.net/weixin_40461281/category_9280146.html  
整合项目地址: https://gitee.com/JavaLionLi/RuoYi-Cloud-Plus

### 软件架构
| 依赖                  | 版本         |
|---------------------|------------|
| SpringCloud         | 2021.0.1   |
| SpringCloud-Alibaba | 2021.0.1.0 |
| SpringBoot          | 2.6.6      |
| apache dubbo        | 3.0.7      |
| alibaba nacos       | 2.0.2      |

### spring cloud alibaba专题  
| 模块名称 | 模块作用 |
|---- | ---- |
| alibaba-nacos-discovery-server | 使用Nacos实现服务注册与发现：服务提供方 |
| alibaba-nacos-discovery-client | 使用Nacos实现服务注册与发现：服务消费方 |
| alibaba-nacos-config-client | 使用Nacos实现注册中心：客户端 |
| alibaba-dubbo-server | Dubbo 服务端实现(集成Nacos实现注册中心与配置中心) |
| alibaba-dubbo-client | Dubbo 客户端实现(集成Nacos实现注册中心与配置中心) |
| alibaba-dubbo-api | Dubbo API定义 |
| alibaba-sentinel-dubbo-server | Sentinel Dubbo 服务提供端 |
| alibaba-sentinel-dubbo-client | Sentinel Dubbo 服务消费端 |
| alibaba-sentinel-dubbo-api | Sentinel Dubbo API定义 |
| alibaba-sentinel-dashboard | Sentinel 控制台 |
| alibaba-sentinel-feign-server | Sentinel Feign 服务提供端 |
| alibaba-sentinel-feign-client | Sentinel Feign 服务消费端 |
| alibaba-stream-rocketmq-consumer | RocketMQ Stream 消息消费者 |
| alibaba-stream-rocketmq-produce | RocketMQ Stream 消息生产者 |
