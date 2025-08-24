package car.example.Autowire.Constuctor;

public class Car {
    private car.example.Autowire.Constuctor.Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details : " + specification.toString());
    }
}
