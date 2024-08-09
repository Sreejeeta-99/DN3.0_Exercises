<<<<<<< HEAD
CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob IN DATE
) RETURN NUMBER IS
BEGIN
    RETURN FLOOR((SYSDATE - p_dob) / 365);
END CalculateAge;
/
=======
CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob IN DATE
) RETURN NUMBER IS
BEGIN
    RETURN FLOOR((SYSDATE - p_dob) / 365);
END CalculateAge;
/
>>>>>>> ded4dd6b13d832fcf35f0bc2b47fac54d2f0c41c
