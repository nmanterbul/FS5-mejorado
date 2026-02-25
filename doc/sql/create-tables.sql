CREATE TABLE usuarios (
                             id  bigint(20)  AUTO_INCREMENT,
                             nombre varchar(20) DEFAULT '' unique ,
                             edad integer ,
                             password varchar(100) DEFAULT '',
                             rol integer ,
                             PRIMARY KEY (id)
);
