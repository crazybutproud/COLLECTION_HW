import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeArrayDeque {
    public final static Random random = new Random();
    public ArrayDeque<String> namesList;
    public ArrayList<Long> nanoTimes = new ArrayList<>();
    final static String[] names = {"Андрей", "Ирина", "Полина", "Татьяна", "Сергей", "Екатерина",
            "Марина", "Николай", "Артем", "Иван", "Павел", "Елена", "Семен", "Роман", "Наталья",
            "Антон", "Александр", "Алексей", "Игорь", "Олеся"};

    public TimeArrayDeque(int num){

        this.namesList =addNames(num);
    }


    public ArrayDeque<String> addNames(int num) {
        ArrayDeque<String> namesList = new ArrayDeque<>();
        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            namesList.add(names[random.nextInt(0, names.length - 1)]);
        }
        //System.out.println("timesAddName" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
        return namesList;
    }


    public void getFirstNameList() {
        long start = System.nanoTime();
        for (int i = 0; i < namesList.size() * 0.05; i++) {
            namesList.getFirst();
        }
        // System.out.println("timesGetFirst" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }


    public void getLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.getLast();
        }
        //System.out.println("timesGetLast" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }


    public void removeFirstNameList() {
        long start = System.nanoTime();
        for (int i = 0; i < namesList.size() * 0.05; i++) {
            namesList.remove(0);
        }
        //System.out.println("timesRemoveFirst" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }


    public void removeLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.remove(i);
        }
        //System.out.println("timesRemoveLast" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }



    public void removeRandomName() {
        long start = System.nanoTime();
        namesList.remove("Роман");
        nanoTimes.add(System.nanoTime() - start);
    }

    public ArrayList<Long>  start() {
        getFirstNameList();
        getLastNameList();
        removeFirstNameList();
        removeLastNameList();
        removeRandomName();
        System.out.println();
        return nanoTimes;
    }

}
