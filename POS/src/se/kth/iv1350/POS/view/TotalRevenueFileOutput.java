package se.kth.iv1350.POS.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import se.kth.iv1350.POS.model.PaymentObserver;

/**
 * A fileWriter that can write to a file whenever it is notified about a payment using the observer
 * pattern functionality.
 *
 * @author abbas
 *
 */
public class TotalRevenueFileOutput implements PaymentObserver {
	private double totalAmount;
	
	/**
	 * 
	 * Writes the total revenue from the class that is being observed every time it
	 * gets notified about it. The writing is going to a txt file (TotalRevenueOutput.txt).
	 * 
     * @param payment The payment that is registered in other layers (independent of the view)
	 */
	@Override
	public void newPayment(double payment) {
		totalAmount += payment;
		try {
			FileWriter outputFile = new FileWriter("TotalRevenueOutput.txt");
			BufferedWriter writer = new BufferedWriter(outputFile);
			writer.write("The total revenue is now: " +	totalAmount);
			writer.close();
		} catch(IOException exc) {
			System.out.print("Could not write to the file");
			exc.printStackTrace();
		}

		
	}

}
