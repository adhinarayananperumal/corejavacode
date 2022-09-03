package com.ib.collectionexp;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {

		TicketPojo tp = new TicketPojo();
		tp.setTravelerName("siva");
		tp.setTrainDestination("Chennai");
		tp.setTickerFare(230.50f);

		TicketPojo tp1 = new TicketPojo();
		tp1.setTravelerName("kumar");
		tp1.setTrainDestination("Banglore");
		tp1.setTickerFare(900);
		
		TicketPojo tpp = new TicketPojo();
		tpp.setTravelerName("sujatha");
		tpp.setTrainDestination("delhi");
		tpp.setTickerFare(300);


		ArrayList<TicketPojo> la = new ArrayList();
		la.add(tp);
		la.add(tp1);
		la.add(tpp);

		System.out.println(la.size());
		
		TicketPojo tpobj = la.get(0);
		
		System.out.println(tpobj.getTravelerName());
		System.out.println("Fare is .."+ tpobj.getTickerFare());

		
		for(TicketPojo variabletpojo:la) {
			
			System.out.println("\n\n Traveller Name is ... " + variabletpojo.getTravelerName());
			System.out.println("Fare is .."+ variabletpojo.getTickerFare());

		}
		
		
		la.remove(0);
		System.out.println(la.size());

	}

}
