<<<<<<< HEAD
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount IN NUMBER,
    p_interest_rate IN NUMBER,
    p_duration_years IN NUMBER
) RETURN NUMBER IS
    v_monthly_rate NUMBER := p_interest_rate / 12 / 100;
    v_total_months NUMBER := p_duration_years * 12;
BEGIN
    RETURN (p_loan_amount * v_monthly_rate) / (1 - POWER(1 + v_monthly_rate, -v_total_months));
END CalculateMonthlyInstallment;
/
=======
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount IN NUMBER,
    p_interest_rate IN NUMBER,
    p_duration_years IN NUMBER
) RETURN NUMBER IS
    v_monthly_rate NUMBER := p_interest_rate / 12 / 100;
    v_total_months NUMBER := p_duration_years * 12;
BEGIN
    RETURN (p_loan_amount * v_monthly_rate) / (1 - POWER(1 + v_monthly_rate, -v_total_months));
END CalculateMonthlyInstallment;
/
>>>>>>> ded4dd6b13d832fcf35f0bc2b47fac54d2f0c41c
