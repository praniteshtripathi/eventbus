package guava.eventbus.javarticles.multi.listener.hierarchy;

import com.google.common.eventbus.Subscribe;

public class BaseListener extends AbstractListener {
    @Subscribe
    public void baseTask(String s) {
        System.out.println("do baseTask(" + s + ")");
    }
}