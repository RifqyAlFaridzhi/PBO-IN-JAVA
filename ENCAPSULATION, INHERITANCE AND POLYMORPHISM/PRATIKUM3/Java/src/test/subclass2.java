package test;
import paket2.superclass2;
import paketInterface.MyInterface;

public class subclass2 extends superclass2 implements MyInterface{
    
    @Override
    public void showInfo() {
        System.out.println("info di subclass 2");
    }

    @Override
    public String getStringInfoState() {
        return "ini adalah subclass2 dari superclass 2";
    }
}
