
INSERT INTO doctor (name, specialisation, email, created_at) VALUES
                                                                 ('Dr. James Wilson', 'Cardiology', 'james.wilson@hospital.com', '2023-01-15 09:00:00'),
                                                                 ('Dr. Sarah Connor', 'Neurology', 'sarah.connor@hospital.com', '2023-02-10 10:30:00'),
                                                                 ('Dr. Michael Chen', 'Orthopedics', 'michael.chen@hospital.com', '2023-03-05 08:45:00'),
                                                                 ('Dr. Emily Davis', 'Pediatrics', 'emily.davis@hospital.com', '2023-03-20 11:00:00'),
                                                                 ('Dr. Robert Brown', 'Dermatology', 'robert.brown@hospital.com', '2023-04-12 09:15:00'),
                                                                 ('Dr. Laura Martinez', 'Oncology', 'laura.martinez@hospital.com', '2023-04-28 14:00:00'),
                                                                 ('Dr. David Thompson', 'Radiology', 'david.thompson@hospital.com', '2023-05-10 08:00:00'),
                                                                 ('Dr. Jessica Taylor', 'Psychiatry', 'jessica.taylor@hospital.com', '2023-05-22 13:30:00'),
                                                                 ('Dr. William Anderson', 'Gastroenterology', 'william.anderson@hospital.com', '2023-06-01 10:00:00'),
                                                                 ('Dr. Olivia Jackson', 'Endocrinology', 'olivia.jackson@hospital.com', '2023-06-18 09:45:00'),
                                                                 ('Dr. Daniel White', 'Urology', 'daniel.white@hospital.com', '2023-07-04 11:30:00'),
                                                                 ('Dr. Sophia Harris', 'Ophthalmology', 'sophia.harris@hospital.com', '2023-07-19 08:30:00'),
                                                                 ('Dr. Matthew Clark', 'Pulmonology', 'matthew.clark@hospital.com', '2023-08-02 14:15:00'),
                                                                 ('Dr. Isabella Lewis', 'Rheumatology', 'isabella.lewis@hospital.com', '2023-08-25 10:00:00'),
                                                                 ('Dr. Ethan Robinson', 'Nephrology', 'ethan.robinson@hospital.com', '2023-09-10 09:00:00'),
                                                                 ('Dr. Mia Walker', 'Hematology', 'mia.walker@hospital.com', '2023-09-28 13:00:00'),
                                                                 ('Dr. Alexander Hall', 'Anesthesiology', 'alexander.hall@hospital.com', '2023-10-05 08:00:00'),
                                                                 ('Dr. Charlotte Young', 'Obstetrics', 'charlotte.young@hospital.com', '2023-10-20 11:45:00'),
                                                                 ('Dr. Benjamin King', 'Emergency Medicine', 'benjamin.king@hospital.com', '2023-11-08 07:30:00'),
                                                                 ('Dr. Amelia Scott', 'Pathology', 'amelia.scott@hospital.com', '2023-11-25 10:30:00');

INSERT INTO department (name, head_doctor_id, created_at) VALUES
                                                              ('Cardiology Department',    1,  '2023-02-01 09:00:00'),
                                                              ('Neurology Department',     2,  '2023-03-01 09:00:00'),
                                                              ('Orthopedics Department',   3,  '2023-04-01 09:00:00'),
                                                              ('Pediatrics Department',    4,  '2023-04-15 09:00:00'),
                                                              ('Oncology Department',      6,  '2023-05-01 09:00:00'),
                                                              ('Radiology Department',     7,  '2023-05-15 09:00:00'),
                                                              ('Psychiatry Department',    8,  '2023-06-01 09:00:00'),
                                                              ('Urology Department',       11, '2023-07-01 09:00:00'),
                                                              ('Ophthalmology Department', 12, '2023-07-15 09:00:00'),
                                                              ('Emergency Department',     19, '2023-11-01 09:00:00');

-- Cardiology Department (dept 1)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (1, 1),  -- Dr. James Wilson (head)
                                                  (1, 5),  -- Dr. Robert Brown
                                                  (1, 10), -- Dr. Olivia Jackson
                                                  (1, 15); -- Dr. Ethan Robinson

-- Neurology Department (dept 2)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (2, 2),  -- Dr. Sarah Connor (head)
                                                  (2, 8),  -- Dr. Jessica Taylor
                                                  (2, 14), -- Dr. Isabella Lewis
                                                  (2, 20); -- Dr. Amelia Scott

-- Orthopedics Department (dept 3)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (3, 3),  -- Dr. Michael Chen (head)
                                                  (3, 9),  -- Dr. William Anderson
                                                  (3, 17); -- Dr. Alexander Hall

-- Pediatrics Department (dept 4)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (4, 4),  -- Dr. Emily Davis (head)
                                                  (4, 16), -- Dr. Mia Walker
                                                  (4, 18); -- Dr. Charlotte Young

-- Oncology Department (dept 5)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (5, 6),  -- Dr. Laura Martinez (head)
                                                  (5, 13), -- Dr. Matthew Clark
                                                  (5, 16); -- Dr. Mia Walker (also in Pediatrics)

-- Radiology Department (dept 6)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (6, 7),  -- Dr. David Thompson (head)
                                                  (6, 20); -- Dr. Amelia Scott (also in Neurology)

-- Psychiatry Department (dept 7)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (7, 8),  -- Dr. Jessica Taylor (head)
                                                  (7, 14); -- Dr. Isabella Lewis (also in Neurology)

-- Urology Department (dept 8)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (8, 11), -- Dr. Daniel White (head)
                                                  (8, 9);  -- Dr. William Anderson (also in Orthopedics)

-- Ophthalmology Department (dept 9)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (9, 12), -- Dr. Sophia Harris (head)
                                                  (9, 5);  -- Dr. Robert Brown (also in Cardiology)

-- Emergency Department (dept 10)
INSERT INTO dept_doctors (dept_id, doctor_id) VALUES
                                                  (10, 19), -- Dr. Benjamin King (head)
                                                  (10, 17), -- Dr. Alexander Hall (also in Orthopedics)
                                                  (10, 15); -- Dr. Ethan Robinson (also in Cardiology)