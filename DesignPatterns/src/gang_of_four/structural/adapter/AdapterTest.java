package gang_of_four.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        WallReceiver receiver = new WallReceiver();
        PhoneCharger phoneCharger = new PhoneCharger();
        Chargeable220 phoneAdapter = new PhoneAdapter(phoneCharger);

        receiver.charge220Volts(phoneAdapter);
    }
}
