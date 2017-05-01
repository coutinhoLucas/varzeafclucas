#Some setup information :).

##Spring Security Setup
Criar grupos e permissoes no banco

insert into Grupo(descricao,nome) values ('GRUPO DE ADMINISTRADORES' , 'ADMIN');
insert into Grupo(descricao,nome) values ('GRUPO DE PRESIDENTES' , 'PRESIDENTE');
insert into Grupo(descricao,nome) values ('GRUPO DE PUBLICADORES' , 'PUBLICADOR');

insert into Permissao(nome) values ('ADMIN');
insert into Permissao(nome) values ('PRESIDENTE');
insert into Permissao(nome) values ('PUBLICADOR');



insert into Grupo_Permissao(grupos_id, permissoes_id) values (1,1);
insert into Grupo_Permissao(grupos_id, permissoes_id) values (2,2);
insert into Grupo_Permissao(grupos_id, permissoes_id) values (3,3);







