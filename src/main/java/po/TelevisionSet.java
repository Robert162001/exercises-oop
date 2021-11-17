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

    TelevisionSet(int tvDiagonal, double tvLength, double tvWidth, String tvScreenResolution) {
        this.diagonal = tvDiagonal;
        this.length = tvLength;
        this.width = tvWidth;
        this.screenResolution = tvScreenResolution;
    }

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

    public static void main(String[] args) {

        TelevisionSet samsung = new TelevisionSet();
        TelevisionSet lg = new TelevisionSet(100);
        TelevisionSet panasonic = new TelevisionSet(110, 90, 70, "HD");

        samsung.setDiagonal(120);
        samsung.setLength(100);
        samsung.setWidth(60);
        samsung.setScreenResolution("HD+");

        lg.setLength(70);
        lg.setWidth(50);
        lg.setScreenResolution("HD");

        System.out.println("Samsung: " + samsung.getDiagonal() + " " + samsung.getLength() + " " + samsung.getWidth() + " " + samsung.getScreenResolution());
        System.out.println("LG: " + lg.getDiagonal() + " " + lg.getLength() + " " + lg.getWidth() + " " + lg.getScreenResolution());
        System.out.println("Panasonic: " + panasonic.getDiagonal() + " " + panasonic.getLength() + " " + panasonic.getWidth() + " " + panasonic.getScreenResolution());

    }
}
