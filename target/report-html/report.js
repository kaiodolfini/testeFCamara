$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TesteLogin.feature");
formatter.feature({
  "name": "Teste de Login",
  "description": "\tComo um usu�rio \n\tGostaria de testar o login\n\tPara garantir que o acesso a aplicacao esteja correto",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Deve validar regras dos campos de login",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "informar o login \"\u003clogin\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "informar a senha \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "clicar em Login",
  "keyword": "E "
});
formatter.step({
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "login",
        "senha",
        "mensagem"
      ]
    },
    {
      "cells": [
        "teste",
        "teste",
        "Your username is invalid!"
      ]
    },
    {
      "cells": [
        "tomsmith",
        "",
        "Your password is invalid!"
      ]
    },
    {
      "cells": [
        "",
        "SuperSecretPassword!",
        "Your username is invalid!"
      ]
    },
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword!",
        "You logged into a secure area!"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicacao Login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queEstouAcessandoAAplicaO()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras dos campos de login",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "informar o login \"teste\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informoASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"Your username is invalid!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicacao Login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queEstouAcessandoAAplicaO()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras dos campos de login",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "informar o login \"tomsmith\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informoASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"Your password is invalid!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicacao Login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queEstouAcessandoAAplicaO()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras dos campos de login",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "informar o login \"\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"SuperSecretPassword!\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informoASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"Your username is invalid!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicacao Login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queEstouAcessandoAAplicaO()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve validar regras dos campos de login",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@funcionais"
    }
  ]
});
formatter.step({
  "name": "informar o login \"tomsmith\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"SuperSecretPassword!\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informoASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "recebo a mensagem \"You logged into a secure area!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
});