import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class TimeСalculationList {


    public final static Random random = new Random();
    public List<String> namesList;
    public ArrayList<Long> nanoTimes = new ArrayList<>();
    final static String[] names = {"Андрей", "Ирина", "Полина", "Татьяна", "Сергей", "Екатерина",
            "Марина", "Николай", "Артем", "Иван", "Павел", "Елена", "Семен", "Роман", "Наталья",
            "Антон", "Александр", "Алексей", "Игорь", "Олеся"};

    public TimeСalculationList(int num){

        this.namesList =addNames(num);
    }


    public List<String> addNames(int num) {
        List<String> namesList = null;
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
            namesList.get(i);
        }
        // System.out.println("timesGetFirst" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }


    public void getLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.get(i);
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

    public void nameReplacement() {
        long start = System.nanoTime();
        namesList.set(random.nextInt(0, namesList.size() - 1), "Jack");
        //System.out.println("timesReplace" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }


    public void removeRandomName() {
        long start = System.nanoTime();
        namesList.remove("Jack");
        // System.out.println("timesRemoveRandomName=" + namesList.size() + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }

    public ArrayList<Long>  start() {
        getFirstNameList();
        getLastNameList();
        removeFirstNameList();
        removeLastNameList();
        nameReplacement();
        removeRandomName();
        System.out.println();


        return nanoTimes;
    }
}


