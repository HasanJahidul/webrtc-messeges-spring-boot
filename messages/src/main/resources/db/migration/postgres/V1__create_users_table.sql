CREATE TABLE IF NOT EXISTS users (

    id int ,
    name varchar(20),
    email varchar(50),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

