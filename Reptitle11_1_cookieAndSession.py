import requests
rsp = requests.get("http://www.baidu.com")
#如果对方服务器给传送过来cookie信息，则可以同通过反馈的cookie属性得到
#返回一个cookiejar的实例
cookiejar = rsp.cookies
print(cookiejar)

#可以将cookiejar转换为字典
cookiedict = requests.utils.dict_from_cookiejar(cookiejar)
print(cookiedict)
