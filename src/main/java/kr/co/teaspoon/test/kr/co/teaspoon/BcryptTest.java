package kr.co.teaspoon.test.kr.co.teaspoon;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


// 암호화
public class BcryptTest {
    public static void main(String[] args) {
        String pw = "1234";
        BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
        System.out.println(pwEncoder.encode(pw));
    }
}
