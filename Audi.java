package exceptions;

public class Audi {
    private String name;
    private Double kilometer;

    public Audi(String name, Double speedKM) {
        this.name = name;
        this.kilometer = speedKM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSpeedKM() {
        return kilometer;
    }

    public void setSpeedKM(Double speedKM) {
        this.kilometer = speedKM;
    }
}
