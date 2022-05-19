package se.kth.iv1350.POS.view;

import se.kth.iv1350.POS.model.PaymentObserver;

public class TotalRevenueView implements PaymentObserver {
	private  double totalAmount;
	
	/**
	 * Writes the total revenue from the class that is being observed every time it
	 * gets notified about it. The writing is going to the console.
	 * 
	 * @param payment The payment that is registered in other layers (independent of the view)
	 */
	@Override
	public void newPayment(double payment) {
		totalAmount += payment;
		System.out.println("This is from the TotalRevenueView class, total payed amount is now "
				 + totalAmount + " \n");
		
	}

}
