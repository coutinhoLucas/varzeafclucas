#Some setup information :).

##Spring Security Setup
Criar grupos e permissoes no banco

insert into grupo(descricao,nome) values ('GRUPO DE ADMINISTRADORES' , 'ADMIN');
insert into grupo(descricao,nome) values ('GRUPO DE PRESIDENTES' , 'PRESIDENTE');
insert into grupo(descricao,nome) values ('GRUPO DE PUBLICADORES' , 'PUBLICADOR');

insert into permissao(nome) values ('ADMIN');
insert into permissao(nome) values ('PRESIDENTE');
insert into permissao(nome) values ('PUBLICADOR');



insert into GRUPO_PERMISSAO(grupos_id, permissoes_id) values (1,1);
insert into GRUPO_PERMISSAO(grupos_id, permissoes_id) values (2,2);
insert into GRUPO_PERMISSAO(grupos_id, permissoes_id) values (3,3);







