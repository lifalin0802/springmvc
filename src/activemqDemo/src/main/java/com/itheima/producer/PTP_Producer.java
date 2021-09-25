package com.itheima.producer;

import org.apache.activemq.ActiveMQConnectionFactory;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import javax.jms.*;

public class PTP_Producer {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://192.168.5.131:61616");
        Connection conn = factory.createConnection();

        Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("queue01");
        MessageProducer messageProducer = session.createProducer(queue);
        TextMessage textMessage = session.createTextMessage("test message");

        messageProducer.send(textMessage);
        System.out.println("消息发送完成");
        session.close();
        conn.close();
    }

}
