# spring-cloud-alibaba
## 一.前提
### 1.1 搭建nacos
#### 1.1.1 下载nacos
下载地址: https://github.com/alibaba/nacos/releases

#### 1.1.2 启动nacos
由于下载下来的nacos 默认启动是集群模式，修改为单机模式
修改文件nacos\bin\startup.cmd
#set MODE="cluster"
set MODE="standalone"
#### 1.1.3 访问nacos
http://127.0.0.1:8848/nacos/index.html


### 1.2 搭建sentinel
#### 1.2.1 下载sentinel
下载地址: https://github.com/alibaba/Sentinel/releases

#### 1.2.2 启动sentinel
java -jar sentinel-dashboard-1.8.0.jar
#### 1.2.3 访问sentinel
http://localhost:8080/#/login
默认用户名密码都是sentinel


## 二.部署
- order-service : 9000
- stock-service : 9001
- stock-service : 9002
- credit-service : 9003
- credit-service : 9004
