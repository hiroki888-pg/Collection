package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<LocalDate> date = new ArrayList<LocalDate>();
		List<String> yotei = new ArrayList<String>();
		
		Task task = new Task(date, yotei);
		
		task.taskKakunou(task);
		
		for(int i = 0; i < task.date.size(); i++) {
			System.out.print(task.date.get(i) + ":");
			System.out.println(task.yotei.get(i));
		}
		

	}

}
