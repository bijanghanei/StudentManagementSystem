-- Drop user first if they exist
DROP USER 'myrestapi'@'127.0.0.1' ;

-- Now create user with prop privileges
CREATE USER 'myrestapi'@'127.0.0.1' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON * . * TO 'myrestapi'@'127.0.0.1';