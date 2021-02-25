#language: pt
@funcionais

Funcionalidade: Teste de CheckBox

	Como um usuário 
	Gostaria de manusear um checkbox
	Para que eu possa desfrutar das opções disponíveis

Contexto:
	Dado que estou acessando a aplicacao

Cenario: Deve selecionar o checkbox
	Quando clicar no checkbox
	Entao o checkbox estara selecionado

Cenario: Deve deselecionar o checkbox
	Quando clicar no checkbox
	Entao o checkbox estara deselecionado

Cenario: Deve remover o checkbox
	Quando clicar no checkbox
	E clicar em Remover
	Entao o checkbox sera removido

Cenario: Deve adicionar o checkbox
	Quando clicar em Add
	Entao o checkbox sera adicionado