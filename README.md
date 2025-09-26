Ogni utente registrato nel sistema può effettuare uno o più prestiti di materiali come libri o riviste. La relazione è di tipo uno-a-molti, dove un singolo utente può avere molteplici prestiti nel tempo.
Uno-a-molti

Un record nella tabella Utente può essere associato a più record nella tabella Prestito

Ogni prestito è sempre associato a un solo utente
Quando un utente prende in prestito un libro o una rivista, viene creato un nuovo record nella tabella Prestito con il suo Utente_Id e i dettagli dell’elemento prestato.
