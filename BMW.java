package Resources;


public class BMW implements Automobil{

    private int _rPM;
    private int _speed;
    private int _gear;
    public BMW(int rpm, int speed, int gear)
    {
        this._rPM = rpm;
        this._speed = speed;
        this._gear = gear; }
    
    public void changeRPM(int newValue) {
         this._rPM = newValue;
    }

    public void changeGear(int newValue) {
         this._gear = newValue;
    }

    public void speedUp(int increment) {
         this._speed = this._speed + increment;
    }

    public void applyBrakes(int decrement) {
         this._speed = this._speed - decrement;
    }

    public int GetRPM()
    {
        return this._rPM;
    }

    public int GetSpeed()
    {
        return this._speed;
    }

    public int GetGear()
    {
        return this._gear;
    }
}
