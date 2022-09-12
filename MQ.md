# MQ message queue kafka
## 消息队列的异步处理
+ 将不重要的步骤经行异步的处理 可以加快响应的速度
## 解耦合
+ 系统之间通常使用api进行
+ 消息队列可以作为一个中间的代理 可以在生产者消费者之间解耦合
+ 例如将订单系统和库存系统中添加一个消息队列
## 流量削峰
+ 有大量的用户使用app 达到一个请求峰值的时候 服务器就会崩溃
+ 如何高并发
+ 当请求高的时候会有一个排队的处理
+ 例如 12306之前的使用情况
+ 服务器的集群也是有瓶颈的 数据库也会成为服务的瓶颈
+ mysql的单机处理量是8000左右 redis也是不能满足的
+ 放到消息队列中 形成一个缓冲的时间 
+ 并且消息队列的单机存储量可以达到10w数量级
## 日志处理
+ 大型电商网络 app等需要分析用户的行为，要根据用户的访问情况来发现用户的喜好以及活跃状态，需要在页面上收集大量的用户访问信息
+ 经典的实时处理的一个架构
  [![5Khtp.png](https://s1.328888.xyz/2022/09/06/5Khtp.png)](https://imgloc.com/i/5Khtp)
  + nginx可以处理很多的并发
## kafka
+ kafka是由apache软件基金会开发的一个开源软件，是由scala和java编写的。kafka的apache官网是这样介绍kafka的
  + 一个分布式的流平台
    1. 发布和订阅流数据流，类似于消息队列或者是企业消息传递系统
    2. 以容错的持久化方式存储数据流
    3. 处理数据流  kafka stream 用的人比较少
+ public and subscribe
+ store
+ process
### kafka的应用场景
1. 建立一个实时的数据管道，一可靠地在系统或者应用程序之间获取数据
2. 建立实时流应用程序，以转化或者相应数据流

### kafka的诞生背景
+ kafka的诞生使用于解决linkin的数据管道问题，起初linked采取了activieMQ来进行数据的交换，大约在2010年前后，那时的activieMQ还远远无法满足linkin对数据传递系统的要求，经常由于种种缺陷导致消息阻塞或者无法服务正常的访问，为了能够解决这个问题，linkin决定研发自己的消息传递系统，当时的linkin的首席架构师便开始了组织团队进行消息队列系统的研发
+ kafka比activities牛
+ kafka是有自己的生态圈的

## 转战rabbitMQ
+ 在Linux操作系统的docker中启动rabbitMQ
> [root@localhost ~]# docker run \
> -e RABBITMQ_DEFAULT_USER=itcast \
> -e RABBITMQ_DEFAULT_PASS=465124 \
> --name mq \
> --hostname mq1 \
> -p 15672:15672 \
> -p 5672:5672 \
> -d \
> rabbitmq:3-management
+ 可以通过使用ip加上端口号实现对rabbitMQ管理系统的访问
+ 可以在里面设置自己的虚拟主机 虚拟主机往往需要相互隔离
### rabbitMQ的逻辑结构
 ![1662944408407.png](https://img1.imgtp.com/2022/09/12/OeWGHs2C.png)
+ 总结
  + channel：操作MQ的工具
  + exchange：路由消息到队列中
  + queue：缓存消息
  + virtual host：虚拟主机，是对queue、exchange等资源的逻辑分组
  
## RabbitMQ入门
+ 常见的消息模型
+ ![1662944869205.png](https://img1.imgtp.com/2022/09/12/vOCA1WPG.png)
+ ![1662944920238.png](https://img1.imgtp.com/2022/09/12/2BP1AEBv.png)
  + 12 为基本消息队列和工作消息队列
  + p是production c是consumer 

  + 发布订阅，有根据交换机的类型不同分为三种
    + 广播 fanout exchange
    + 路由 direct exchange
    + 主题 topic exchange
  + publisher ----> queue ------> consumer

## 完成官方demo中的hello world 案例
+ 实现步骤
  + 导入课前资料中的demo工程
  + 运行publisher服务中的测试类publisherTest中的测试方法testSendMessage()
  + 查看RabbitMQ控制台的消息
  + 启动consumer服务，查看是否能接收消息
  + 


