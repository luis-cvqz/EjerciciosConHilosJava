package Ejercicio2;

public class Programa2 {
    public static void main(String[] args) {
        Thread hola = new Thread(new HolaMundo("hola"));
        hola.start();

        Thread mundo = new Thread(new HolaMundo("mundo"));
        mundo.start();
    }

    static class HolaMundo extends Thread {
        private String message;

        public HolaMundo(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            while (true) {
                System.out.print(message + " ");
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
