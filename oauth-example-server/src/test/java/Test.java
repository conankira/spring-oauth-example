import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

/**
 * Created by xushubing on 2018/9/5.
 */
public class Test {

    public static void main(String[] args){
        Pbkdf2PasswordEncoder pbkdf2PasswordEncoder = new Pbkdf2PasswordEncoder();
        System.out.println(pbkdf2PasswordEncoder.encode("marissa"));
    }
}
