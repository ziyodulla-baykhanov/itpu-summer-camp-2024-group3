CREATE TABLE users
(
    id SERIAL PRIMARY KEY,
    user_login VARCHAR(255),
    user_password VARCHAR(255),
    created_datetime TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    deleted_datetime TIMESTAMP WITHOUT TIME ZONE,
    is_deleted BOOLEAN DEFAULT FALSE
);

INSERT INTO users (user_login, user_password)
VALUES
    ('+998 99 212 12 12', 'QWERTY'),
    ('+998 90 123 45 67', 'root'),
    ('+998 91 234 56 78', 'admin'),
    ('+998 97 654 32 10', '123456'),
    ('+998 99 876 54 32', 'password');