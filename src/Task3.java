import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        for (String animal:animals){
            System.out.println(animal);
        }
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - "+animals.get(1));
        System.out.println("В 10:00 - "+animals.get(4));
        System.out.println("В 11:00 - "+animals.get(0));
        System.out.println("В 12:00 - "+animals.get(2));
        System.out.println("В 13:00 - "+animals.get(3));
        int menu = 1;
        Scanner in = new Scanner(System.in);
        while (menu != 0){
            System.out.println("Выберите действия:");
            System.out.println("1 - добавить животного в зоопарк");
            System.out.println("2 - удалить животного из зоопарка");
            System.out.println("3 - показать всех животных в зоопарке");
            System.out.println("4 - удалить весь список");
            System.out.println("5 - найти животного в списке");
            System.out.println("0 - хотите выйти");
            menu = in.nextInt();
            switch (menu){
                case 1:
                    animalsAdd(animals);
                    break;
                case 2:
                    animalsDell(animals);
                    break;
                case 3:
                    animalAll(animals);
                    break;
                case 4:
                    animalsDellAll(animals);
                    break;
                case 5:
                    animalsFind(animals);
                    break;
                default:
                    menu = 0;
                    System.out.println("Пока");
                    break;
            }
        }

    }
    public static void animalAll(ArrayList<String> animals){
        for (String animal: animals)
        {
            System.out.println(animal);
        }
    }
    public static void animalsAdd(ArrayList<String> animals){
        System.out.println("Кого вы хотите добавить в зоопарк ");
        Scanner k = new Scanner(System.in);
        String animalAdd = k.next();
        animals.add(animalAdd);
        System.out.println("Вы добавили "+animalAdd+" в зоопарк");
    }
    public static void animalsDell(ArrayList<String> animals){
        for (int i = 0; i<animals.size();i++){
            System.out.printf("%d %s", i+1, animals.get(i));
            System.out.println();
        }
        System.out.println("Кого вы хотите удалить из зоопарка, напишите его номер ");
        Scanner j = new Scanner(System.in);
        int delAnimal = j.nextInt();
        if (delAnimal< animals.size()-1){
            System.out.printf("Вы удалили %s", animals.get(delAnimal-1));
            animals.remove(delAnimal - 1);
            System.out.println();
        }
        else{
            System.out.println("Под таким индексом нет животного");
        }

    }
    public static void animalsDellAll(ArrayList<String> animals){
        System.out.println("Вы точно хотите очистить весь список? ");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        Scanner k = new Scanner(System.in);
        Integer dell = k.nextInt();
        if (dell == 1){
            if (!animals.isEmpty()){
                animals.clear();
                System.out.println("Вы очистили весь список зоопарка");
            }
            else {
                System.out.println("У вас уже пустой список");
            }
        }
        else {
            System.out.println("Вы выбрали не удалять список");
        }
    }
    public static void animalsFind(ArrayList<String> animals){
        System.out.println("Какого животного хотите найти ");
        Scanner k = new Scanner(System.in);
        String find = k.next();
        if (animals.contains(find)){
           System.out.printf("%s есть в списке", find);
           System.out.println();
        }
        else {
            System.out.printf("%s нету в списке",find);
            System.out.println();
        }
    }

}