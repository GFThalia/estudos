package estudos;

import conditionals.and.control.Reservation;

public class QualAlbumQueMaisEscutei {
	String nomealbum;
	int totalscrobbles;
	int qntmusicas;
	int tempoalbum;
	
			
 public QualAlbumQueMaisEscutei(String nalbum, int nfaixas, int tscrobble, int talbum, double xalbum){
	 nalbum = nomealbum;
	 nfaixas = qntmusicas;
	 talbum = tempoalbum;
	 tscrobble = totalscrobbles;
	 
	 //calculo quantas vezes escutei o album: numero total de scrobbles do album / pelo numero de musicas no album 
	 xalbum = tscrobble / nfaixas;
	 
 }
 
		
 public static void main(String[] args) {
	 QualAlbumQueMaisEscutei opcao1 = new QualAlbumQueMaisEscutei("Doolittle by Pixies", 15,);
	 QualAlbumQueMaisEscutei opcao2 = new QualAlbumQueMaisEscutei();
			
}
}

