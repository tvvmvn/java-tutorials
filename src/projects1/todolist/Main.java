package projects1.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {

  private String name;
  private boolean completed = false;

  public Task(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void toggleTask() {
    this.completed = !completed;
  }
}

class TodoList {

  private List<Task> tasks = new ArrayList<>();

  public List<Task> getAllTasks() {
    return tasks;
  }

  public void addTask(String name) {
    Task newTask = new Task(name);
    tasks.add(newTask);
  }

  public void removeTask(int num) {
    int index = num - 1;
    if (index < 0 || index >= tasks.size()) {
      throw new IllegalArgumentException("잘못된 번호");
    }
    tasks.remove(index);
  }

  public void toggleTaskCompleted(int num) {
    int index = num - 1;
    if (index < 0 || index >= tasks.size()) {
      throw new IllegalArgumentException("잘못된 번호");
    }
    Task task = tasks.get(index);
    task.toggleTask();
  }
}

class View {
  void listTasks(List<Task> tasks) {
    System.out.println();
    System.out.println("<TodoApp>");
    System.out.println("No | 할일 | 완료 상태");
    for (int i = 0; i < tasks.size(); i++) {
      System.out.printf("%d | %s | %b\n", (i + 1), tasks.get(i).getName(), tasks.get(i).isCompleted());
    }
    System.out.println("추가: add + 할일 | 삭제: drop + 번호 | 토글: update + 번호 | 종료: exit");
  }
}

class Controller {
  
  private View view;
  private TodoList todoList = new TodoList();

  Controller(View view) {
    todoList.addTask("Eat");
    todoList.addTask("Sleep");
    todoList.addTask("Repeat");
    this.view = view;
  }

  void listTasks() {
    List<Task> tasks = todoList.getAllTasks();
    view.listTasks(tasks);
  }

  void addTask(String name) {
    todoList.addTask(name);

    List<Task> tasks = todoList.getAllTasks();
    view.listTasks(tasks);
  }

  void updateTask(String numString) {
    try {
      int num = Integer.parseInt(numString);
      todoList.toggleTaskCompleted(num);
      List<Task> tasks = todoList.getAllTasks();
      view.listTasks(tasks);
    } catch (NumberFormatException e) {
      System.out.println("올바른 숫자를 입력하세요");
    } catch (IllegalArgumentException e) {
      System.out.println("Ex: " + e.getMessage());
    }
  }

  void dropTask(String numString) {
    try {
      int num = Integer.parseInt(numString);
      todoList.removeTask(num);
      List<Task> tasks = todoList.getAllTasks();
      view.listTasks(tasks);
    } catch (IllegalArgumentException e) {
      System.out.println("Ex: " + e.getMessage());
    }
  }
}

class CommandHandler {

  Controller controller;
  private Scanner scanner = new Scanner(System.in);

  public CommandHandler(Controller controller) {
    this.controller = controller;
  }

  static int parseInt(String s) {
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println("숫자가 아니야!");
    } 
    return -1;
  }

  public void run() {
    String userInput;
    controller.listTasks();
    while (true) {
      System.out.print("> ");
      userInput = scanner.nextLine().trim();
      String[] parsedInput = userInput.split(" ", 2);
      String command = parsedInput[0];

      if ("list".equals(command)) {
        controller.listTasks();
      } else if ("add".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("추가할 일의 이름을 입력하세요");
          continue;
        }
        controller.addTask(parsedInput[1]);
      } else if ("drop".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("삭제할 일의 번호를 입력하세요");
          continue;
        }
        controller.dropTask(parsedInput[1]);
      } else if ("update".equals(command)) {
        if (parsedInput.length < 2) {
          System.out.println("수정할 일의 번호를 입력하세요");
          continue;
        }
        controller.updateTask(parsedInput[1]);
      } else if ("exit".equals(command)) {
        System.out.println("잘가");
        break;
      } else {
        System.err.println("잘못된 명령");
      }
    }
    scanner.close();
  }
}

public class Main {
  public static void main(String[] args) {
    View view = new View();
    Controller controller = new Controller(view);
    CommandHandler commandHandler = new CommandHandler(controller);
    commandHandler.run();
  }
}