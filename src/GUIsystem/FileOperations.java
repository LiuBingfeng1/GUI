package GUIsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	public String readFile(String filename) {
		  String str="";
		  String pathname = "C:\\Users\\69253\\Desktop"+filename+".txt";//路径名称
		  try (FileReader reader = new FileReader(pathname);
		   //在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
		   //fileName - 要从中读取数据的文件的名称 
		       BufferedReader br = new BufferedReader(reader) 
		   //BufferedReader是为了提供读的效率而设计的一个包装类，它可以包装字符流。
		   //可以从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
		  ){
		      String line;
		      while ((line = br.readLine()) != null) {
		      	str=str+line;//读取文件中的信息
		      }

		  } catch (IOException e) {
		      e.printStackTrace();
		  }//当try语句中出现异常是时，会执行catch中的语句，java运行时系统会自动将catch括号中的IOException e 初始化
		  //也就是实例化Exception类型的对象。e是此对象引用名称。
		  //然后e（引用）会自动调用IOException中指定的方法，也就出现了e.printStackTrace() ;
		  //printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因
		  return str;
	}
	
	public void writeFile(String filename,String s) {
		//writeFile函数的功能是往文件中写数据，该函数可用来完成同步和异步操作的。
		//写入的位置是由文件指针制定的文字
		//在完成写操作后，文件的指针会移动到文件新增加的字节的最后
		String pathname = "C:\\Users\\69253\\Desktop"+filename+".txt";
		  try {
			  if(filename=="ABC") {
		      File writeName = new File(pathname); 
		      writeName.createNewFile(); 
		      try (FileWriter writer = new FileWriter(writeName,true);
		           BufferedWriter out = new BufferedWriter(writer)
		      ) {
		      		if(s!=null) {//s 不是空的
		      		out.write(s); //把字符串s输出了流里，并没有输出到文件中。
		      	}
		          out.flush(); //调用out.flush()方法将流中数据冲进目标文件
		      }
			  }
			  else {
				  File writeName = new File(pathname); 
			      writeName.createNewFile(); 
			      try (FileWriter writer = new FileWriter(writeName);
			           BufferedWriter out = new BufferedWriter(writer)
			      ) {
			      		if(s!=null) {
			      		out.write(s); 
			      	}
			          out.flush(); //输出流
			      }
			  }
		  } catch (IOException e) {
		      e.printStackTrace();
		  }
	}
	
	public void WriteFile(String[] s,String filename) {
		try {
            File writeName = new File("C:\\Users\\69253\\Desktop"+filename+".txt"); 
            writeName.createNewFile(); 
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
            	for(int i=0;i<s.length;i++) {
            		if(s[i]!=null) {
            		out.write(s[i]); 
            	}
                out.flush();
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
