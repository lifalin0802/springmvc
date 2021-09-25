import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class HelloWorldMain {
    public static void main(String[] args){

        ArrayList list = new ArrayList();
        SpringBootApplication.run(HelloWorldMain.class,args);
}
