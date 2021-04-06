package com.payment;


public class PaymentService {
	   private void onPaymentSuccessful(Payment payment) {
		  sendRecieptToSeller (payment);
		  sendRecieptToBuyer (payment);
		}

		private void sendRecieptToSeller (Payment payment) {
		  System.out.print("Reciept sent to seller");
		}

		private void sendRecieptToBuyer (Payment payment) {
		  System.out.print("Reciept sent to Buyer");
		}

}
