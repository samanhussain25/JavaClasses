package Electronics;

public class Camera {
    public static void main(String [] args) {
        System.out.println("I take HQ pictures");
        Camera myCamera = new Camera();
        myCamera.takePictures();
    }
    public void takePictures() {
        System.out.println("This method allows me to Take pictures");
    }
}
