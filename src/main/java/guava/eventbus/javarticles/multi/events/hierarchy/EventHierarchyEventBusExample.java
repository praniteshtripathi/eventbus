package guava.eventbus.javarticles.multi.events.hierarchy;

import com.google.common.eventbus.EventBus;

public class EventHierarchyEventBusExample {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new FruitEaterListener());
       
        System.out.println("Post 'Orange as Fruit'");
        eventBus.post(new Fruit("Orange"));  
        
        System.out.println("Post 'Apple'");
        eventBus.post(new Apple());  
    }
}