import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author qcl
 * @Description
 * @Date
 */
public class BCryptTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123321"));
    }
}
