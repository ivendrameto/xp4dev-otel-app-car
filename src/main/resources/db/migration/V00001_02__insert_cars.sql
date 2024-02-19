CREATE SEQUENCE car_id
    START WITH 1
    INCREMENT BY 1;

-- Table: cars
CREATE TABLE cars
(
    car_id INT NOT NULL,
    identification VARCHAR(50) NOT NULL,

    active boolean default true,
    create_date_time timestamp with time zone,
    update_date_time timestamp with time zone,

    CONSTRAINT cars_pkey PRIMARY KEY (car_id)
);
