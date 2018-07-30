package com.thoughtworks.training;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {



//        System.out.println(Lists.newArrayList(1,2,3));
//        System.out.println(ImmutableList.of(1,2,3));

        //traditional
//        List<Processer> processers = new ArrayList<>();
//        processers.add(new AddProcessor());
//        processers.add(new MutilProcesser());
//        processers.add(new SubProcessor());


//        NumberProcessor np = new NumberProcessor(new ArrayList<Processer>(){{add(new AddProcessor());add(new MutilProcesser()); }});
//        np.process("1 2 3 4 5",2);
//
//        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in));
//        String line;
//        while((line = in.readLine()).length()!=0){
//            System.out.println(np.process(line,2));
//        }

        //guava
        //apache commons
        //apache lang lang3


        //spring
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("test.xml"));
        NumberProcessor np1 = beanFactory.getBean(NumberProcessor.class);

        np1.process("1 2 3 4 5",2);

    }
}
