package fr.lip6.move.gal.greatspn.order.ajout.OrderGenerator;


import fr.lip6.move.gal.greatspn.order.ajout.flag.OrderHeuristic;


public class OrderGenFactory {

	public static IOrderGenerator build (OrderHeuristic oh,String workFolder, String modelPath) {
		//config interface pour recup choix du runner + heuri
			return new GreatSPNOrderGen(workFolder, modelPath,oh);
		
	}
}
