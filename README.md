# Exchange

## Instalare:
Asigurati-va ca aveti docker si rulati comanda de mai jos pentru a instala si rula container de postgre si pgadmin4:
```shell
docker-compose up
```
In caz contrar va trebui sa setati manual parametrii de conexiune la instanta locala de postgres, in 'application.properties'.

Pentru a rula aplicatia rulati
```shell
./gradlew bootRun
```

Pentru testarea functionalitatilor va puteti folosi de interfata swagger:  
[http://localhost:8080/swagger-ui/#/](http://localhost:8080/swagger-ui/#/)

## Cerinte:
- [x] Determinați atributele (Id, Code, etc.) și relațiile (1:n, n:m) necesare pentru entități.
- [x] Definiți constrângerile pentru schema bazei de date (chei primare, chei externe, constrângeri de unicitate).
- [x] Utilizând limbajul SQL,
  - [x] creați tabelele bazei de date; (fisierul src/main/resources/db/migration/create-tables.sql)
  - [x] populați tabelele cu date de test. (fisierul src/main/resources/db/migration/seed.sql)

- [x] Metoda POST care inserează ratele cursului valutar în tabela CursValutar la data curentă. Exemplu parametrii de intrare:
  ```json
  {"codValuta": "EUR", "rata": 1, "curs": 19.70}
  // sau
  {"codValuta": "KZT", "rata": 10, "curs": 0.40}
  // sau
  {"codValuta": "JPY", "rata": 100, "curs": 16.00}
  ```

- [x] Metoda GET care întoarce cursul valutar la data curentă după o anumita valută (de ex. EUR).
  Exemplu parametrii de ieșire
  ```json
  {"codValuta": "EUR", "rata": 1, "curs": 19.70,  "dataCurs": "2021-02-12"}
  ```
  
- [x] Metoda POST care reproduce cumpărare valută străina şi inserează date în tabela SchimbValutar. 
  Exemplu parametrii de intrare:
  ```json  
  {codValuta: "EUR", cursSchimb: 19.70, sumaPrimita: 100, sumaEliberata: (100*19,70), utilizator: "oper1"}
  ```

- [x] Metoda PUT ce corectează o suma pe valute în tabela Numerar.
  Exemplu parametrii de intrare
  ```json
  {"utilizator": "oper1", "codValuta": "EUR", "suma": 1450, "data": "2021-02-12"}
  ```