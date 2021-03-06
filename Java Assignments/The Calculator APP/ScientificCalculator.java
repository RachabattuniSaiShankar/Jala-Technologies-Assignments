import java.io.*;

// Class Definition
class ScientificCalculator extends Calculate
{
	char Operator;
	Double dblNumber=new Double(0);

	ScientificCalculator(){}

	ScientificCalculator(double dblNumber,char Operator)
	{
		// Calls Super Class Constructor
		super(dblNumber,Operator);

		this.Operator=Operator;
		this.dblNumber=dblNumber;
	}

	public void Calc() throws java.io.IOException
	{
		boolean next;

		do
		{
			Double d=new Double(0);

			BufferedReader buffer
			  = new BufferedReader(new InputStreamReader(System.in));
			
			// Gets User Input
			System.out.println("Please enter the Operation (Sine-s, Cosine-c, Tangent-t, Log-l):");
			System.out.flush();
			String option=buffer.readLine();

			System.out.println("Please enter a Value: ");
			System.out.flush();
			try
			{
				d=Double.valueOf(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("***Please provide numeric values.***");
				System.exit(0);
			}
			
			if(option.length()==1)
			{
				// Creates Class Instance
				ScientificCalculator sc=new ScientificCalculator(d,option.charAt(0));

				// Calls Super Class Methods
				sc.doCalculation();
				sc.getResult();
			}
			else
			{
				System.out.println("***Operation Not Available. Please select any of the available options.***");
			}
			
			// Checks if the user would like to compute again
			System.out.println("Would you like to calculate again (y/n)?");
			System.out.flush();
			char aa=(char)buffer.read();
			if ((aa=='y') || (aa=='Y'))
			{
				next=false;
			}
			else
			{
				next=true;
			}
			
		}while (!next);
	}
}
