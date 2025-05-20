public class Turbo {
    private double addedTurbo;
    private boolean isTurboActive;

    public Turbo(){
        addedTurbo = 0;
        isTurboActive = false;
    }

    public void addedTubroAcceleration(){
        addedTurbo = 0.25;
        isTurboActive = true;
    }

    public boolean isTurboActive(){
        return isTurboActive;
    }

    public double getTurboBurst(){
        return addedTurbo;
    }
}
