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
**输入输出流**  
```public String readFile(String filename) {```  
```		  String str="";```  
```		  String pathname = "C:\\Users\\69253\\Desktop"+filename+".txt";```  
路径名称  
```		  try (FileReader reader = new FileReader(pathname);```  
在给定从中读取数据的文件名的情况下创建一个新 FileReader。 filename是要从中读取数据的文件的名称   
```		       BufferedReader br = new BufferedReader(reader) ```  
BufferedReader是为了提供读的效率而设计的一个包装类，它可以包装字符流。可以从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。  
```		  ) {```  
```		      String line;```  
```		      while ((line = br.readLine()) != null) {```  
```		      	str=str+line;}```  
读取文件中的信息  
```		  } catch (IOException e) {```  
```		      e.printStackTrace();}```  
当try语句中出现异常是时，会执行catch中的语句，java运行时系统会自动将catch括号中的IOException e 初始化也就是实例化Exception类型的对象。e是此对象引用名称。然后e（引用）会自动调用IOException中指定的方法，也就出现了e.printStackTrace() ;printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因。  
```		  return str;}```  
**主页面跳转窗口**  
```public void init() {```  
```		JFrame frame=new JFrame();```  
```		JPanel panel=new JPanel();```  
```		panel.setLayout(null);``` 
```		JButton btn1=new JButton("学生选课");```  
创建按钮组件  
```		btn1.setBounds(100, 40, 200, 40);```  
调节窗口尺寸  
```		btn1.addActionListener(new ActionListener(){```  
监听事件  
```			public void actionPerformed(ActionEvent arg0) {```  
```			ChoiceSubject choice=new ChoiceSubject();}});```  
点击按钮时，对choice进行实例化，进行页面的跳转    
```		JButton btn2=new JButton("学生退课");```  
创建按钮组件  
```		btn2.setBounds(100, 120, 200, 40);```  
调节窗口尺寸  
```		btn2.addActionListener(new ActionListener(){```  
监听事件  
```			public void actionPerformed(ActionEvent arg0) {```  
```			QuitSubjects quit=new QuitSubjects();}});```  
点击按钮时，对quit进行实例化，进行页面的跳转  
```		JButton btn3=new JButton("打印学生选课列表");```  
创建按钮组件  
```		btn3.setBounds(100, 200, 200, 40);```  
调节窗口尺寸  
```		btn3.addActionListener(new ActionListener(){```  
监听事件  
```			public void actionPerformed(ActionEvent arg0) {```  
```			PrintSubjects print=new PrintSubjects();}});```  
点击按钮时，对print进行实例化，进行页面的跳转  
```		JButton btn4=new JButton("课程新加");```  
创建按钮组件  
```		btn4.setBounds(100, 280, 200, 40);```  
调节窗口尺寸  
```		btn4.addActionListener(new ActionListener(){```  
监听事件  
```			public void actionPerformed(ActionEvent arg0) {```  
```			AddSubjects print=new AddSubjects();}})```  
点击按钮时，对print进行实例化，进行页面的跳转

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
