## PkQ Cloud 微服务学习

## 配套文章


## Oauth2

- 发起请求获取授权码

```shell
http://localhost:10001/oauth/authorize?client_id=xxxx&response_type=code&scope=xxx&redirect_uri=xxxx

# 例

http://localhost:10001/oauth/authorize?client_id=clientId1&response_type=code&scope=all&redirect_uri=https://www.baidu.com

```

- 授权成功后跳转```redirect_uri``` 并携带参数```code```, 通过```code```获取```token```

```
http://localhost:10001/oauth/token?client_id=xxxx&grant_type=xxx&code=xxx&redirect_uri=xxxxxxx

# 例
http://localhost:10001/oauth/token?client_id=clientId1&grant_type=authorization_code&code=TbQ2Od&redirect_uri=https://www.baidu.com
```





