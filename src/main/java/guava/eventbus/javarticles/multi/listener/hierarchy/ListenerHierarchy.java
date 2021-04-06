package guava.eventbus.javarticles.multi.listener.hierarchy;

import com.google.common.eventbus.Subscribe;

public class ListenerHierarchy extends BaseListener {
    @Subscribe
    public void task(String s) {
        System.out.println("do task(" + s +")");
    }    
}