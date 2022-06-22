package thread;

public class Login implements Runnable{
    public static void main(String[] args) {
    }

    @Override
    public void run() {

        String[] list = {
                "☪ ☪ ☪ ☪ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀",
                "❀               CODEGYM              ❀",
                "❀------------------------------------❀",
                "❀                                    ❀",
                "❀           QUẢN LÝ SINH VIÊN        ❀",
                "❀                                    ❀",
                "❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀",
        };

        for (int i = 0; i< list.length;i++ ){
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(list[i]);
        }
    }
}
