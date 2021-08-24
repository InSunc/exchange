insert into valuta (cod)
values ('USD'), ('EUR'), ('RUB'), ('RON'), ('UAH');

insert into operator (nume, prenume)
values ('Ion', 'Romanciuc'), ('Nadejda', 'Copcenco'), ('Nicolae', 'Romanenco');

insert into numerar (valuta_id, suma, operator_id, "data")
values (1, 5000, 1, CURRENT_DATE),
	(1, 5000, 2, CURRENT_DATE),
	(1, 5000, 3, CURRENT_DATE),

	(2, 5000, 1, CURRENT_DATE),
	(2, 5000, 2, CURRENT_DATE),
	(2, 5000, 3, CURRENT_DATE),

	(3, 5000, 1, CURRENT_DATE),
	(3, 5000, 2, CURRENT_DATE),
	(3, 5000, 3, CURRENT_DATE),

	(4, 5000, 1, CURRENT_DATE),
	(4, 5000, 2, CURRENT_DATE),
	(4, 5000, 3, CURRENT_DATE),

	(5, 5000, 1, CURRENT_DATE),
	(5, 5000, 2, CURRENT_DATE),
	(5, 5000, 3, CURRENT_DATE);