package dubey.abhishek.java_8_feature.comparatorInterface.withoutLambda;

import java.util.Comparator;

public class ComparatorDESC implements Comparator<Integer> {
    @Override
    public int compare(Integer obj1, Integer obj2) {
        return obj1 > obj2 ? -1 : obj1 < obj2 ? 1 : 0;
    }
}
