#### 密码模式：

http://localhost:9090/oauth/token?username=marissa&password=koala&grant_type=password&scope=read&client_id=my-trusted-client-with-secret&client_secret=somesecret

http://localhost:9090/order/1?access_token=771c5473-0613-40d5-82b3-09f35087e004

#### 客户端模式
http://localhost:9090/oauth/token?grant_type=client_credentials&scope=read&client_id=my-trusted-client-with-secret&client_secret=somesecret

#### implicit 模式
http://localhost:9090/oauth/authorize?response_type=token&client_id=my-trusted-client-with-secret

