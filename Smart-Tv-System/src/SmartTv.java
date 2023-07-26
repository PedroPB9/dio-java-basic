public class SmartTv {
    boolean turnedOn = false;
    int channel = 512;
    int volume = 25;

    public void turnOn() {
        turnedOn = !turnedOn;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseChannel()
    {
        if(channel < 800) {
            channel++;
        }
    }

    public void decreaseChannel()
    {
        if(channel > 1) {
            channel--;
        }
    }

    public void increaseVolume()
    {
        if(volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume()
    {
        if(volume > 0) {
            volume--;
        }
    }
}