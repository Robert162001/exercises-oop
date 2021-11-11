package po;

public class TelevisionSet implements ElectronicDevice {

    private int diagonal;
    private double length;
    private double width;
    private String screenResolution;
    private String powerSource;
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

    TelevisionSet() {

    }

    TelevisionSet(int tvDiagonal) {
        this.diagonal = tvDiagonal;
    }

    TelevisionSet constructor = new TelevisionSet(diagonal);

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public String switchOn() {
        return "Switch on TV";
    }

}
