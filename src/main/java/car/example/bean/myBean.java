package car.example.bean;

public class myBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public void showMessage(){
        System.out.println("Message : "+ message);
    }

    @Override
    public String toString() {
        return "myBean{" +
                "message='" + message + '\'' +
                '}';
    }


}
