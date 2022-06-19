create database bdtest;

create schema registro;

/*==============================================================*/
/* Table: FERIADOS                                              */
/*==============================================================*/
create table REGISTRO.FERIADOS (
   FECHA                DATE                 not null,
   NOMBRE               TEXT                 null,
   DESCRIPCION          TEXT                 null,
   constraint PK_FERIADOS primary key (FECHA)
);

comment on table REGISTRO.FERIADOS is
'Informacion sobre feriados';

comment on column FERIADOS.FECHA is
'Identificador unido de la tabla "feriados"';

comment on column FERIADOS.NOMBRE is
'Nombre sobre el feriado';

comment on column FERIADOS.DESCRIPCION is
'Descripcion de la cual trata el feriado';