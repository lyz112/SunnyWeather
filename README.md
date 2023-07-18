# SunnyWeather 
可以实现的功能：
1、可以搜索全球大多数国家的各个城市数据；
2、可以查看全球绝大多数城市的天气信息；
3、可以自由地切换城市，查看其他城市的天气；
4、可以手动刷新实时的天气。

工具：
1、MVVM
简述：Model是数据模型部分；View是界面展示部分；
而ViewModel比较特殊，可以将它理解成一个连接数据模型和界面展示的桥梁，从而实现让业务逻辑和界面展示分离的程序结构设计。

包 说明：
logic包用于存放业务逻辑相关的代码
ui包用于存放界面展示相关的代码
其中， logic包中又包含了dao、model、network这3个子包，分别用于存放数据访问对象、对象模型以及网络相关的代码。
而ui包中又包含了place和weather这两个子包，分别对应SunnyWeather中的两个主要界面。