# ✅ GitHubSearchRepositorios - Buscador de Repositórios GitHub (Android)

Aplicação **Android nativa** desenvolvida em **Kotlin** com **Jetpack Compose** para buscar repositórios públicos do GitHub.  
O app lista projetos com estrelas, linguagens, descrições e permite acesso direto ao repositório.

---

## 📸 Preview do App

<img width="382" height="779" alt="image" src="https://github.com/user-attachments/assets/a9f30e31-b6a5-4ae5-ab43-6678e15d75fb" />
<img width="374" height="787" alt="image" src="https://github.com/user-attachments/assets/0d76ffe6-8f32-419c-be33-82c9fdd0bc94" />




> 🔎 Exemplo de uso:
- Usuário pesquisado: **HelioSaraiva**
- Resultado: lista de repositórios com nome, descrição, estrelas ⭐ e linguagem
- Botão de acesso direto ao GitHub

*(adicione prints ou GIFs do app aqui)*

---

## 📌 Funcionalidades

- [x] Busca de repositórios por usuário do GitHub
- [x] Listagem dinâmica com Jetpack Compose (`LazyColumn`)
- [x] Exibição de dados completos: nome, descrição, linguagem e estrelas
- [x] Tratamento de erros e estados de loading
- [x] Consumo de API REST do GitHub
- [x] Interface moderna com Material Design 3
- [x] Código organizado e escalável

---

## 💡 Destaques Técnicos

- **Kotlin + Jetpack Compose** (UI declarativa moderna)
- **Retrofit2 + Gson** para consumo de API REST
- **Coroutines** para chamadas assíncronas
- **Arquitetura organizada** (UI → Controller → Model)
- **Null-safety** com recursos idiomáticos do Kotlin
- **Boas práticas de separação de responsabilidades**
- Estrutura preparada para evolução com **MVVM**

---

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone git@github.com:HelioSaraiva/githubsearchrepositorios.git
```

2. Abra o projeto no Android Studio.

3. Sincronize o Gradle e execute o app em um emulador ou dispositivo físico.

---

## 📂 Estrutura do Projeto

```
githubsearchrepositorios/
├── ui/
│   └── GitHubSearchScreen.kt      # Interface Compose + LazyColumn
├── controller/
│   └── GitHubControllerApi.kt     # Lógica de consumo da API
├── model/
│   └── Repository.kt              # Data classes com @SerializedName
├── data/remote/
│   ├── RetrofitGitHub.kt          # Configuração do Retrofit
│   └── GitHubService.kt           # Interface da API
└── AndroidManifest.xml            # Permissão de INTERNET
```

---

## 👨‍💻 Para recrutadores

> Este projeto demonstra:

- Domínio de **Android moderno com Jetpack Compose**
- Integração com **APIs REST reais**
- Uso de **Coroutines e Retrofit**
- Organização de código e arquitetura escalável
- Conhecimento prático de boas práticas Android
- Capacidade de transformar requisitos em funcionalidades reais

💼 Projeto ideal para demonstrar competências de um desenvolvedor Android júnior/intermediário.

---

## 🛠️ Melhorias futuras

- [ ] Paginação de resultados (GitHub API)
- [ ] Filtros por linguagem e estrelas
- [ ] Favoritos com Room Database
- [ ] Dark Mode automático
- [ ] Pull-to-refresh
- [ ] Arquitetura MVVM completa

---

## 📄 Licença

Este projeto está sob a licença MIT.  
Sinta-se livre para usar, estudar e adaptar.

---

## 🙋 Sobre o autor

Desenvolvido por **Helio Saraiva Buzato**  
📧 buzato@hotmail.com  
🔗 LinkedIn: https://linkedin.com/in/heliosaraivabuzato  
🔗 GitHub: https://github.com/HelioSaraiva# ✅ GitHubSearchRepositorios - Buscador de Repositórios GitHub (Android)

Aplicação **Android nativa** desenvolvida em **Kotlin** com **Jetpack Compose** para buscar repositórios públicos do GitHub.  
O app lista projetos com estrelas, linguagens, descrições e permite acesso direto ao repositório.

---

## 📸 Preview do App

> 🔎 Exemplo de uso:
- Usuário pesquisado: **HelioSaraiva**
- Resultado: lista de repositórios com nome, descrição, estrelas ⭐ e linguagem
- Botão de acesso direto ao GitHub

*(adicione prints ou GIFs do app aqui)*

---

## 📌 Funcionalidades

- [x] Busca de repositórios por usuário do GitHub
- [x] Listagem dinâmica com Jetpack Compose (`LazyColumn`)
- [x] Exibição de dados completos: nome, descrição, linguagem e estrelas
- [x] Tratamento de erros e estados de loading
- [x] Consumo de API REST do GitHub
- [x] Interface moderna com Material Design 3
- [x] Código organizado e escalável

---

## 💡 Destaques Técnicos

- **Kotlin + Jetpack Compose** (UI declarativa moderna)
- **Retrofit2 + Gson** para consumo de API REST
- **Coroutines** para chamadas assíncronas
- **Arquitetura organizada** (UI → Controller → Model)
- **Null-safety** com recursos idiomáticos do Kotlin
- **Boas práticas de separação de responsabilidades**
- Estrutura preparada para evolução com **MVVM**

---

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone git@github.com:HelioSaraiva/githubsearchrepositorios.git
```

2. Abra o projeto no Android Studio.

3. Sincronize o Gradle e execute o app em um emulador ou dispositivo físico.

---

## 📂 Estrutura do Projeto

```
githubsearchrepositorios/
├── ui/
│   └── GitHubSearchScreen.kt      # Interface Compose + LazyColumn
├── controller/
│   └── GitHubControllerApi.kt     # Lógica de consumo da API
├── model/
│   └── Repository.kt              # Data classes com @SerializedName
├── data/remote/
│   ├── RetrofitGitHub.kt          # Configuração do Retrofit
│   └── GitHubService.kt           # Interface da API
└── AndroidManifest.xml            # Permissão de INTERNET
```

---

## 👨‍💻 Para recrutadores

> Este projeto demonstra:

- Domínio de **Android moderno com Jetpack Compose**
- Integração com **APIs REST reais**
- Uso de **Coroutines e Retrofit**
- Organização de código e arquitetura escalável
- Conhecimento prático de boas práticas Android
- Capacidade de transformar requisitos em funcionalidades reais

💼 Projeto ideal para demonstrar competências de um desenvolvedor Android júnior/intermediário.

---

## 🛠️ Melhorias futuras

- [ ] Paginação de resultados (GitHub API)
- [ ] Filtros por linguagem e estrelas
- [ ] Favoritos com Room Database
- [ ] Dark Mode automático
- [ ] Pull-to-refresh
- [ ] Arquitetura MVVM completa

---

## 📄 Licença

Este projeto está sob a licença MIT.  
Sinta-se livre para usar, estudar e adaptar.

---

## 🙋 Sobre o autor

Desenvolvido por **Helio Saraiva Buzato**  
📧 buzato@hotmail.com  
🔗 LinkedIn: https://linkedin.com/in/heliosaraivabuzato  
🔗 GitHub: https://github.com/HelioSaraiva
