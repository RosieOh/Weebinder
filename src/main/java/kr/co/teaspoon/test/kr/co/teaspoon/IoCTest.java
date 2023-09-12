package kr.co.teaspoon.test.kr.co.teaspoon;

import kr.co.teaspoon.dto.Person;
import org.springframework.context.support.GenericXmlApplicationContext;

public class IoCTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext factory;
        factory = new GenericXmlApplicationContext("GenericXmlApplicationContext.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person.getSample().getNo());
        System.out.println(person.getSample().getName());
        System.out.println(person.getTel());
    }
}
