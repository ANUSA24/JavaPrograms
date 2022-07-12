class Vehicle{
    void run(){
        System.out.println("vehicle is running.");
    }
}
class MainIn extends Vehicle{
    void run(){
        System.out.println("bike is running safely.");
    }
    public static void main(String[] args){
        MainIn obj = new MainIn();
        obj.run();
    }
}
