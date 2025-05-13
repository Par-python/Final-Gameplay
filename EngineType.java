public class EngineType {

    private String engineType;
    private double acceleration, speed;
    private int gear;

    public EngineType(String engineType){
        this.engineType = engineType;
        acceleration = 0;
        speed = 0;
        gear = 1;

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

        if(PlayerFrame.getSpeed() <= 0.6 && PlayerFrame.getGearUpdate() == 1){
            acceleration = 0.03;
        } else if ( PlayerFrame.getSpeed() <= 0.9 && PlayerFrame.getGearUpdate() == 2){
            acceleration =0.01;
        } else if(PlayerFrame.getSpeed() <= 1.2 && PlayerFrame.getGearUpdate() == 3) {
            acceleration = 0.0075;
        }  else if(PlayerFrame.getSpeed() <= 1.5 && PlayerFrame.getGearUpdate() == 4) {
            acceleration = 0.0070;
        } else {
            acceleration = 0;
        }
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

    public String getEngineType(){
        return engineType;
    }
}
