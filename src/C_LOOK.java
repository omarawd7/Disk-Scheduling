import java.util.ArrayList;
import java.util.Collections;

public class C_LOOK extends Scheduling{

    public C_LOOK(int start, int end, int headPointer, boolean Direction, ArrayList<Integer> queue) {
        super(start, end, headPointer,Direction,queue);//Start - End - HeadPointer
    }
    int current=HeadStart;
    int garbageValue=-1;
    public void Calculate(){
        queue.add(HeadStart);
        sequences.add(current);
        Collections.sort(queue);
        int indexOfHead = queue.indexOf(HeadStart);

        if(Direction){
            for(int i=indexOfHead+1;i<queue.size();i++){
                if(HeadStart<queue.get(i)&&queue.get(0)!=garbageValue){
                    TotalMovement+= Math.abs(current - queue.get(i));
                    current=queue.get(i);
                    sequences.add(queue.get(i));
                    // queue.remove(queue.get(i));
                    queue.set(i,garbageValue);
                }
            }
            for(int i=0;i<indexOfHead;i++){
                if(HeadStart>queue.get(i)&&queue.get(i)!=garbageValue){
                    TotalMovement+= Math.abs(current - queue.get(i));
                    current=queue.get(i);
                    sequences.add(queue.get(i));
                    // queue.remove(queue.get(i));
                    queue.set(i,garbageValue);
                }
            }
        }else{

            for(int j=indexOfHead-1;j>=0;j--){
                if(HeadStart>queue.get(j)&&queue.get(0)!=garbageValue){
                    TotalMovement+= Math.abs(current - queue.get(j));
                    current=queue.get(j);
                    sequences.add(queue.get(j));
                    //queue.remove(queue.get(j));
                    queue.set(j,garbageValue);
                }
            }
            for(int i=queue.size()-1;i>indexOfHead;i--){
                if(HeadStart<queue.get(i) && queue.get(i)!=garbageValue){
                    TotalMovement+= Math.abs(current - queue.get(i));
                    current=queue.get(i);
                    sequences.add(queue.get(i));
                    //queue.remove(queue.get(j));
                    queue.set(i,garbageValue);
                }
            }

        }

    }
/*    for(int i=indexOfHead+1;i<queue.size();i++){
        if(HeadStart<queue.get(i)&&queue.get(0)!=garbagevlaue){
         TotalMovement+= Math.abs(current - queue.get(i));
         current=queue.get(i);
         sequences.add(queue.get(i));
        // queue.remove(queue.get(i));
         queue.set(i,garbagevlaue);
        }
}
    for(int i=0;i<indexOfHead;i++){
        if(HeadStart>queue.get(i)&&queue.get(i)!=garbagevlaue){
           TotalMovement+= Math.abs(current - queue.get(i));
           current=queue.get(i);
           sequences.add(queue.get(i));
          // queue.remove(queue.get(i));
           queue.set(i,garbagevlaue);
          }
  }*/
}