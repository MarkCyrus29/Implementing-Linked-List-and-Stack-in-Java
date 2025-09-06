public class Main {
  public static void main(String[] args) {
    LinkedList myList = new LinkedList();

    System.out.println("Adding 30 to the front...");
    myList.addFirst(30);
    myList.displayList();

    System.out.println("Adding 20 to the front...");
    myList.addFirst(20);
    myList.displayList();

    System.out.println("Adding 10 to the front...");
    myList.addFirst(10);
    myList.displayList();
  }
}