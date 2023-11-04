class Main {
  public static void main(String[] args) {
    SinglyLinkedList first = new SinglyLinkedList();
    first.createSinglyLinkedList(5);
    System.out.println(first.head.value);

    first.insertInLinkedList(6, 0);
    System.out.println(first.head.value);
  }
}