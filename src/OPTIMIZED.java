import java.util.ArrayList;
import java.util.Collections;

public class OPTIMIZED extends Scheduling{
    public OPTIMIZED(int start, int end, ArrayList<Integer> queue) {
        super(start, end,queue);
    }

    public void Calculate(){ //38, 180, 130, 10,50, 15, 190, 90, 150
        queue.add(0);
        Collections.sort(queue);
        int size = queue.size()-1;
        for (int i = 0 ; i<size; i++)
            TotalMovement+= Math.abs(queue.get(i) - queue.get(i+1));
        sequences.addAll(queue);
    }
}