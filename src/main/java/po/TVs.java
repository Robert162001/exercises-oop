package po;

public class TVs implements ElectronicDevice {

    private String powerSource;
    private int diagonal;
    private double length;
    private double width;
    private String screenResolution;
    private boolean isPortable = false;


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

}
