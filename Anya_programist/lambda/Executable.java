package Anya_programist.lambda;

interface Executable {
    int execute();
}

class Runner {
    public void run(Executable e){}
}

class Test{
    public static void main(String[] args){
        Runner runner = new Runner();
        runner.run(()-> {
            System.out.println("ff");
            return 5;

        });
    }
}
