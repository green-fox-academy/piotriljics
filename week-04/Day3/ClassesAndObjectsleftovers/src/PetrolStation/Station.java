package PetrolStation;

public class Station {
    public static void main(String[] args) {}

        int gasAmount = 10000;
        public void refill (Car skoda){
            //ha a skoda nincs tele + van benzin az állomáson, akkor:
            if ((skoda.gasAmount != 100) && (gasAmount != 0)) {
                skoda.gasAmount += 1;
                this.gasAmount -= 1;
            }
        }
    }
