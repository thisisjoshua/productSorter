import javax.swing.JOptionPane;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		boolean continueInput = true;
		
		do
		{
			input = JOptionPane.showInputDialog("Enter a string for a password:");
			
			if (isValidPassword(input))
			{
				JOptionPane.showMessageDialog(null,  "Your password is valid");
				int option = JOptionPane.showConfirmDialog(null, "Would you like to input another password?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.NO_OPTION)
				{
					System.exit(0);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your password is invalid");
				int option = JOptionPane.showConfirmDialog(null, "Would you like to input another password?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.NO_OPTION)
				{
					System.exit(0);
				}
			}
		} while (continueInput);
		
		
	}
	
	public static boolean isValidPassword(String password)
	{
		int numCounter = 0;
		
		String specChar = "(.*[%, &, #].*$)";
		for (int i = 0; i < password.length(); i++)
		{
			if(password.length() >= 8)
			{
				if (Character.isDigit(password.charAt(i)))
				{
					numCounter++;
					if (numCounter >= 2)
					{
						if (password.matches(specChar))
						{							
							return true;
						}
						
					}
					
				}
			}					
		}		
		return false;		
	}
}
