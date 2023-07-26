public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("Is TV turned on? " + smartTv.turnedOn);
        System.out.println("Current Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.turnOn();
        smartTv.increaseChannel();
        smartTv.decreaseChannel();
        smartTv.decreaseChannel();

        smartTv.increaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        smartTv.changeChannel(539);

        System.out.println("Is TV turned on? " + smartTv.turnedOn);
        System.out.println("Current Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

    }
}
