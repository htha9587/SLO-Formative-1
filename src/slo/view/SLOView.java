package slo.view;

import javax.swing.JOptionPane;
/**
 * This class has popups for input and output.
 * @author htha9587
 *
 */


public class SLOView {
/**
 * Provides popup box for asking questions and allows the user to answer.
 */

	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	
}
