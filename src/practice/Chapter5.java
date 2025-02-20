package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		Task task1 = new Task(LocalDate.parse("2021/10/21", f), "牛乳を買う");
		Task task2 = new Task(LocalDate.parse("2021/09/15", f), "○〇社面談");
		Task task3 = new Task(LocalDate.parse("2021/12/04", f), "手帳を買う");
		Task task4 = new Task(LocalDate.parse("2021/08/10", f), "散髪に行く");
		Task task5 = new Task(LocalDate.parse("2021/11/09", f), "スクールの課題を解く");
		
		
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);
		
		tasks.sort(Comparator.comparing(Task::getDate));
		
		
		
		
		for(int i = 0; i < tasks.size(); i++) {
			
			System.out.print(tasks.get(i).getDate() + ":");
			System.out.println(tasks.get(i).getSchedule());
			
			
		}
		

	}

}
