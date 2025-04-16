
package observer;

import  observable.VideoObservable;

public class PushNotification implements NotificationObserver{
    String userId;
    VideoObservable observable;


    public PushNotification(String userId, VideoObservable observable) {
        this.userId = userId;
        this.observable = observable;
    }



    private  void sendPushNotfication(String userId,String msg){
        System.out.println(userId + " " + msg);
    }
    @Override
    public void update() {
        sendPushNotfication(userId, "new video out");

    }
}
