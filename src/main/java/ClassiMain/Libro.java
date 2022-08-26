package ClassiMain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Libro {

	private String nome;
	private String titolo;
	private String tipoCopertina;
	private String autore;

}
