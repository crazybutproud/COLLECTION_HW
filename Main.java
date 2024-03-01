import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("ArrayList");
        System.out.println(new TimeArrayList(100).start());
        System.out.println(new TimeArrayList(2000).start());
        System.out.println(new TimeArrayList(50000).start());
        System.out.println("-----------------------------------------------");

        System.out.println("LinkedList");
        System.out.println(new TimeLinkedList(100).start());
        System.out.println(new TimeLinkedList(2000).start());
        System.out.println(new TimeLinkedList(50000).start());
        System.out.println("-----------------------------------------------");

        System.out.println("STACK");
        System.out.println(new TimeStack(100).start());
        System.out.println(new TimeStack(2000).start());
        System.out.println(new TimeStack(50000).start());
        System.out.println("-----------------------------------------------");

        System.out.println("ArrayDeque");
        System.out.println(new TimeArrayDeque(100).start());
        System.out.println(new TimeArrayDeque(2000).start());
        System.out.println(new TimeArrayDeque(50000).start());
        System.out.println("-----------------------------------------------");
    }
}
