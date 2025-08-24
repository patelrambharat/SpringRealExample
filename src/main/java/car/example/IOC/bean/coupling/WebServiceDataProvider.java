package car.example.IOC.bean.coupling;

public class WebServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Fetching Data From WebService";
    }
}
