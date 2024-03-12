package Ejercicio1;

public class Programa1 {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new ImprimirNumeros(1, 100));
        hilo1.setName("Hilo 1");
        hilo1.start();
        
        Thread hilo2 = new Thread(new ImprimirNumeros(100, 1));
        hilo2.setName("Hilo 2");
        hilo2.start();
    }

    static class ImprimirNumeros extends Thread {
        private int inicio;
        private int fin;

        public ImprimirNumeros(int inicio, int fin) {
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        public void run() {
            if (inicio < fin) {
                for (int i = inicio; i <= fin; i++) {
                    PrintNumber(i);
                    SleepThread();
                }
            } else {
                for (int i = inicio; i >= fin; i--) {
                    PrintNumber(i);
                    SleepThread();
                }
            }
        }

        private void PrintNumber(int i) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

        private void SleepThread(){
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
