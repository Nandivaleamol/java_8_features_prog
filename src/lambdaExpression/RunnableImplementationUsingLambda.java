package lambdaExpression;

public class RunnableImplementationUsingLambda {
    public static void main(String[] args) {
        Runnable r = ()->{
          for (int i=0; i<=10; i++){
              System.out.println("Child Thread with Lambdas");
          }
        };
        // child thread
        Thread t = new Thread(r);
        t.start();

        // main thread
        for (int i=0; i<=10; i++){
            System.out.println("Main Thread...");
        }
    }
}
