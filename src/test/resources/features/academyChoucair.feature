# Autor: xxxxxxxxx
# lenguage:es
@stories
Feature: Academia Choucair
  Como usuario, Yo quiero automatizar proceso con screamplay para prueba en la Academia Choucair.

  @scenario
  Scenario: Ingresar a Utest y crear un nuevo usuario
    Given que Brandon quiere crear un usuario nuevo
    When el dilengia sus datos personales para crear usuario en Utest
    | strName | srtLastnane | strMail | strPassword | srtPasswordc |
    | Jose SAntiago | Diaz Rozo | josediazrozo@hotmail.com | Jasdfg456* | Jasdfg456* |
    Then el crea un nuevo usuario
    | strText |
    | Welcome to the world's largest community of freelance software testers! |