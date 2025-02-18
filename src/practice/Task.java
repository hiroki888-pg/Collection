package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

public class Task {
	
	List<LocalDate> date;
	List<String> yotei;
	
	public Task(List<LocalDate> date, List<String> yotei) {
		this.date = date;
		this.yotei = yotei;
	}
	
	
	//タスクを格納する。
	public Task taskKakunou(Task tasks) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		tasks.date.add(LocalDate.parse("2021/08/10", f));
		tasks.date.add(LocalDate.parse("2021/09/15", f));
		tasks.date.add(LocalDate.parse("2021/10/21", f));
		tasks.date.add(LocalDate.parse("2021/11/09", f));
		tasks.date.add(LocalDate.parse("2021/12/04", f));
		
		Collections.sort(date);
		
		tasks.yotei.add("散髪に行く。");
		tasks.yotei.add("○○社面談。");
		tasks.yotei.add("牛乳を買う。");
		tasks.yotei.add("スクールの課題を解く。");
		tasks.yotei.add("手帳を買う。");
		
		return tasks;
		
	}
	

}










//public Task(List<LocalDate> date, List<String> task) {
//date = new ArrayList<LocalDate>();
//task = new ArrayList<String>();
//
//DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/mm/dd");
//date.add(LocalDate.parse("2021/08/10", f));
//date.add(LocalDate.parse("2021/09/15", f));
//date.add(LocalDate.parse("2021/10/21", f));
//date.add(LocalDate.parse("2021/11/09", f));
//date.add(LocalDate.parse("2021/12/04", f));
//
//task.add("牛乳を買う。");
//task.add("○○社面談。");
//task.add("手帳を買う。");
//task.add("散髪に行く。");
//task.add("スクールの課題を解く。");
//
//}



//public List<LocalDate> dateKakunou(List<LocalDate> date1) {
//
//DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//date1.add(LocalDate.parse("2021/08/10", f));
//date1.add(LocalDate.parse("2021/09/15", f));
//date1.add(LocalDate.parse("2021/10/21", f));
//date1.add(LocalDate.parse("2021/11/09", f));
//date1.add(LocalDate.parse("2021/12/04", f));
//
//Collections.sort(date1);
//
//this.date = date1;
//
//return date1;
//}
//
//public List<String> taskKakunou(List<String> task1) {
//
//task1.add("牛乳を買う。");
//task1.add("○○社面談。");
//task1.add("手帳を買う。");
//task1.add("散髪に行く。");
//task1.add("スクールの課題を解く。");
//
//this.task = task1;
//
//return task1;
//}
