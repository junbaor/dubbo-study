### dubbo-study

> dubbo 的练手项目  

项目分为四个 maven 模块
- `dubbo-model` 实体类
- `dubbo-producer-api` 服务的接口 
- `dubbo-producer` 服务的实现
- `dubbo-consumer` 服务的消费者

### 运行

1. 配置 `maven` 环境  
找到 `maven`安装目录下 `conf` 中的 `setting.xml` 文件, 在 `<mirrors>` 标签下添加
```xml
<mirror>
    <id>central</id>
    <mirrorOf>central</mirrorOf>
    <name>Mirror</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
</mirror>
```
这一步主要是为了加快下载 jar 包的速度

2. 搭建 zookeeper [教程](https://segmentfault.com/a/1190000009978439)
2. 把项目使用 git clone 到本地, 然后导入到开发工具中
3. 在项目目录下执行 `mvn install`
4. 修改 `zookeeper` 地址  
找到 `dubbo-producer` 和 `dubbo-consumer` 中的 `applicationContext-dubbo.xml` 文件  
将其中的 `127.0.0.1:2181` 修改为自己的 `zookeeper` 地址
5. 启动 `dubbo-producer` 中的 man 方法
6. 启动 `dubbo-consumer` 中的 man 方法,如果没有意外,会打印调用的返回值

---

现实中生产环境的 `dubbo-producer (服务提供者)`、`dubbo-consumer(服务消费者)` 会发布到不同的服务器上,   
而且会发布多个实例, 水平扩容 `service` 层, 大大提高集群的处理能力

`dubbo` 的作用就是让我们忽略这里面复杂的逻辑,像调用本地方法一样调用集群中的 service 服务  
`zookeeper` 的作用就是协调各个模块, 可以想象成是一个中转站, 告诉调用方, 他想要调用的方法在哪台服务器上面;  
如果有好多台服务器上都有要调用的方法, 就会按照负载均衡策略选择一个

---
