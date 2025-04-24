# smart-controller-servlet
Este projeto demonstra como implementar um Servlet Controller desacoplado usando o padrão Strategy para definir respostas flexíveis em múltiplos formatos (HTML, JSON e texto simples), sem o uso de frameworks.

Benefícios para:
Times que mantêm sistemas legados em Java EE puro, sem Spring ou Jakarta EE moderno
Desenvolvedores que desejam entender como funciona o ciclo completo de uma requisição HTTP sem abstrações automáticas
Projetos que precisam evoluir uma arquitetura existente sem reescrever do zero
Aplicações embarcadas ou controladas, onde usar frameworks externos não é viável
Ambientes de ensino e cursos técnicos que querem demonstrar, na prática, conceitos como: Polimorfismo, Inversão de responsabilidade,
Content negotiation manual, Clean code e separação de responsabilidades.

A principal vantagem deste controlador é o uso de reflection para invocação de métodos dinamicamente, eliminando a necessidade de blocos condicionais (if/else ou switch). Isso segue boas práticas de design como o princípio aberto/fechado (SOLID), reduz acoplamento e minimiza o risco de exceções causadas por ramificações mal controladas. 

A arquitetura favorece extensibilidade: novas ações ou formatos de resposta podem ser adicionados com o mínimo de alteração no núcleo do sistema.

As imagens .png são evidências de testes de requisição, via ferramenta insomnia, onde alterno os accept-headers para poder demonstrar o efeito prático a fim de retornar HTML, JSON ou Texto simples.
