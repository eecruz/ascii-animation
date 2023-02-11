import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException 
	{

		int loops = 10;

		while(loops > 0)
		{
			FileReader reader = new FileReader("globe.txt");

			int data = reader.read();
			while(data != -1)
			{
				if((char) data - '0' != 5)						
					System.out.print((char)data);
				else
				{
					Thread.sleep(150);
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");						
				}

				data = reader.read();
			}

			loops--;
			reader.close();
		}
	}

}
