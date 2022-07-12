import java.io.Serializable;

public class CarBean implements Serializable {
    private String make;
    private String model;

    public CarBean() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
