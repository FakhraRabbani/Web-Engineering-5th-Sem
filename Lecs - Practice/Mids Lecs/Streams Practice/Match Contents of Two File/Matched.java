import java.io.*;

class Matched
{
	public static int wordsMatched(String file1, String file2)
	{
		int count = 0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file1));
			BufferedReader br2 = new BufferedReader(new FileReader(file2));

			String line1, line2;

			while(((line1 = br.readLine()) != null) && ((line2 = br2.readLine()) != null))
			{

				String words1[] = line1.split(" ");
				String words2[] = line2.split(" ");
	
				for(int i = 0; i < words1.length; i++)
				{
					for(int j = 0; j < words2.length; j++)
					{
						if(words1[i].equalsIgnoreCase(words2[i]))
						{
							count++;
							break;
						}
					}
				}
			}
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return count;
	} 

	public static int totalWords(String file)
	{
		int total = 0;

		try
		{
			BufferedReader br3 = new BufferedReader(new FileReader(file));

			String line3;
			while((line3 = br3.readLine()) != null)
			{
				String wordsInLine[] = line3.split("");
				total += wordsInLine.length;
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return total;
	}

	public static void main(String args[])
	{
		int matchedWords = wordsMatched("file1.txt", "file2.txt");
		int totalWordsF1 = totalWords("file1.txt");
		int totalWordsF2 = totalWords("file2.txt");

		int total_words = Math.max(totalWordsF1, totalWordsF2);
		double percentageMatched = ((double) matchedWords / total_words) * 100;

		System.out.println("Percentage of matched content: " + percentageMatched);
	}
}