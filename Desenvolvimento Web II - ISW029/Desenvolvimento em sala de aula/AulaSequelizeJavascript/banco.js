const Sequelize = require("sequelize")
const sequelize = new Sequelize("test", "root", "",{
    host: "localhost",
    dialect: "mysql"
})

sequelize.authenticate().then(function(){
    console.log("Conectado com sucesso!")
}).catch(function(erro){
    console.log("Falha ao conectar: "+ erro)
})

const Agendamentos = sequelize.define("agendamentos", {
    nome:{
        type: Sequelize.STRING
    },
    endereco:{
        type: Sequelize.STRING
    },
    bairro:{
        type: Sequelize.STRING
    },
    cep:{
        type: Sequelize.INTEGER
    },
    cidade:{
        type: Sequelize.STRING
    },
    estado:{
        type: Sequelize.STRING
    },
    observacao:{
        type: Sequelize.STRING
    }
})

//Agendamentos.sync({force : true})

Agendamentos.create({
    nome: "Aldo Costa Silveira",
    endereco: "Rua Jarbas de Jarbas para Afim de não relevar minha localização",
    bairro: "Vila da Folha",
    cep: 010110011001,
    cidade: "São Paulo",
    estado: "São Paulo",
    observacao: "Teste para a aula"
})
    