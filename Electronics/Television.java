package Electronics;

public class Television {
    public static void main(String[] args) {
        System.out.println("I am playing movies");
        Television myTelevision = new Television();
        myTelevision.shows();
        myTelevision.pause();
        myTelevision.movies();
        myTelevision.youTube();
        myTelevision.fastForward();
        myTelevision.rewind();
        myTelevision.netflix();
        myTelevision.volumeUp();
        myTelevision.volumeDown();
        myTelevision.displaySettings();
        myTelevision.changeChannelUp();
        myTelevision.changeChannelDown();
        myTelevision.record();
    }
    public void pause() {
        System.out.println("This method allows me to Pause");
    }
    public void movies() {
        System.out.println("This method allows me to show Movies");
    }
    public void shows() {
        System.out.println("This method allows me to play shows");
    }
    public void youTube() {
        System.out.println("This method allows me to run YouTube");
    }
    public void fastForward() {
        System.out.println("This method allows me to Fast Forward");
    }
    public void rewind() {
        System.out.println("This method allows me to Rewind");
    }
    public void netflix() {
        System.out.println("This method allows me to run Netflix");
    }
    public void volumeUp() {
        System.out.println("This method will allow me to increase Volume");
    }
    public void volumeDown() {
        System.out.println("This method will allow me to decrease Volume");
    }
    public void displaySettings() {
        System.out.println("This method will allow me to adjust Display Settings");
    }
    public void changeChannelUp() {
        System.out.println("This method will allow me to browse through channels up");
    }
    public void changeChannelDown(){
        System.out.println("This method will allow me to browse through channels down");
    }
    public void record() {
        System.out.println("This method will allow me to record");
    }
}
