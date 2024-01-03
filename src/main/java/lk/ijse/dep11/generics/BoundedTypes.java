package lk.ijse.dep11.generics;

public class BoundedTypes {

    public static void main(String[] args) {
        Super superInstance = new Super();
        A aInstance = new A();
        B bInstance = new B();
        C cInstance = new C(){};
        D dInstance = new D(){};
        MyType myTypeInstance = new MyType();
        MyType2 myType2Instance = new MyType2();
        MyType3 myType3Instance = new MyType3();
        myMethod(myType3Instance);
//        myMethod(bInstance);
    }

    static <T extends A & C> void myMethod(T t){
        System.out.println(t);
    }

    static class MyType extends A implements C{}
    static class MyType2 extends B implements C{}
    static class MyType3 extends MyType2{}
    static class Super{}
    static class A extends Super{}
    static class B extends A{}
    interface C{}
    interface D{}
}
