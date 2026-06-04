package projects1.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
  String name;
  boolean completed = false;

  Task(String name) {
    this.name = name;
  }

  void toggleTask() {
    this.completed = !completed;
  }
}

class TodoList {

  List<Task> tasks = new ArrayList<>();

  void addTask(String name) {
    tasks.add(new Task(name));
  }

  void removeTask(String num) {
    int index = Integer.parseInt(num) - 1;
    tasks.remove(index);
  }

  void toggleTaskCompleted(String num) {
    int index = Integer.parseInt(num) - 1;
 
    Task task = tasks.get(index);
    task.toggleTask();
  }

  void listTasks() {
    int i = 1;
    System.out.println("No | 할일 | 완료 상태");
    for (Task task : tasks) {
      System.out.printf("%d | %s | %b\n", i++, task.name, task.completed);
    }
  }
}

class App {

  TodoList todoList = new TodoList();

  App() {
    todoList.addTask("Eat");
    todoList.addTask("Sleep");
    todoList.addTask("Repeat");
  }

  void play() {
    Scanner scanner = new Scanner(System.in);
    String command;

    while (true) {
      System.out.println("\nTodoApp");
      todoList.listTasks();
      System.out.println("추가: add + 할일");
      System.out.println("삭제: drop + 번호");
      System.out.println("상태 바꾸기: update + 번호");
      System.out.println("종료: bye");
      System.out.print(">>>");

      command = scanner.nextLine();

      if ("bye".equals(command)) {
        System.out.println("잘가");
        break;
      }

      String[] arr = command.split(" ", 2);

      if ("add".equals(arr[0])) {
        todoList.addTask(arr[1]);
      } else if ("drop".equals(arr[0])) {
        todoList.removeTask(arr[1]);
      } else if ("update".equals(arr[0])) {
        todoList.toggleTaskCompleted(arr[1]);
      } else {
        System.err.println("잘못된 명령");
        break;
      }
    }

    scanner.close();
  }
}

public class Main {
  public static void main(String[] args) {
    App app = new App();
    app.play();
  }
}