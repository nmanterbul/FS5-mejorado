create user 'proy'@'localhost' identified by 'password';

create database FS5_DB;

grant all privileges on FS5_DB.* to 'proy'@'localhost';

use FS5_DB;