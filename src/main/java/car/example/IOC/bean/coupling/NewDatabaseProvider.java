package car.example.IOC.bean.coupling;

public class NewDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
