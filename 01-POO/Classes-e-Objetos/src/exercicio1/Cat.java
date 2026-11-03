package exercicio1;

/**
 * Representa um gato com nome, cor e idade.
 */
public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat() {
        this("Desconhecido", "Desconhecido", 0);
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    /**
     * Mantido para compatibilidade com o nome usado no exercício original.
     */
    @Deprecated
    public String getColo() {
        return getColor();
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        this.age = age;
    }
}
