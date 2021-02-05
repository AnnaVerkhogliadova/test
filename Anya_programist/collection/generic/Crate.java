package Anya_programist.collection.generic;

public class Crate<T> {
    private T contents;

    public Crate(T contents) {
        this.contents = contents;
    }

    public Crate() {}

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public static void main(String[] args) {
        Crate<Elephant> crateForElephant = new Crate<>(); // создали клетку для слона
        Crate<Wolf> crateForWolf = new Crate<>(); // и клетку для волка
// как видите, нам не потребовалось определять каждый раз новый класс для клеток
        Elephant elephant = crateForElephant.getContents();
        Wolf wolf = crateForWolf.getContents();
    }
}

class Elephant {
}

class Wolf {
}
