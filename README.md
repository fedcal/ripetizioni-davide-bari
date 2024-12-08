# Ripetizioni

Classe **Corso**:
 - attributo *idCorso* è privato, posso accedere al valore di questo attributo solo attraverso il metodo getIdCorso() da ogni classe, indipendentemente dal package (cartella) in cui si trova la classe che richiama questo attributo.
 - attributo *nomeCorso* è public, posso accedere al valore direttamente da ogni classe in cui viene richiamato questo oggetto, indipendentemente dai package in cui vado a salvare le classi.
 - attributo *descrizioneCorso* è proteced, ciò significa che possiamo accedere direttamente all'attributo solo dalle classi che si trovano nello stesso package. Le classi che si trovano in un package diverso, devono NECESSARIAMENTE utilizzare il metodo getDescrizioneCorso().

Nel main ci sono gli elementi per gestire array, matrici e liste.
Ricordarsi che il (nomeArray/nomeMatrice).length restituisce:
- nel caso degli array il numero totale degli elementi
- nel caso delle matrici il numero di righe: arrayBidimensionale.length; mentre per il numero delle colonne arrayBidimensionale[0].length

Per conoscere il numero di elementi presenti in una matrice basta moltiplicare il numero di righe per il numero di colonne.

Se si utilizza le liste come nel caso di ArrayList, per conoscere il numero di elementi massimo contenuto all'interno della lista,
si utilizza il metodo nomelista.size()

Gli indici per indicare la posizione degli elementi vanno sempre da 0 a DimensioneMassima-1

## Comandi git

git pull: per prendere le modifiche dal sito di git

QUANDO FAI MODIFICHE
1. Prendere il codice aggiornato: git pull
2. Fare le modifiche al codice
3. git add .
4. git commit -m "GG/MM/yyyy" (ovviamente modificare la data)
5. git push -f origin
