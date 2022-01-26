 CREATE TABLE bike(
             id INTEGER NOT NULL,
            contact BOOL,
            email VARCHAR(255) NOT NULL DEFAULT'',
            model VARCHAR(255) NOT NULL DEFAULT'' ,
            name VARCHAR(128) NOT NULL DEFAULT'',
            phone VARCHAR(255),
            purchase_date DATE,
            purchase_price DECIMAL,
            serial_number VARCHAR,
            PRIMARY KEY(id)
    
        );
 
 CREATE TABLE hibernate_sequence(
        next_val INTEGER
    );
 
 INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
      VALUES (1, true, 'jeff@bikes.com', 'Globo MTB 29 Full Suspension', 'Jeff Miller', '328-443-5555', '2015-10-1' , '1100');
 INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
      VALUES (2, false, 'samantha@bikes.com', 'Globo Carbon Fiber Race Series', 'Samantha Davis', '448-397-5555', '2018-04-11' , '1999');
 INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
      VALUES (3, true, 'dave@bikes.com', 'Globo Time Trial Blade', 'Dave Warren', '563-891-5555', '2018-04-11' , '2100');
   
   INSERT INTO hibernate_sequence (next_val) VALUES(4);