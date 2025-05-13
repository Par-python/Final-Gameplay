public class BrakeType {

    private String brakeType;
    private double decceleration;

    public BrakeType(String brakeType){
        this.brakeType = brakeType;
        decceleration = 0;
    }

    public void checkBrake(){
        if (this.brakeType == "Candy Brakes"){
            CandyBrakesSpeed();
            
        } else if (this.brakeType == "Stripe Brakes"){
            StripeBrakesSpeed();
        } else if (this.brakeType == "Magic Brakes"){
            MagicBrakesSpeed();
        }
    }

    public void CandyBrakesSpeed(){
        decceleration = 0.01;
    }

    public void StripeBrakesSpeed(){
       decceleration = 0.03;
    }

    public void MagicBrakesSpeed(){
        decceleration = 0.05;
    }

    public double getDeccelerationFinal(){
        return decceleration;
    }
    public String getBrakeType(){
        return brakeType;
    }
}
