package GUIsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GainSubjects {
	public String[] gainSubjects() {
		Teacher teaone=new Teacher("001","张老师","F","Java");
		Teacher teatwo=new Teacher("002","游老师","F","Math");
		Teacher teathree=new Teacher("003","李老师","F","Physics");
		Teacher teafour=new Teacher("004","于老师","M","PE");
		Teacher teafive=new Teacher("005","常老师","M","English");
		Subject subone=new Subject("1","Java","houseone","8:00",teaone);
		Subject subtwo=new Subject("2","Math","housetwo","10:00",teatwo);
		Subject subthree=new Subject("3","Physics","housethree","13:00",teathree);
		Subject subfour=new Subject("4","PE","housefour","16:00",teafour);
		Subject subfive=new Subject("5","English","housefive","19:00",teafive);
		String [] subjects= new String[20];
		subjects[0]=subone.toString();
		subjects[1]=subtwo.toString();
		subjects[2]=subthree.toString();
		subjects[3]=subfour.toString();
		subjects[4]=subfive.toString();
		FileOperations file=new FileOperations();
		for(int i=0;i<file.readFile("test").split("。").length;i++) {
			subjects[i+5]=file.readFile("test").split("。")[i]+"。";
		}
		return subjects;
		}
}