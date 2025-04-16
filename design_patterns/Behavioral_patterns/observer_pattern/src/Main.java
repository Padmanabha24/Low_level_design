import observable.*;
import observer.*;
public class Main {
    public static void main(String[] args) {

        VideoObservable newVideo=new NewVideo();

      NotificationObserver observer1 =new PushNotification("user1",newVideo);
      NotificationObserver observer2=new PushNotification("user2", newVideo);


      newVideo.add_subscribers(observer1);
      newVideo.add_subscribers(observer2);
      newVideo.notify_method();



    }
}