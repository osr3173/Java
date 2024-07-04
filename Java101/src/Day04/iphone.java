package Day04;

// props 느낌
public class iphone implements Camera, FaceID, Siri {
    @Override
    public void takePhoto() {
        System.out.println("찰칵");
    }

    @Override
    public void FaceCheck() {
        System.out.println("'_'");
    }

    @Override
    public void Talk() {
        System.out.println("네");
    }
}
