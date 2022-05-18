package Hash_Maps;

import java.util.HashMap;

public class IOU {
     private HashMap<String, Double> IOU;

     public IOU() {
          this.IOU = new HashMap<>();
     }

     public void setSum( String toWhom, double amount) {
          this.IOU.put(toWhom, amount);
     }

     public double howMuchDoIOweTo(String toWhom) {
          if(!this.IOU.containsKey(toWhom)) {
          return 0.0;
          }
          return this.IOU.get(toWhom);
     }
}
