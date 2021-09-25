package com.itheima;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.xml.soap.Text;

public class Consumer_Listen {
    public static void main(String[] args) throws JMSException {

        ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://192.168.5.131:61616");
        Connection conn = factory.createConnection();

        conn.start();
        Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);

        Queue queue = session.createQueue("queue01");
        MessageConsumer consumer = session.createConsumer(queue);

        consumer.setMessageListener(new MessageListener() {

            @Override
            public void onMessage(Message message) {
                if(message instanceof TextMessage){
                    TextMessage msg = (TextMessage)message;
                    try {
                        System.out.println("listen recieved : "+ msg.getText());
                    }catch (JMSException ex){
                        ex.printStackTrace();
                    }
                }
            }
        });
        //监听模式下 勿关闭consumer的连接，否则消息无法接收
    }
}
