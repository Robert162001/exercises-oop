package po.edevices;

public class PlayWithDevices {

    public static void main(String[] args) {

        ElectronicDevice myMobilePhone = new Mobile();
        ElectronicDevice myTelevisionSet = new TelevisionSet();
        Catterpiller myCatterpiller = new Catterpiller();

        myMobilePhone.setPowerSource(ElectronicDevice.PowerSource.ACCUMULATOR);
        myTelevisionSet.setPowerSource(ElectronicDevice.PowerSource.ELECTRIC_PLUG);
        myCatterpiller.setPowerSource(ElectronicDevice.PowerSource.BATTERIES);

        System.out.println("My mobile phone");
        System.out.println(myMobilePhone.getPowerSource());
        System.out.println(myMobilePhone.switchOn());
        System.out.println(myMobilePhone.isPortable());
        System.out.println("-----------------------");
        System.out.println("My tv");
        System.out.println(myTelevisionSet.getPowerSource());
        System.out.println(myTelevisionSet.switchOn());
        System.out.println(myTelevisionSet.isPortable());
        System.out.println("-----------------------");
        System.out.println("My catterpiller");
        System.out.println(myCatterpiller.getPowerSource());
        System.out.println(myCatterpiller.switchOn());
        System.out.println(myCatterpiller.isPortable());
        System.out.println(myCatterpiller.imSpecial());

    }
}
