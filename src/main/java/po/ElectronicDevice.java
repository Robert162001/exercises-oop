package po;

public interface ElectronicDevice {

    String getPowerSource();

    void setPowerSource(PowerSource power);

    boolean isPortable();

    enum PowerSource {
        ACCUMULATOR, BATTERIES, ELECTRIC_PLUG
    }

}
