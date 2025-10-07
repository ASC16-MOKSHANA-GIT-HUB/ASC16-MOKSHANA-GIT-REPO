package demo;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C {
    void methodC();
}

class DemoClass implements B, C {
    @Override
    public void methodA() {
        System.out.println("Method A implemented");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented");
    }

    @Override
    public void methodC() {
        System.out.println("Method C implemented");
    }
}
