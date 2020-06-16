package com.jorgedirkx.lambda;

interface Executable{
    public void execute();
}

class Runner{
    public void run(Executable e){
        System.out.println("executing the block");
        e.execute();
    }
}

public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("hello");

            }
        });

        runner.run(()-> System.out.println("hello"));
    }

}
