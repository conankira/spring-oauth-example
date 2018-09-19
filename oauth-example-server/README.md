#### 运行步骤
> 环境：jdk8+mysql+redis+spring boot 2.0.4.RELEASE

> 创建数据库：spring_boot_example ，运行init.sql

> 默认用户名：marissa，密码：koala



#### 密码模式：

> http://localhost:9090/oauth/token?username=marissa&password=koala&grant_type=password&scope=read&client_id=my-trusted-client-with-secret&client_secret=somesecret

> http://localhost:9090/order/1?access_token=771c5473-0613-40d5-82b3-09f35087e004

#### 客户端模式
> http://localhost:9090/oauth/token?grant_type=client_credentials&scope=read&client_id=my-trusted-client-with-secret&client_secret=somesecret

#### implicit 模式
> http://localhost:9090/oauth/authorize?response_type=token&client_id=my-trusted-client-with-secret

> 返回 https://www.baidu.com/#access_token=3a9492e4-226b-4b12-9f86-c985c1c984c5&token_type=bearer&expires_in=34362&scope=read%20write%20trust%20all


#### authorization code模式
> http://localhost:9090/oauth/authorize?response_type=code&client_id=my-trusted-client-with-secret&redirect_uri=http://www.baidu.com

> ##### 根据code获取token：

> http://localhost:9090/oauth/token?grant_type=authorization_code&code=6uX8Ki&client_id=my-trusted-client-with-secret&client_secret=somesecret&redirect_uri=http://www.baidu.com

#### 刷新token
 
 > http://localhost:9090/oauth/token?grant_type=refresh_token&client_id=my-trusted-client-with-secret&client_secret=somesecret&refresh_token=cabc864d-5b77-443b-8710-3b0dfee044be
 
