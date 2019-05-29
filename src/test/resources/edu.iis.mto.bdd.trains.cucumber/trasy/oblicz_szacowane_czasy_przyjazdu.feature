# language: pl
Funkcja: Informacja dla podróżnych o czasie przybycia do stacji docelowej
	W celu bardziej efektywnego planowania podróży
	Jako podróżny
	Chcę wiedzieć, o której godzinie dotrę do stacji docelowej

Scenariusz: Oszacuj czas przejazdu. 
	Zakładając, że chce sie przedostać z "Parramatta" do "TownHall" 
		i następny pociąg odjeżda o | 8:02	| na lini "Western"
	Gdy gdy zapytam o godzine "przyjazdu" 
	Wtedy powinienem uzyskać szacowany czas przejazdu:
	 | 8:29	| 
