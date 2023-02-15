package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class program14 {
    public static void main(String[] args) {
        FileReader fr=new FileReader("/users/dell/Downloads/pokemon.csv");
        BufferedReader br=new BufferedReader(fr);
        String line;

        ArrayList<String> pokemons=new ArrayList<String>();
        while(line=br.readLine()!=null) {
            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Toal pokemons " + pokemons.size());
        ArrayList<String> pokemonTitles=new ArrayList<String>();

        for(String pok:pokemons) {
            String title=pok.split(",")[0];
            pokemonTitles.add(title);
        }
        System.out.println(pokemonTitles);
        br.close();
        fr.close();
    }
}
