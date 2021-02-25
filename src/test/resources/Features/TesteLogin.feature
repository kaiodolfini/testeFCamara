#language: pt
@funcionais

Funcionalidade: Teste de Login

	Como um usuário 
	Gostaria de testar o login
	Para garantir que o acesso a aplicacao esteja correto

Contexto:
	Dado que estou acessando a aplicacao Login

Esquema do Cenario: Deve validar regras dos campos de login
Quando informar o login "<login>"
E informar a senha "<senha>"
E clicar em Login
Entao recebo a mensagem "<mensagem>"

Exemplos:
|	login           |             senha             | mensagem								|
|  		teste    	|	teste						| Your username is invalid! 			|
|     tomsmith   	|          						| Your password is invalid!				|
|					|	SuperSecretPassword!		| Your username is invalid!				|
|	tomsmith		|	SuperSecretPassword!		| You logged into a secure area!		|