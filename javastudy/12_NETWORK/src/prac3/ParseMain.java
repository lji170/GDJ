package prac3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;

public class ParseMain {

	public static void main(String[] args) {
		
		// 영화 한 편  : Movie 객체
		// 영영화 전체 : List<Movie> 리스트
		
		File file = new File("C:\\storage", "boxoffice.xml");
		List<Movie> movies = new ArrayList<Movie>();
		
				
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			
			NodeList boxOfficeList = doc.getElementsByTagName("dailyBoxOffice");
			
			for(int i = 0; i < boxOfficeList.getLength(); i++) {
				
				Element boxOFfice = (Element) boxOfficeList.item(i);
				/*
				NodeList movieCdList =  boxOFfice.getElementsByTagName("movieCd");
				Node movieCd = movieCdList.item(0);
				String moiveCd = moiveCdNode.getTextContent();
				*/
				String movieCd = boxOFfice.getElementsByTagName("movieCd").item(0).getTextContent();
				String movieNm = boxOFfice.getElementsByTagName("movieNm").item(0).getTextContent();
				String openDt = boxOFfice.getElementsByTagName("openDt").item(0).getTextContent();
				String salesAcc = boxOFfice.getElementsByTagName("salesAcc").item(0).getTextContent();
				String audiAcc = boxOFfice.getElementsByTagName("audiAcc").item(0).getTextContent();
				
				Movie movie  = Movie.builder()
						.movieCd(movieCd)
						.movieNm(movieNm)
						.openDt(openDt)
						.salesAcc(salesAcc)
						.audiAcc(audiAcc)
						.build();
				
				movies.add(movie);
				
			}	// for 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}
   }												
	
}