# 学生选课系统设计
## 大181 刘柄沣 2018310170
### 一、实验目的
分析学生选课系统  
使用GUI窗体及其组件设计窗体界面  
完成学生选课过程业务逻辑编程  
基于文件保存并读取数据  
处理异常  
### 二、实验要求
1、系统角色分析及类设计。   
2、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。   
3、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。  
4、针对操作过程中可能会出现的各种异常，做异常处理。  
5、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。  
### 三、过程
创建了十二个类  
![十二个类](https://github.com/LiuBingfeng1/GUI/blob/master/%E5%9B%BE%E7%89%87.png)      
学校有“人员”，分为“教师”和“学生”，在**People**人员类的基础上创建**Teacher**教师和**Students**学生类，子类教师类和学生类继承父类人员类的属性，使用extends关键字完成继承，子类拥有父类的属性。跟据教师教授“课程”，创建**Subject**课程类。可以选择的课程有什么，创建了获取课程类**GainSubjects**。学生选课系统要有注册登录界面，创建**LoginTest**注册登录类。登陆选课系统的主页面，创建了**IndexTest**主页类，。创建类**FileOperations**，用来存储驱动内核模块提供的对设备进行各种操作的函数的指针。该结构体的每个域都对应着驱动内核模块用来处理某个被请求的 事务的函数的地址。学生选课系统主页面里连接了四部分，选课类**ChoiceSubject**,退课类**QuitSubjects**,打印课表类**PrintSubjects**,添加新课类**AddSubjects**。  
### 四、流程图  
### 五、核心代码  
输入输出流  
![](https://github.com/LiuBingfeng1/GUI/blob/master/%E5%85%B3%E9%94%AE%E4%BB%A3%E7%A0%81%E8%BE%93%E5%85%A5%E8%BE%93%E5%87%BA%E6%B5%81.png)  

### 六、系统运行截图
学生选课系统进入页面  
![](https://github.com/LiuBingfeng1/GUI/blob/master/LoginTest.png)  
选课页面  
![](https://github.com/LiuBingfeng1/GUI/blob/master/ChoiceSubject.png)  
退课页面  
![](https://github.com/LiuBingfeng1/GUI/blob/master/QuitSubjects.png)  
打印课程页面  
![](https://github.com/LiuBingfeng1/GUI/blob/master/PrintSubjects.png)  
添加新课页面  
添加新课成功  
![](https://github.com/LiuBingfeng1/GUI/blob/master/AddSubjects%E6%88%90%E5%8A%9F.png)  
添加新课信息为空  
![](https://github.com/LiuBingfeng1/GUI/blob/master/AddSubjects%E4%B8%BA%E7%A9%BA.png)
