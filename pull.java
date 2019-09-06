

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class pull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		

		Document document;
		try {
			
			document = Jsoup.connect("https://trends24.in/india/").userAgent("Mozilla/17.0").get();
			System.out.println("Trending tweets \n");
			Element card = document.select("div.trend-card").first(); 
			Elements info= card.select("a[href]");
			for(int i=0;i<10;i++)System.out.println((i+1)+" " + info.get(i).text());
			
			} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
