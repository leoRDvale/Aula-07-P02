# Aula-07-P02

Uma empresa de desenvolvimento de jogos precisa criar um sistema que suporte dois temas visuais: Medieval e Futurista. Cada tema possui seus próprios personagens e armas, que devem ser sempre compatíveis entre si.

O sistema deve ser capaz de criar, para cada tema:

Tema: Medieval

Produto: Personagem => Cavaleiro
Produto: Arma => Espada

Tema: Futurista 

Produto: Personagem =>  Androide 
Produto: Arma => Laser

Regras:
- Um Cavaleiro só pode usar uma Espada
- Um Androide só pode usar um Laser
- O cliente não deve instanciar nenhuma classe concreta diretamente

Funções dos personagens: atacar(), defender(), exibirInfo()

Funções das Armas: usar(), guardar(), exibirInfo()

Saída Esperada

Ao executar o programa corretamente, a saída deve ser:

=== Tema Medieval ===
Personagem: Cavaleiro | Tema: Medieval
Arma: Espada | Tipo: Corpo a Corpo
Cavaleiro ataca brandindo sua Espada!
Espada corta o inimigo com precisão!
Cavaleiro guarda Espada.

=== Tema Futurista ===
Personagem: Androide | Tema: Futurista
Arma: Laser | Tipo: Longa Distância
Androide ataca disparando seu Laser!
Laser destrói o inimigo com energia pura!
Android guarda Laser.

2) Para a segunda parte

- Adicionar um terceiro tema: Fantasia com Mago e Cajado
- Criar um terceiro produto na família: Transporte com Cavalo (Medieval) e NaveEspacial (Futurista). Para o tema Fantasia fica a critério do desenvolvedor.
- Permitir que o tema seja escolhido via entrada do usuário no console, sem usar if/else.

