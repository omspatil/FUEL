package ExceptionHandling;

public class Exception9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(3000);
                Thread.currentThread().interrupt();
                if (Thread.interrupted()) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                    throw new InterruptedException("Intterrupted");
                }
            }

            catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        }
    }
}
