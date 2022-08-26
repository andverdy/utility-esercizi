package algoritmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Modelli.Album;

public class Lambda {

	public static void main(String[] args) throws Exception {

		List<Album> albums = new ArrayList<>();
		List<String> songs = new ArrayList<>();
		List<String> songs3 = new ArrayList<>();
		songs.add("Pippo");
		songs.add("Pluto");
		songs.add("Gerry");
		songs.add("Tom");
		albums.add(new Album("Pink Floyd", songs, 1994, "Picciolino"));
		// for(Album album : albums)
		// if(album.getYear() < 2000)
		// System.out.println(album.getAuthor());

		// prendi lo stream di albums, predi l'elemento singolo album e fai un controllo se è minore di 2000
		// allora inserisci in song3 il campo getTitle
		albums.stream().filter(album -> album.getYear() < 2000).map(Album::getTitle).forEach(songs3::add);
		//con il map è possibile prende l'iesimo elemento e richiamarne il campo
		// nel forEach viene chiamata la funzione da effettuare, song3 dove effett l'operazione, 
		//e dopo i doppi :: il tipo di operazione//
		
		for(String string : songs3) {
			System.out.println(string);
		}
		
		String[] picciolo = new String[] {"ciao", "miao"};
		
		String systemSource = Optional.ofNullable(picciolo).filter(x -> x.length > 1).map(x -> x[0]).orElseThrow(
				() -> new Exception());
		
		//----------------------------------------------------------------------------------
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach(numbers2::add);

	}
}
