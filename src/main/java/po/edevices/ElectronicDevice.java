package po.edevices;

public interface ElectronicDevice {

    String getPowerSource();

    void setPowerSource(PowerSource power);

    boolean isPortable();

    String switchOn();

    enum PowerSource {
        ACCUMULATOR, BATTERIES, ELECTRIC_PLUG
    }

}
