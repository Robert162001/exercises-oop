package po;

public class Mobile implements ElectronicDevice {

    private int diagonal;
    private String brand;
    private String operatingSystem;
    private String powerSource;
    private boolean isPortable;

    @Override
    public String getPowerSource() {
        return powerSource;
    }

    @Override
    public void setPowerSource(PowerSource power) {
        this.powerSource = power.name();
    }

    public void setPortable(boolean portable) {
        this.isPortable = portable;
    }

    @Override
    public boolean isPortable() {
        return isPortable;
    }

    Mobile() {

    }

    Mobile(String mobileBrand) {
        this.brand = mobileBrand;
    }

    Mobile constructor = new Mobile(brand);

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String switchOn() {
        return "Switch on Phone";
    }

}
