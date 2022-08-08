package ExercíciosPOO.Ex8_2;

public class Main {
    public static void main(String[] args) {
        try {
            Data data = new Data();
            System.out.println(data.comparar());
            System.out.println(data.getDia());
            System.out.println(data.getMes());
            System.out.println(data.getMesExtenso());
            System.out.println(data.getAno());
            System.out.println(data.isBissexto());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
