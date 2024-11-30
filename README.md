# Ripetizioni

Classe **Corso**:
 - attributo *idCorso* è privato, posso accedere al valore di questo attributo solo attraverso il metodo getIdCorso() da ogni classe, indipendentemente dal package (cartella) in cui si trova la classe che richiama questo attributo.
 - attributo *nomeCorso* è public, posso accedere al valore direttamente da ogni classe in cui viene richiamato questo oggetto, indipendentemente dai package in cui vado a salvare le classi.
 - attributo *descrizioneCorso* è proteced, ciò significa che possiamo accedere direttamente all'attributo solo dalle classi che si trovano nello stesso package. Le classi che si trovano in un package diverso, devono NECESSARIAMENTE utilizzare il metodo getDescrizioneCorso().


