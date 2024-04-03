public class Car{
    int odometer = 0;
    String make = "make";
    String model = "model";

    public static void main(String[]args){
        Car c1 = new Car();
        System.out.println(c1.toString());
    }

    //constructors
    public Car() {
    }
    public Car(String make){
        this.make = make;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString(){
        return STR."Make: \{make}, Model: \{model}, Miles: \{odometer}";
    }

    public Boolean equals(Car anotherCar){
        return odometer == anotherCar.odometer && make.equalsIgnoreCase(anotherCar.make) && model.equalsIgnoreCase(anotherCar.model);
    }

}
