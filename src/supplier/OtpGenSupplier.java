package supplier;

import java.util.function.Supplier;

public class OtpGenSupplier {
    public static void main(String[] args) {
        Supplier<String> s = ()->{
            String otp ="";
            for (int i=0; i<6; i++){
                otp = otp+ (int) (Math.random()*10);
            }
            return otp;
        };
        for (int i=0; i<10; i++){
            System.out.println(s.get());
        }
    }
}
