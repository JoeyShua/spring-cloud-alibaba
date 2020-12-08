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
