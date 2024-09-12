## ClimaApp
Uma aplicação Java simples para visualizar a previsão do tempo em tempo real.

# Descrição
A ClimaApp é uma aplicação desktop que utiliza APIs externas para fornecer informações meteorológicas atualizadas para uma determinada localização. O usuário pode inserir o nome da cidade e a aplicação exibe a temperatura atual, condição do tempo (ex: ensolarado, nublado, chuva), umidade e velocidade do vento.

# Funcionalidades
Busca de localização: Permite ao usuário inserir o nome da cidade para a qual deseja visualizar a previsão do tempo.
Exibição de dados meteorológicos:

- Temperatura atual em graus Celsius.
- Condição do tempo (ex: ensolarado, nublado, chuva).
- Umidade relativa do ar.
- Velocidade do vento em km/h.
- Ícones intuitivos: Utiliza ícones para representar visualmente as condições climáticas.

# Dependências
- Java Development Kit (JDK) 8 ou superior.
- Biblioteca JSON-Simple (incluída no projeto).

# Como executar
1. Baixe ou clone o repositório.
2. Compile o código-fonte Java.
3. Execute a classe AppLauncher dentro do pacote thiagoh.src.

# Estrutura do projeto
- WeatherApp.java: Contém a lógica principal para buscar dados meteorológicos da API e processá-los.
- ClimaAppGUI.java: Responsável pela interface gráfica do usuário (GUI) da aplicação.
- AppLauncher.java: Ponto de entrada da aplicação, inicia a GUI.
- assets/: Pasta contendo os ícones utilizados na interface.

# APIs utilizadas
Open-Meteo API: Fornece os dados meteorológicos (temperatura, condição do tempo, umidade, velocidade do vento).
Geocoding-API.open-meteo.com: Utilizada para converter o nome da cidade em coordenadas geográficas (latitude e longitude).