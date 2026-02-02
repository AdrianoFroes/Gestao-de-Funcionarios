const API_URL = "http://localhost:8080/funcionarios";

const form = document.getElementById("formFuncionario");
const lista = document.getElementById("listaFuncionarios");

form.addEventListener("submit", function (e) {
    e.preventDefault();

    const funcionario = {
        nome: nome.value,
        cpf: cpf.value,
        cargo: cargo.value,
        salario: salario.value
    };

    fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(funcionario)
    })
    .then(() => {
        form.reset();
        carregarFuncionarios();
    });
});

function carregarFuncionarios() {
    fetch(API_URL)
        .then(res => res.json())
        .then(dados => {
            lista.innerHTML = "";
            dados.forEach(f => {
                lista.innerHTML += `
                    <tr>
                        <td>${f.nome}</td>
                        <td>${f.cpf}</td>
                        <td>${f.cargo}</td>
                        <td>${f.salario}</td>
                        <td>
                            <button onclick="excluir(${f.id})">Excluir</button>
                        </td>
                    </tr>
                `;
            });
        });
}

function excluir(id) {
    fetch(`${API_URL}/${id}`, { method: "DELETE" })
        .then(() => carregarFuncionarios());
}

carregarFuncionarios();
