import java.io.*;
public class StreamPgm{
	public static void main(String[] args) throws IOException
	{
//		InputStreamReader ir=new InputStreamReader(System.in);
//		BufferedReader reader=new BufferedReader(ir);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		//reads line by line from user input
		String name=reader.readLine();
		System.out.println("Your name is "+name);
	}
}
