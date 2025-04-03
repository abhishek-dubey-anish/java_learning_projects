package dubey.abhishek.java_8_feature.comparatorInterface.withoutLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithoutLambdaComparatorMainClass {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(0);
        integerList.add(5);
        integerList.add(25);
        integerList.add(10);
        integerList.add(20);

        System.out.println("List before sorting: " + integerList);
        Collections.sort(integerList);
        System.out.println("List after sorting in Ascending order: " + integerList);
        Collections.sort(integerList, new ComparatorDESC());
        System.out.println("List after sorting in Descnding order: " + integerList);
    }
}
