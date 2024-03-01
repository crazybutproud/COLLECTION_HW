import java.util.ArrayList;
import java.util.List;

class TimeArrayList extends TimeСalculationList {
    public TimeArrayList(int num) {
        super(num);
    }

    @Override
    public List<String> addNames(int num) {
        List<String> namesList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            namesList.add(names[random.nextInt(0, names.length - 1)]);
        }
        //System.out.println("timesAddName" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
        return namesList;
    }
}
