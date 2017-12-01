package afvink1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Opdracht1 {

	public static void main(String[] args) {

		String pad = "resource/Homo_sapiens.gene_info";
		try {
			ArrayList<Gene> lijst = readfile(pad);
			System.out.println(lijst.subList(0, 10));
			
			Collections.sort(lijst);
			
			System.out.println(lijst.subList(0, 10));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static ArrayList<Gene> readfile(String pad) throws IOException{

		//StringBuilder bob = new StringBuilder(); // haha snap je hem want bob de bouwer


		// BufferedReader lezer;
	
			BufferedReader lezer = new BufferedReader(new FileReader(pad));
			String regel = lezer.readLine();
			String[] arrie = regel.split("\t");
			
			final int GenID = 1;
			final int Symbol =2;
			final int map_location =7;
			String[] piet;
			ArrayList<Gene> genLijst= new ArrayList<Gene>(6000);
			
			regel = lezer.readLine();
			
			while (regel != null) {
				piet = regel.split("\t");
				String gen = piet[GenID];
				String symbol= piet[Symbol] ;
				String locatie= piet[map_location];
				Gene temp = new Gene(gen,symbol,locatie);
				
				genLijst.add(temp);
				
				regel = lezer.readLine();
			}
			
			return genLijst;
		

	}
}
