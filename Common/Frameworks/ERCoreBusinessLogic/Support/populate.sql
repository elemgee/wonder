delete from ERCMAIL_STATE;
insert into ERCMAIL_STATE (ID, NAME) values ('xcpt', 'Exception');
insert into ERCMAIL_STATE (ID, NAME) values ('rtbs', 'Ready to be sent');
insert into ERCMAIL_STATE (ID, NAME) values ('sent', 'Sent');
insert into ERCMAIL_STATE (ID, NAME) values ('rcvd', 'Received');
insert into ERCMAIL_STATE (ID, NAME) values ('wait', 'Wait');
insert into ERCMAIL_STATE (ID, NAME) values ('proc', 'Processing');