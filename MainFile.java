import java.io.*;
import java.util.Scanner;

public class MainFile 
{

	static void addRecord() 
	{
		Scanner sc = new Scanner(System.in);
		int choice1;
		
		System.out.println("------Enter Mode of transportation------");
		System.out.println("1. Airways");
		System.out.println("2. Railways");
		System.out.println("3. Roadways");
		
		choice1 = sc.nextInt();
		switch(choice1)
		{
			case 1: //System.out.println("Enter Source");
			try
			{	
				System.out.println("Enter Source");
				Scanner sc1 = new Scanner(System.in);
				File airways = new File("Airways.txt");
				if(airways.createNewFile())
				{
					System.out.println("BOOKING Through Airways ---->");
				}
				else
				{
					System.out.println("Airways Mode already CHOSEN and CREATED");
				}
				FileWriter airR = new FileWriter("Airways.txt");
				String dest1;
				dest1 = sc1.nextLine();
				airR.write("Source: "+dest1+"\n");
				airR.close();							// I have try catch block 'inside' outer 'try' block
				
				
				try
				{
					System.out.println("Enter Destination");
					Scanner scc1 = new Scanner(System.in);
					File file1 = new File("Airways.txt");
					FileWriter wr1 = null;
					String source1;
					source1 = scc1.nextLine();
					
					wr1 = new FileWriter(file1,true);
					wr1.write("Destination: "+source1+"\n");
					wr1.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Airways");
				}
				
				
				try
				{
					System.out.println("Enter Cost of Travel");
					Scanner sccc1 = new Scanner(System.in);
					File filee1 = new File("Airways.txt");
					FileWriter wrr1 = null;
					String sourcee1;
					sourcee1 = sccc1.nextLine();
					
					wrr1 = new FileWriter(filee1,true);
					wrr1.write("Cost: "+sourcee1+"\n");
					wrr1.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Airways");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating AIRWAYS File!");
			}
			break;
			
			case 2: System.out.println("Enter Source");
			try
			{	
				Scanner sc2 = new Scanner(System.in);
				File railways = new File("Railways.txt");
				if(railways.createNewFile())
				{
					System.out.println("BOOKING Through Railways ---->");
				}
				else
				{
					System.out.println("Railways Mode already CHOSEN and CREATED");
				}
				FileWriter railR = new FileWriter("Railways.txt");
				String dest2;
				dest2 = sc2.nextLine();
				railR.write("Source: "+dest2+"\n");
				railR.close();
				
				try
				{
					System.out.println("Enter Destination");
					Scanner scc2 = new Scanner(System.in);
					File file2 = new File("Railways.txt");
					FileWriter wr2 = null;
					String source2;
					source2 = scc2.nextLine();
					
					wr2 = new FileWriter(file2,true);
					wr2.write("Destination: "+source2+"\n");
					wr2.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Railways");
				}
				
				
				try
				{
					System.out.println("Enter Cost of Travel");
					Scanner sccc2 = new Scanner(System.in);
					File filee2 = new File("Railways.txt");
					FileWriter wrr2 = null;
					String sourcee2;
					sourcee2 = sccc2.nextLine();
					
					wrr2 = new FileWriter(filee2,true);
					wrr2.write("Cost: "+sourcee2+"\n");
					wrr2.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Railways");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating RAILWAYS File!");
			}
			break;
			
			case 3: System.out.println("Enter Source");
			try
			{	
				Scanner sc3 = new Scanner(System.in);
				File roadways = new File("Roadways.txt");
				if(roadways.createNewFile())
				{
					System.out.println("BOOKING Through Roadways ---->");
				}
				else
				{
					System.out.println("Roadways Mode already CHOSEN and CREATED");
				}
				FileWriter roadR = new FileWriter("Roadways.txt");
				String dest3;
				dest3 = sc3.nextLine();
				roadR.write("Source: "+dest3+"\n");
				roadR.close();
				
				try
				{
					System.out.println("Enter Destination");
					Scanner scc3 = new Scanner(System.in);
					File file3 = new File("Roadways.txt");
					FileWriter wr3 = null;
					String source3;
					source3 = scc3.nextLine();
					
					wr3 = new FileWriter(file3,true);
					wr3.write("Destination: "+source3+"\n");
					wr3.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Airways");
				}
				
				
				try
				{
					System.out.println("Enter Cost of Travel");
					Scanner sccc3 = new Scanner(System.in);
					File filee3 = new File("Roadways.txt");
					FileWriter wrr3 = null;
					String sourcee3;
					sourcee3 = sccc3.nextLine();
					
					wrr3 = new FileWriter(filee3,true);
					wrr3.write("Cost: "+sourcee3+"\n");
					wrr3.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Roadways");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating ROADWAYS File!");
			}
			break;
		}

	

	}
	
	static void updateRecord(String filepath,String oldString, String newString)
	{
		File change = new File(filepath);

		String oldContent = "";
		 
        BufferedReader reader = null;
         
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(change));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(change);
             
            writer.write(newContent);
          
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("EDIT SUCCESSFUL");
		
	}
	
	
	
	static void deleteRecord(String filename)
	{
		try
		{
		FileWriter br = new FileWriter(filename);
		br.write("");
		
		br.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	
	
	static void choiceSelector(int userChoice)
	{
		Scanner abc = new Scanner(System.in);
	
		 switch(userChoice)
		{
	        case 1:
	        	addRecord();
	            break;
	        case 2:
				Scanner a = new Scanner(System.in);
				String oldWord,newWord,nameOfFile;				
				
				System.out.println("Enter Name of file: ");
				nameOfFile = a.nextLine();
				
				System.out.println("Enter old word: ");				
				oldWord = a.nextLine();
				
				System.out.println("Enter new word: ");
			
				newWord = a.nextLine();
				
				
				updateRecord(nameOfFile,oldWord,newWord);
	        	
	            break;
	            
	        case 3:
	        	Scanner b = new Scanner(System.in);
				String filename;
				System.out.println("Enter name of file to be DELETED");
				filename = b.nextLine();
				deleteRecord(filename);
	        	break;
	        	
	      default:
	        		System.out.println("LOGGED OUT OF ADMIN");
	    }
			System.out.println("1. Add a Record");
			System.out.println("2. Update a Record");
			System.out.println("3. Delete a Record");
			System.out.println("4. Hit 0 to EXIT");
			userChoice = abc.nextInt();
			while(userChoice!=0)
			{
				choiceSelector(userChoice);
			}
			if(userChoice == 0)
			{
				System.out.println("LOGGED OUT OF ADMIN");
			}
			
	}
	
	public static void main(String[] args) 
	{


			Scanner ab = new Scanner(System.in);
			System.out.println("1. Add a Record");
			System.out.println("2. Update a Record");
			System.out.println("3. Delete a Record");
			System.out.println("4. Hit 0 to EXIT");
			int userChoice = ab.nextInt();
			choiceSelector(userChoice);		


	}

}