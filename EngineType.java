public class EngineType {

    private String engineType;
    private double acceleration, speed, lessTopSpeed;
    private int gear;
    private boolean moneyShift;

    public EngineType(String engineType){
        this.engineType = engineType;
        acceleration = 0;
        speed = 0;
        gear = 1;
        moneyShift = false;
        lessTopSpeed = 0;
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

        // acceleration speeds 
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
        } else if(PlayerFrame.getSpeed() <= 190 - lessTopSpeed && PlayerFrame.getGearUpdate() == 6){
            acceleration = 0.025;
        }else {
            acceleration = 0;
        }

        //managing downshifting and moneyshift
        if(PlayerFrame.getGearUpdate() < PlayerFrame.getPrevGear()){
              double[] maxSpeed = {0, 60, 90, 120, 150, 170, 190};

            if(PlayerFrame.getSpeed() > maxSpeed[(int) PlayerFrame.getGearUpdate()]){
                moneyShift = true;
                ShortCakeMoneyShift();
            }
        }
    }

    public void ShortCakeMoneyShift(){
          double[] maxSpeed = {0, 60, 90, 120, 150, 170, 190};

          speed = maxSpeed[(int) PlayerFrame.getGearUpdate()];
    }
    
    public void MatchaSpeed(){

        // acceleration speeds 
        if(PlayerFrame.getSpeed() <= 70 && PlayerFrame.getGearUpdate() == 1){
            acceleration = 0.6;
        } else if ( PlayerFrame.getSpeed() <= 100 && PlayerFrame.getGearUpdate() == 2){
            acceleration = 0.3;
        } else if(PlayerFrame.getSpeed() <= 130 && PlayerFrame.getGearUpdate() == 3) {
            acceleration = 0.2;
        }  else if(PlayerFrame.getSpeed() <= 160 && PlayerFrame.getGearUpdate() == 4) {
            acceleration = 0.1;
        } else if(PlayerFrame.getSpeed() <= 180 && PlayerFrame.getGearUpdate() == 5){
            acceleration = 0.050;
        } else if(PlayerFrame.getSpeed() <= 205 - lessTopSpeed && PlayerFrame.getGearUpdate() == 6){
            acceleration = 0.025;
        }else {
            acceleration = 0;
        }

        //managing downshifting and moneyshift
        if(PlayerFrame.getGearUpdate() < PlayerFrame.getPrevGear()){
              double[] maxSpeed = {0, 70, 100, 130, 160, 180, 205};

            if(PlayerFrame.getSpeed() > maxSpeed[(int) PlayerFrame.getGearUpdate()]){
                moneyShift = true;
                MatchaMoneyShift();
            }
        }
    }

    public void MatchaMoneyShift(){
          double[] maxSpeed = {0, 70, 100, 130, 160, 180, 205};

          speed = maxSpeed[(int) PlayerFrame.getGearUpdate()];
    }

    public void ChocoloateSpeed(){

        // acceleration speeds 
        if(PlayerFrame.getSpeed() <= 90 && PlayerFrame.getGearUpdate() == 1){
            acceleration = 0.7;
        } else if ( PlayerFrame.getSpeed() <= 120 && PlayerFrame.getGearUpdate() == 2){
            acceleration = 0.3;
        } else if(PlayerFrame.getSpeed() <= 150 && PlayerFrame.getGearUpdate() == 3) {
            acceleration = 0.2;
        }  else if(PlayerFrame.getSpeed() <= 180 && PlayerFrame.getGearUpdate() == 4) {
            acceleration = 0.15;
        } else if(PlayerFrame.getSpeed() <= 200 && PlayerFrame.getGearUpdate() == 5){
            acceleration = 0.1;
        } else if(PlayerFrame.getSpeed() <= 225 - lessTopSpeed && PlayerFrame.getGearUpdate() == 6){
            acceleration = 0.025;
        }else {
            acceleration = 0;
        }

        //managing downshifting and moneyshift
        if(PlayerFrame.getGearUpdate() < PlayerFrame.getPrevGear()){
              double[] maxSpeed = {0, 90, 120, 150, 180, 200, 225};

            if(PlayerFrame.getSpeed() > maxSpeed[(int) PlayerFrame.getGearUpdate()]){
                moneyShift = true;
                CholocateMoneyShift();
            }
        }
    }

    public void CholocateMoneyShift(){
          double[] maxSpeed = {0, 90, 120, 150, 180, 200, 225};

          speed = maxSpeed[(int) PlayerFrame.getGearUpdate()];
    }

    public void tubroIsActivated(){
        lessTopSpeed -=30;
    }

    public boolean isMoneyShift(){        
        return moneyShift;
    }

    public void resetMoneyShift(){
        moneyShift = false;
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