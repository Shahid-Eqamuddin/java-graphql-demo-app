

insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(1,'Angular','Vakgroep Angular', 'http://mycompany.org/angular-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(2,'Continuous Delivery','Vakgroep Continuous Delivery', 'http://mycompany.org/cd-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(3,'COBOL','COBOL vakgroep', 'http://mycompany.org/cobol-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(4,'Frontend','Vakgroep Frontend', 'http://mycompany.org/frontend-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(5,'Java','Vakgroep Java','http://mycompany.org/java-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(6,'OPS','Vakgroep OPS','http://mycompany.org/ops-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(7,'Product Owners','Vakgroep Product Owners', 'http://mycompany.org/po-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(8,'Scrum-masters','Vakgroep Scrum-masters', 'http://mycompany.org/sm-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(9,'Testen','Vakgroep Testen', 'http://mycompany.org/testen-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(10,'Tridion','Vakgroep Tridion', 'http://mycompany.org/tridion-vakgroep');
insert into VAKGROEP (ID,NAAM,OMSCHRIJVING,HOMEPAGE) values(11,'UX / Visual Design','Vakgroep UX/Visua; Design', 'http://mycompany.org/vd-vakgroep');


insert into DEELNEMER (ID,NAAM) values(1,'Maarten');
insert into DEELNEMER (ID,NAAM) values(2,'Jan');
insert into DEELNEMER (ID,NAAM) values(3,'Andre');
insert into DEELNEMER (ID,NAAM) values(4,'Albert');
insert into DEELNEMER (ID,NAAM) values(5,'John');
insert into DEELNEMER (ID,NAAM) values(6,'Patrick');
insert into DEELNEMER (ID,NAAM) values(7,'Marcel');
insert into DEELNEMER (ID,NAAM) values(8,'Richard');
insert into DEELNEMER (ID,NAAM) values(9,'Donald');
insert into DEELNEMER (ID,NAAM) values(10,'Boris');
insert into DEELNEMER (ID,NAAM) values(11,'Bil');
insert into DEELNEMER (ID,NAAM) values(12,'Ana');
insert into DEELNEMER (ID,NAAM) values(13,'Lisa');
insert into DEELNEMER (ID,NAAM) values(14,'Katrina');
insert into DEELNEMER (ID,NAAM) values(15,'Sarah');
insert into DEELNEMER (ID,NAAM) values(16,'Beth');
insert into DEELNEMER (ID,NAAM) values(17,'Tricia');
insert into DEELNEMER (ID,NAAM) values(18,'Scott');
insert into DEELNEMER (ID,NAAM) values(19,'Edward');
insert into DEELNEMER (ID,NAAM) values(20,'Daniel');
insert into DEELNEMER (ID,NAAM) values(21,'Anita');


insert into SESSIE (ID,NAAM,DATUM) values(1,'Angular sessie 1','01-04-2019');
insert into SESSIE (ID,NAAM,DATUM) values(2,'Angular sessie 2','05-06-2019');
insert into SESSIE (ID,NAAM,DATUM) values(3,'Tridion sessie 1','08-07-2019');
insert into SESSIE (ID,NAAM,DATUM) values(4,'CD sessie 1','12-08-2019');
insert into SESSIE (ID,NAAM,DATUM) values(5,'Trdion sessie 2','14-09-2019');
insert into SESSIE (ID,NAAM,DATUM) values(7,'Java sessie 1','06-04-2019');
insert into SESSIE (ID,NAAM,DATUM) values(8,'Java sessie 2','06-06-2019');
insert into SESSIE (ID,NAAM,DATUM) values(9,'Java sessie 3','08-04-2019');
insert into SESSIE (ID,NAAM,DATUM) values(10,'Java sessie 4','09-05-2019');
insert into SESSIE (ID,NAAM,DATUM) values(11,'Trdion sessie 3','29-10-2019');
insert into SESSIE (ID,NAAM,DATUM) values(12,'Frontend sessie 1','08-04-2019');
insert into SESSIE (ID,NAAM,DATUM) values(13,'Frontend sessie 2','12-06-2019');
insert into SESSIE (ID,NAAM,DATUM) values(14,'Testen sessie 1','01-06-2019');
insert into SESSIE (ID,NAAM,DATUM) values(15,'Angular sessie 3','06-08-2019');
insert into SESSIE (ID,NAAM,DATUM) values(16,'Tridion sessie 2','22-10-2019');
insert into SESSIE (ID,NAAM,DATUM) values(17,'Angular sessie 4','04-01-2020');

insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(1,1,1);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(2,2,1);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(3,3,2);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(4,3,6);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(5,4,3);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(6,5,4);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(7,5,8);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(8,6,9);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(9,5,2);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(10,6,2);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(11,7,3);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(12,8,4);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(13,9,9);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(14,21,9);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(15,15,10);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(16,16,10);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(17,13,5);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(18,17,5);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(19,10,7);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(20,8,7);
insert into DEELNEMER_VAKGROEP (ID,DEELNEMER_ID, VAKGROEP_ID) values(21,7,4);


insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(1,1,1);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(2,2,1);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(3,3,10);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(4,4,2);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(5,15,1);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(6,16,10);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(7,17,1);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(8,12,4);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(9,7,5);
insert into SESSIE_VAKGROEP (ID,SESSIE_ID, VAKGROEP_ID) values(10,8,5);