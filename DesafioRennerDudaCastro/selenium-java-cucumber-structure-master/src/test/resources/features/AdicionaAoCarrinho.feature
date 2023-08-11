#language: pt
#encoding: utf-8
#@run
Funcionalidade: Adicionar itens ao carrinho

  Contexto:
    Dado que acesso o ecommerce

  @run
  Cenario: Adicionar produto
    Quando clico em ver mais detalhes do produto "Stylish Dress"
    E eu adicionar 3 unidade(s) no carrinho
    E clico em ver mais detalhes do produto "Beautiful Peacock Blue Cotton Linen Saree"
    E eu adicionar 2 unidade(s) no carrinho
    E clico em ver mais detalhes do produto "Men Tshirt"
    E eu adicionar 1 unidade(s) no carrinho
    E que acesso o carrinho
    Entao o carrinho deve conter 3 unidades do produto "Stylish Dress"
    E o carrinho deve conter 2 unidades do produto "Beautiful Peacock Blue Cotton Linen Saree"
    E o carrinho deve conter 1 unidades do produto "Men Tshirt"
