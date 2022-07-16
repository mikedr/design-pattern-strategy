public abstract class Ewallet {
    abstract void display();

    void installOnAndroid() {
        System.out.println("Install on Android");
    }
    void installOnIos() {
        System.out.println("Install on iOS");
    }

    abstract void  pay();
    abstract void invest();
}
