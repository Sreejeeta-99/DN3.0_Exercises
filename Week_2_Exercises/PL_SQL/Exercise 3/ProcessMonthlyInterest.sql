<<<<<<< HEAD
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01) -- 1% interest rate
    WHERE AccountType = 'Savings';

    COMMIT;
END ProcessMonthlyInterest;
/
=======
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01) -- 1% interest rate
    WHERE AccountType = 'Savings';

    COMMIT;
END ProcessMonthlyInterest;
/
>>>>>>> ded4dd6b13d832fcf35f0bc2b47fac54d2f0c41c
