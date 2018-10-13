# Projekt ma na celu zoptymalizować pracę prowadzących PubQuiz na terenie całej Polski
# WinApi

Założenia:
1. Aplikacja ma współpracować ze skryptem tabeli. 
2. Prowadzący będzie mógł wpisać w oknie w jednym z pól tekstowych nazwę drużyny i ilość osób, poniżej aplikacja sama wyliczy ile dana drużyna ma zapłacić za wstęp i przypomnieć prowadzącemu o wydaniu drużynie kart odpowiedzi i długopisu/-ów.
3. Dane napisane w polach będą importowane do poszczególnych pól w tabeli wyników, która będzie otwarta w osobnym oknie i wypełniana na bieżąco przez aplikację.
4. Po zakończeniu zapisów można kliknąć przycisk "zakończ zapisy", wtedy pojawia się okno/otwiera się zakładka wpisywania wyników dla drużyn - wystarczy zaznaczyć która runda się zakończyła i ile punktów uzyskała dana drużyna (kolejno po kategoriach), łącznie z odpowiedziami drużyn na pyt. dogrywkowe i jej prawidłową odpowiedzią.
5. W razie potrzeby, korekt można dokonywać na otwartym obok skrypcie tabeli. 
6. Po wpisaniu wszystkich danych można kliknąć przycisk "zakończ quiz".

Koniec aplikacji podstawowej.


7. Kliknięcie w/w przycisku sprawi pojawienie się okna z informacjami zbiorczymi (swego rodzaju sprawozdanie z quizu). Nastąpi przesłanie danych o:
- ilości osób 
- stawce za quiz w lokalu
- gaży prowadzącego
- w jaki sposób następuje płatność za quiz
- imienia i nazwiska (program sam wybierze inicjały)
- ewentualna notka z uwagami
8. przesyłanie danych w wordzie i excelu (w formie takiej jak dotychczasowe sprawozdania) na platformę dropbbox (automatycznie do folderu wyznaczonego wcześniej jako docelowy np.: Dropbox\Wrocław\Jan Kowalski. 
9. Przycisk "fotorelacja" ma otworzyć aplikację powerpoint i dodać znaki wodne do zdjęć, po czym zapisać slajdy w formacie jpeg.
10. Wygenerowany zostanie szablon tekstu do skopiowania na stronę PubQuizu danego miasta. Szablon zawierać będzie informacje o:
- ilości osób
- nazwie lokalu
- dacie
- nazwach drużyn na podium
- informacji o następnym nadchodzącym takim wdarzeniu.
11. Prowadzący będzie mógł wykorzystać szablon, lub stworzyć swój własny, unikatowy tekst do fotorelacji
