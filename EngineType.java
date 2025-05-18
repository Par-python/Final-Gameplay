public class EngineType {

    private String engineType;
    private double acceleration, speed;
    private int gear;
    private boolean moneyShift;

    public EngineType(String engineType){
        this.engineType = engineType;
        acceleration = 0;
        speed = 0;
        gear = 1;
        moneyShift = false;

    }

    public void checkEngine(){
        if (this.engineType == "ShortCake Core"){
            ShortCakeSpeed();
            
        } else if (this.engineType == "Matcha Core"){
            MatchaSpeed();
        } else if (this.engineType == "ChocolateOverload Core"){
            ChocoloateSpeed();
        }
    }

    public void gearShiftU(){
        gear+=1;
    }

    public void gearShiftD(){
        gear-=1;
    }

    public void ShortCakeSpeed(){

        if(PlayerFrame.getSpeed() <= 60 && PlayerFrame.getGearUpdate() == 1){
            acceleration = 0.5;
        } else if ( PlayerFrame.getSpeed() <= 90 && PlayerFrame.getGearUpdate() == 2){
            acceleration = 0.4;
        } else if(PlayerFrame.getSpeed() <= 120 && PlayerFrame.getGearUpdate() == 3) {
            acceleration = 0.3;
        }  else if(PlayerFrame.getSpeed() <= 150 && PlayerFrame.getGearUpdate() == 4) {
            acceleration = 0.15;
        } else if(PlayerFrame.getSpeed() <= 170 && PlayerFrame.getGearUpdate() == 5){
            acceleration = 0.05;
        } else {
            acceleration = 0;
        }

        if(PlayerFrame.getGearUpdate() < PlayerFrame.getPrevGear()){
              double[] maxSpeed = {0, 60, 90, 120, 150, 170};

            if(PlayerFrame.getSpeed() > maxSpeed[(int) PlayerFrame.getGearUpdate()]){
                moneyShift = true;
                ShortCakeMoneyShift();
            }
        }
    }

    public void ShortCakeMoneyShift(){
          double[] maxSpeed = {0, 60, 90, 120, 150, 170};

          speed = maxSpeed[(int) PlayerFrame.getGearUpdate()];
    }

    public boolean isMoneyShift(){        
        return moneyShift;
    }

    public void resetMoneyShift(){
        moneyShift = false;
    }

    public void MatchaSpeed(){
       acceleration = 0.03;
    }

    public void ChocoloateSpeed(){
        acceleration = 0.05;
    }

    public double getAccelerationFinal(){
        return acceleration;
    }

    public int getGear(){
        return gear;
    }

    public double getSpeed(){
        return speed;
    }

    public String getEngineType(){
        return engineType;
    }
}
