package polimorfismoemploy;

/**
 * Classe base abstrata para representar um funcionário.
 */
public abstract class Employ {
    private final String nome;
    private final String role;

    public Employ(String nome, String role) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (role == null || role.isBlank()) {
            throw new IllegalArgumentException("O cargo não pode ser vazio.");
        }
        this.nome = nome;
        this.role = role;
    }

    public String getNome() {
        return nome;
    }

    public String getRole() {
        return role;
    }

    public abstract double CalculateSalary();
}
