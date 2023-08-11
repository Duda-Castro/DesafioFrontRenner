#language: pt
#encoding: utf-8
#@run
Funcionalidade: Cadastrar conta

  Contexto:
    Dado que acesso o ecommerce

  @run
  Cenario: Cadastrar conta nova
    Quando clico em Signup/Login
    E eu inserir um nome em New User Signup!
    E eu inserir um email em Email Address
    E eu clicar no botão Signup
    E eu preencher os campos vazios obrigatórios da página Enter Account Information
    E eu clicar no botão Create Account
    Entao devo receber a mensagem "ACCOUNT CREATED!"
