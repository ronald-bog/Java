import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, -1, -5}; //Array of integers with temperatures
        System.out.println(temp(array));
    }

    public static int temp(int[] ts) {
        List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
        Arrays.stream(ts).forEach(i -> (i > 0 ? pos : neg).add(i));
        return ts.length == 0 ? 0 : Collections.min(pos) > Math.abs(Collections.max(neg))
                ? Collections.max(neg) : Collections.min(pos);

    }
}
