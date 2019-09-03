package avc;
import java.util.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class pull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the hour");
		int n=ob.nextInt();
		if(n>21) {System.out.println("enter vaid hour");n=0;}
		else if(n>21)n=n+3;
		else if(n>=9)n=n+2;
		else if(n>=3)n++;
		
		System.out.println("Trending tweets \n");
				
		

		Document document;
		try {
			
			document = Jsoup.connect("https://trends24.in/india/").userAgent("Mozilla/17.0").get();
			
			Element cls = document.select("div.trend-card").get(n); 
			Elements c2= cls.select("a[href]");
			int k=1;
			for(int i=0;i<10;i++)System.out.println((k++)+" " + c2.get(i).text());			
			

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
