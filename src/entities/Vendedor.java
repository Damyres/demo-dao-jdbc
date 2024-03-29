package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor  implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private Date data;
    private Double salarioBase;
    private Departamento departamento;

    public Vendedor() {

    }

    public Vendedor(Integer id, String nome, String email, Date data, Double salarioBase, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.data = data;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(id, vendedor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", data=" + data +
                ", salarioBase=" + salarioBase +
                ", departamento=" + departamento +
                '}';
    }
}
