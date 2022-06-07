package controller;

import java.util.ArrayList;
import java.util.List;

import model.Task;

public class Esercizio {
	
	public static List<Task> lista = generaListaTask();

	public static void main(String[] args) {
		
		System.out.println("Gantt time is: " + getGant());

	}

	private static List<Task> generaListaTask() {
		List<Task> listaTemp = new ArrayList<Task>();
		Task task1 = new Task(1, 3, -1);
		Task task2 = new Task(2, 9, -1);
		Task task3 = new Task(3, 4, 1);
		Task task4 = new Task(4, 7, 3);
		Task task5 = new Task(5, 5, 1);
		
		listaTemp.add(task1);
		listaTemp.add(task2);
		listaTemp.add(task3);
		listaTemp.add(task4);
		listaTemp.add(task5);
		return listaTemp;
	}
	
	private static int getGant() {
		
		int maxInitTime = -1;
		
		for(Task t: lista) {
			maxInitTime = getMax(maxInitTime, getRecursiveTime(t));
		}
		
		return maxInitTime;
		
	}
	
	private static int getRecursiveTime(Task t) {
		
		if(t.getDpendenteTaskId() == -1) {
			return t.getDuration();
		}
		
		Task next=null;
		for(Task task: lista) {
			if(task.getId() == t.getDpendenteTaskId()) {
				next = task;
				break;
			}
		}
		
		
		return t.getDuration() + getRecursiveTime(next);
		
	}
	
	private static int getMax(int a, int b) {
		if(a < b) {
			return b;
		}else {
			return a;
		}
	}
	
}
