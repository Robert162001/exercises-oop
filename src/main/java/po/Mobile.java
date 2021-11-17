package po;

public class Mobile implements ElectronicDevice {

    private int diagonal;
    private String brand;
    private String operatingSystem;
    private String powerSource;
    private boolean isPortable = true;

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

    Mobile(int mobileDiagonal, String mobileBrand, String mobileOperatingSystem) {
        this.diagonal = mobileDiagonal;
        this.brand = mobileBrand;
        this.operatingSystem = mobileOperatingSystem;
    }

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

    public static void main(String[] args) {

        Mobile samsung = new Mobile();
        Mobile iPhone = new Mobile("11 Pro");
        Mobile huawei = new Mobile(15, "P30", "HarmonyOS");

        samsung.setDiagonal(16);
        samsung.setBrand("S10+");
        samsung.setOperatingSystem("Android");

        iPhone.setDiagonal(14);
        iPhone.setOperatingSystem("iOS");

        System.out.println("Samsung: " + samsung.getDiagonal() + " " + samsung.getBrand() + " " + samsung.getOperatingSystem());
        System.out.println("iPhone: " + iPhone.getDiagonal() + " " + iPhone.getBrand() + " " + iPhone.getOperatingSystem());
        System.out.println("Huawei: " + huawei.getDiagonal() + " " + huawei.getBrand() + " " + huawei.getOperatingSystem());

    }

}
