public class Entity {
    private Double number;
    private Value equation;

    public Entity(Double number) {
        this.number = number;
    }

    public Entity(Value equation) {
        this.equation = equation;
    }

    public Double getNumber() {
        return number;
    }

    public Value getEquation() {
        return equation;
    }
}