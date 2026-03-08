-- ============================================================
-- SEED DATA: 30 Patients across 4 age groups + 30 Insurance
-- Age Groups: Children (0-12), Teens (13-17), Adults (18-59), Seniors (60+)
-- ============================================================

INSERT INTO patient
(birth_date, email, gender, name, blood_group, created_at)
VALUES
    -- CHILDREN (0–12) — born 2014–2026
    ('2020-03-12', 'aarav.p@gmail.com',   'male',   'Aarav',   'A_Positive',  NOW()),
    ('2018-07-25', 'diya.k@gmail.com',    'female', 'Diya',    'B_Positive',  NOW()),
    ('2016-11-04', 'rohan.m@gmail.com',   'male',   'Rohan',   'O_Positive',  NOW()),
    ('2015-01-19', 'anvi.r@gmail.com',    'female', 'Anvi',    'AB_Positive', NOW()),
    ('2014-09-30', 'krish.s@gmail.com',   'male',   'Krish',   'A_Negative',  NOW()),
    ('2019-05-08', 'ishita.t@gmail.com',  'female', 'Ishita',  'B_Negative',  NOW()),
    ('2017-02-14', 'vihaan.d@gmail.com',  'male',   'Vihaan',  'O_Negative',  NOW()),

    -- TEENS (13–17) — born 2008–2013
    ('2013-06-20', 'arjun.l@gmail.com',   'male',   'Arjun',   'AB_Negative', NOW()),
    ('2011-10-11', 'priya.n@gmail.com',   'female', 'Priya',   'A_Positive',  NOW()),
    ('2010-04-03', 'rahul.v@gmail.com',   'male',   'Rahul',   'B_Positive',  NOW()),
    ('2009-08-17', 'sneha.g@gmail.com',   'female', 'Sneha',   'O_Positive',  NOW()),
    ('2008-12-29', 'karan.b@gmail.com',   'male',   'Karan',   'AB_Positive', NOW()),
    ('2012-03-05', 'meera.c@gmail.com',   'female', 'Meera',   'A_Negative',  NOW()),

    -- ADULTS (18–59) — born 1965–2007
    ('2000-07-22', 'aditya.r@gmail.com',  'male',   'Aditya',  'B_Negative',  NOW()),
    ('1998-02-14', 'pooja.s@gmail.com',   'female', 'Pooja',   'O_Negative',  NOW()),
    ('1995-11-30', 'nikhil.m@gmail.com',  'male',   'Nikhil',  'AB_Negative', NOW()),
    ('1990-05-16', 'divya.p@gmail.com',   'female', 'Divya',   'A_Positive',  NOW()),
    ('1985-09-08', 'sanjay.t@gmail.com',  'male',   'Sanjay',  'B_Positive',  NOW()),
    ('1980-01-25', 'lakshmi.k@gmail.com', 'female', 'Lakshmi', 'O_Positive',  NOW()),
    ('1975-04-13', 'tarun.v@gmail.com',   'male',   'Tarun',   'AB_Positive', NOW()),
    ('1970-08-07', 'nisha.g@gmail.com',   'female', 'Nisha',   'A_Negative',  NOW()),
    ('2007-06-18', 'suresh.d@gmail.com',  'male',   'Suresh',  'B_Negative',  NOW()),
    ('2005-10-01', 'rekha.b@gmail.com',   'female', 'Rekha',   'O_Negative',  NOW()),

    -- SENIORS (60+) — born before 1966
    ('1965-03-20', 'manish.c@gmail.com',  'male',   'Manish',  'AB_Negative', NOW()),
    ('1960-07-14', 'swati.r@gmail.com',   'female', 'Swati',   'A_Positive',  NOW()),
    ('1955-11-28', 'deepak.s@gmail.com',  'male',   'Deepak',  'B_Positive',  NOW()),
    ('1950-05-09', 'anjali.t@gmail.com',  'female', 'Anjali',  'O_Positive',  NOW()),
    ('1948-01-31', 'ravi.l@gmail.com',    'male',   'Ravi',    'AB_Positive', NOW()),
    ('1943-09-17', 'geeta.m@gmail.com',   'female', 'Geeta',   'A_Negative',  NOW()),
    ('1940-12-05', 'amit.p@gmail.com',    'male',   'Amit',    'B_Negative',  NOW());


-- ============================================================
-- 30 Insurance Records
-- ============================================================

INSERT INTO insurance (policy_number, provider, valid_date, created_at) VALUES
                                                                            ('POL-100001', 'Star Health',    '2027-12-31', NOW()),
                                                                            ('POL-100002', 'ICICI Lombard',  '2027-06-30', NOW()),
                                                                            ('POL-100003', 'HDFC ERGO',      '2028-03-15', NOW()),
                                                                            ('POL-100004', 'Care Health',    '2027-09-20', NOW()),
                                                                            ('POL-100005', 'Max Bupa',       '2028-01-10', NOW()),
                                                                            ('POL-100006', 'Star Health',    '2027-11-11', NOW()),
                                                                            ('POL-100007', 'ICICI Lombard',  '2027-04-05', NOW()),
                                                                            ('POL-100008', 'HDFC ERGO',      '2028-02-19', NOW()),
                                                                            ('POL-100009', 'Care Health',    '2027-08-08', NOW()),
                                                                            ('POL-100010', 'Max Bupa',       '2027-10-30', NOW()),
                                                                            ('POL-100011', 'Star Health',    '2028-05-14', NOW()),
                                                                            ('POL-100012', 'ICICI Lombard',  '2027-12-25', NOW()),
                                                                            ('POL-100013', 'HDFC ERGO',      '2028-07-01', NOW()),
                                                                            ('POL-100014', 'Care Health',    '2027-03-18', NOW()),
                                                                            ('POL-100015', 'Max Bupa',       '2027-09-09', NOW()),
                                                                            ('POL-100016', 'Star Health',    '2028-04-04', NOW()),
                                                                            ('POL-100017', 'ICICI Lombard',  '2027-05-23', NOW()),
                                                                            ('POL-100018', 'HDFC ERGO',      '2028-06-11', NOW()),
                                                                            ('POL-100019', 'Care Health',    '2027-01-28', NOW()),
                                                                            ('POL-100020', 'Max Bupa',       '2027-07-07', NOW()),
                                                                            ('POL-100021', 'Star Health',    '2028-02-02', NOW()),
                                                                            ('POL-100022', 'ICICI Lombard',  '2027-06-16', NOW()),
                                                                            ('POL-100023', 'HDFC ERGO',      '2028-08-12', NOW()),
                                                                            ('POL-100024', 'Care Health',    '2027-11-29', NOW()),
                                                                            ('POL-100025', 'Max Bupa',       '2027-03-03', NOW()),
                                                                            ('POL-100026', 'Star Health',    '2028-09-21', NOW()),
                                                                            ('POL-100027', 'ICICI Lombard',  '2027-04-14', NOW()),
                                                                            ('POL-100028', 'HDFC ERGO',      '2028-10-10', NOW()),
                                                                            ('POL-100029', 'Care Health',    '2027-02-25', NOW()),
                                                                            ('POL-100030', 'Max Bupa',       '2027-12-12', NOW());


-- ============================================================
-- Link Insurance to Patients (1-to-1, id 1–30)
-- ============================================================

UPDATE patient SET insurance_id = 1  WHERE id = 1;
UPDATE patient SET insurance_id = 2  WHERE id = 2;
UPDATE patient SET insurance_id = 3  WHERE id = 3;
UPDATE patient SET insurance_id = 4  WHERE id = 4;
UPDATE patient SET insurance_id = 5  WHERE id = 5;
UPDATE patient SET insurance_id = 6  WHERE id = 6;
UPDATE patient SET insurance_id = 7  WHERE id = 7;
UPDATE patient SET insurance_id = 8  WHERE id = 8;
UPDATE patient SET insurance_id = 9  WHERE id = 9;
UPDATE patient SET insurance_id = 10 WHERE id = 10;
UPDATE patient SET insurance_id = 11 WHERE id = 11;
UPDATE patient SET insurance_id = 12 WHERE id = 12;
UPDATE patient SET insurance_id = 13 WHERE id = 13;
UPDATE patient SET insurance_id = 14 WHERE id = 14;
UPDATE patient SET insurance_id = 15 WHERE id = 15;
UPDATE patient SET insurance_id = 16 WHERE id = 16;
UPDATE patient SET insurance_id = 17 WHERE id = 17;
UPDATE patient SET insurance_id = 18 WHERE id = 18;
UPDATE patient SET insurance_id = 19 WHERE id = 19;
UPDATE patient SET insurance_id = 20 WHERE id = 20;
UPDATE patient SET insurance_id = 21 WHERE id = 21;
UPDATE patient SET insurance_id = 22 WHERE id = 22;
UPDATE patient SET insurance_id = 23 WHERE id = 23;
UPDATE patient SET insurance_id = 24 WHERE id = 24;
UPDATE patient SET insurance_id = 25 WHERE id = 25;
UPDATE patient SET insurance_id = 26 WHERE id = 26;
UPDATE patient SET insurance_id = 27 WHERE id = 27;
UPDATE patient SET insurance_id = 28 WHERE id = 28;
UPDATE patient SET insurance_id = 29 WHERE id = 29;
UPDATE patient SET insurance_id = 30 WHERE id = 30;