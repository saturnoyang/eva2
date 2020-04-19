Feature: Realizacion de casos de prueba
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresa Username "pedro" y Password "pedro"
Then inicia sesion
