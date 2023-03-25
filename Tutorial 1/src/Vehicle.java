abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Vehicle() {}

    public abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal(){
       while (getCurrentSpeed() < getMaxSpeed()){
           accelerate();
           currentSpeed++;
       }
    }
}
//cannot create instance variable bc it is an abstract class