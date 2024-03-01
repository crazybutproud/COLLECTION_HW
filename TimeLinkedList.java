import java.util.LinkedList;
import java.util.List;

class TimeLinkedList extends TimeСalculationList {
    public TimeLinkedList(int num) {
        super(num);
    }
    @Override
    public List<String> addNames(int num) {
        List<String> namesList = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            namesList.add(names[random.nextInt(0, names.length - 1)]);
        }
        //System.out.println("timesAddName" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
        return namesList;
    }
}
