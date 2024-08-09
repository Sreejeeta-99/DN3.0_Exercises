<<<<<<< HEAD
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (TransactionID, ChangeDate, ChangeType)
    VALUES (:NEW.TransactionID, SYSDATE, 'INSERT');
END;
/
=======
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (TransactionID, ChangeDate, ChangeType)
    VALUES (:NEW.TransactionID, SYSDATE, 'INSERT');
END;
/
>>>>>>> ded4dd6b13d832fcf35f0bc2b47fac54d2f0c41c
