package com.qa.PaintWizard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class run {

	public static void main(String[] args) {

		Paint cheapoMax = new Paint(1999, 21, 10);
		Paint dogOne = new Paint(3438, 40, 12);
		Paint average = new Paint(1799, 16, 11);
		Paint dulux = new Paint(2500, 10, 22);

		ArrayList<Paint> Paints = new ArrayList<Paint>();

		Paints.add(cheapoMax);
		Paints.add(dogOne);
		Paints.add(average);
		Paints.add(dulux);

		int roomSize = 479;
		
		System.out.println("The cheapest paint for a room of size " + Integer.toString(roomSize) + " square-metres is:");
		System.out.println();
		
		
		
		Paints.stream().min(Comparator.comparing(s -> s.roomSize / s.coverageLitre * s.))		
	}

}
