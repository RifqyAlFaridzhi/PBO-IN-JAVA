package test;
import paket10.superclass10;
import paketInterface.MyInterface;

public class subclass10 extends superclass10 implements MyInterface{
    @Override
    public String getStringInfoState() {
        return "ini adalah subclass10 dari superclass 10";
    }
}