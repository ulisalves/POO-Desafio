## Diagrama de Classes

```mermaid
classDiagram
    interface NavegadorNaInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    interface RepodutorMusicial {
        +tocar()
        +pausar()
        +selecionarMusica()
    }

    interface AparelhoTelefonico {
        +ligar()
        +atender()
	+iniciarCorrerioVoz()
    }

    class Iphone {
        
    }
    
 ```