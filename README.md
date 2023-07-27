## Diagrama de Classes

```mermaid
classDiagram
    class NavegadorNaInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class RepodutorMusicial {
        +tocar()
        +pausar()
        +selecionarMusica()
    }

    class AparelhoTelefonico {
        +ligar()
        +atender()
	+iniciarCorrerioVoz()
    }

    class Iphone {
       
    }

    Iphone --> AparelhoTelefonico
    Iphone --> RepodutorMusicial
    Iphone --> NavegadorNaInternet
 ```
