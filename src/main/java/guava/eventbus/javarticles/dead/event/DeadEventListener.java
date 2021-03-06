package guava.eventbus.javarticles.dead.event;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class DeadEventListener {
    @Subscribe
    public void gotDeadEvent(DeadEvent deadEvent) {
        EventBus eventBus = (EventBus) deadEvent.getSource();
        System.out.println("Got dead event " + deadEvent.getEvent() + ", from " + eventBus);
    }
}