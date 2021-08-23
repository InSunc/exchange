# Exchange

## Requirements:
- [ ] Metoda POST care inserează ratele cursului valutar în tabela CursValutar la data curentă. Exemplu parametrii de intrare:
  ```json
  {"codValuta": "EUR", "rata": 1, "curs": 19.70}
  // sau
  {"codValuta": "KZT", "rata": 10, "curs": 0.40}
  // sau
  {"codValuta": "JPY", "rata": 100, "curs": 16.00}
  ```

- [ ] Metoda GET care întoarce cursul valutar la data curentă după o anumita valută (de ex. EUR).
  Exemplu parametrii de ieșire
  ```json
  {"codValuta": "EUR", "rata": 1, "curs": 19.70,  "dataCurs": "2021-02-12"}
  ```
  
- [ ] Metoda POST care reproduce cumpărare valută străina şi inserează date în tabela SchimbValutar. 
  Exemplu parametrii de intrare:
  ```json  
  {codValuta: "EUR", cursSchimb: 19.70, sumaPrimita: 100, sumaEliberata: (100*19,70), utilizator: "oper1"}
  ```

- [ ] Metoda PUT ce corectează o suma pe valute în tabela Numerar.
  Exemplu parametrii de intrare
  ```json
  {"utilizator": "oper1", "codValuta": "EUR", "suma": 1450, "data": "2021-02-12"} )
  ```