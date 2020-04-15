package multithreading;

public class WaitNotify {
    public static void main(String[] args) {
        MessageBox box = new MessageBox();
        MessageProducer producer = new MessageProducer(box);
        MessageConsumer consumer = new MessageConsumer(box);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
            System.out.println("producer.getCnt() = " + producer.getCnt());
            System.out.println("consumer.getCnt() = " + consumer.getCnt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
