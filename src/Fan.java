

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean status;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String Showall() {
        String result = "Speed:\t"+this.getSpeed()+"\tColor:\t"+this.getColor()+"\tRadius\t"+this.getRadius();
        if (this.isStatus()){
            result+="\tFan is on;";
        }else{
            result+="\tFan is off;";
        }
        return result;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        System.out.println(fan1.Showall());
        System.out.println(fan2.Showall());
    }
}
