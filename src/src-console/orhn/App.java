package orhn;

class App{
    public static void main(String[] args) {
        System.out.println("Hello, World");    
        Sample.foo();
        Sample.bar();
        Mample.tar();
        System.out.println("Goodbye, World");
    }
}

class Sample{
    public static void foo()
    {
        System.out.println("Sample.foo");
        Mample.tar();
    }

    public static void bar()
    {
        System.out.println("Sample.bar");
        foo();
    }
}


class Mample {
    public static void tar()
    {
        System.out.println("Mample.tar");
    }
}