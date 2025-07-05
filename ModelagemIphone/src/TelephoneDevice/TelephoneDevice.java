package TelephoneDevice;

public class TelephoneDevice implements TelephoneDeviceInterface {
    @Override
    public void initiateVoiceMail() {
        System.out.println("Running voice mails");
    }

    @Override
    public void answer() {
        System.out.println("Answering the phone");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }
}
