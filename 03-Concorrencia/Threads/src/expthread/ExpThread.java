package expthread;

/**
 * Demonstra duas formas de executar tarefas em threads.
 */
public class ExpThread {

    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Olá! Esta mensagem foi executada pela classe MyThread.");
        }
    }

    public static void main(String[] args) {
        Thread threadPorHeranca = new MyThread();

        Thread threadPorLambda = new Thread(() ->
                System.out.println("Olá! Esta mensagem foi executada por uma expressão lambda.")
        );

        threadPorHeranca.start();
        threadPorLambda.start();

        try {
            threadPorHeranca.join();
            threadPorLambda.join();
            System.out.println("As duas threads finalizaram.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("A execução principal foi interrompida.");
        }
    }
}
