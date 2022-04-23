import java.util.stream.IntStream;

public class HomeWork {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);// создает массив
        System.out.println(intStream.reduce((x, y) -> x + y ));// преобразует все элементы стрима в один объект(складывает все объекты)
    }
}
