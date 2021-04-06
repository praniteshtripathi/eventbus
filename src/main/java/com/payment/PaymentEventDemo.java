package com.payment;

import com.google.common.eventbus.EventBus;

public class PaymentEventDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EventBus eventBus=EventBusFactory.getEventBus();
		 eventBus.register(new RecieptSender());
		 eventBus.post(new PaymentSuccessfulEvent());
	}

}
