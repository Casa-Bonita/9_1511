package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //обработка через блок try catch
//        int[] arr = new int[2];
//        try {
//            System.out.println(arr[6]);
//            System.out.println(1 / 0);
//            System.out.println("end try");
//        }catch(ArithmeticException e){
//            //System.out.println("Произошло деление на ноль");
//            e.printStackTrace();
//        }catch(ArrayIndexOutOfBoundsException e){
//            //System.out.println("Выход за границы массива");
//            e.printStackTrace();
//        }

        //обработка через try catch вариант 2 (через метод)
//        try {
//            task1();
//        }catch(ArithmeticException e){
//            e.printStackTrace();
//        }

        //обработка через throws
//        File file = new File("file1.txt");
//        try {
//            task2(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        //System.out.println("my programm");


//        File file = new File("file1.txt");
//        try {
//            Scanner scn = new Scanner(file);
//            //считываем по словам
////            while(scn.hasNext()){
////                System.out.println(scn.next());
////            }
//            //считываем по строкам
//            while(scn.hasNextLine()){
//                System.out.println(scn.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Задача 1. Создать файл с числами. Считать его и найти максимальное и минимальное

//        File file = new File("file2.txt");
//        try {
//            Scanner scn = new Scanner(file);
//            int val = 0;
//            if(scn.hasNext()){
//                val = Integer.valueOf(scn.next());
//            }else{
//                System.out.println("Файл пустой");
//                return;
//            }
//            int max = val;
//            int min = val;
//
//            while (scn.hasNext()) {
//
//                val = Integer.valueOf(scn.next());
//                System.out.println(val);
//                if (val > max) {
//                    max = val;
//                }
//                if(val < min){
//                    min = val;
//                }
//            }
//            System.out.println("max = " + max + "  " + "min = " + min);
//        } catch(FileNotFoundException e) {
//            e.printStackTrace();
//        }


        //Задача 2. Тоже самое, только числа записаны в столбец
//        File file = new File("file3.txt");
//        try {
//            Scanner scn = new Scanner(file);
//            int val = 0;
//            if(scn.hasNextLine()){
//                val = Integer.valueOf(scn.nextLine());
//            }else{
//                System.out.println("Файл пустой");
//                return;
//            }
//            int max = val;
//            int min = val;
//
//            while (scn.hasNextLine()) {
//
//                val = Integer.valueOf(scn.nextLine());
//                System.out.println(val);
//                if (val > max) {
//                    max = val;
//                }
//                if(val < min){
//                    min = val;
//                }
//            }
//            System.out.println("max = " + max + "  " + "min = " + min);
//        } catch(FileNotFoundException e) {
//            e.printStackTrace();
//        }


        //Запись в файл
//        try {
//            FileWriter fileWriter = new FileWriter("file4.txt");
//            fileWriter.write("one two\n");
//            fileWriter.write("three");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Задача 3. Отображается меню:
        /*
        1. Добавить число
        2. Вывести все числа
        3. Удалить число
        4. Выход
         */


//        ArrayList<Integer> list = new ArrayList<>();
//        String filePath = "file5.txt";
//        try {
//            Scanner scnFile = new Scanner(new File(filePath));
//            int val;
//            while(scnFile.hasNext()){
//                //val = Integer.valueOf(scnFile.next());
//                val = scnFile.nextInt();
//                list.add(val);
//            }
//        } catch (FileNotFoundException e) {
//            //e.printStackTrace();
//        }
//
//        String input = "";
//        Scanner scn = new Scanner(System.in);
//        while(!input.equals("4")) {
//            System.out.println("1. Добавить число");
//            System.out.println("2. Вывести все числа");
//            System.out.println("3. Удалить число");
//            System.out.println("4. Выход");
//
//            input = scn.next();
//            if(input.equals("1")){
//                System.out.println("Введите число");
//                int temp = scn.nextInt();
//                list.add(temp);
//            }else if(input.equals("2")){
//                System.out.println(list);
//            }else if(input.equals("3")){
//                System.out.println("Введите индекс удаляемого числа");
//                int index = scn.nextInt();
//                list.remove(index);
//            }else if(input.equals("4")){
//                try {
//                    FileWriter fw = new FileWriter(filePath);
//                    for (int i = 0; i < list.size(); i++) {
//                        fw.write(list.get(i) + " ");
//                    }
//                    fw.close();
//                }catch(IOException e){
//
//                }
//            }
//        }
//
//
//        //Как записать товары в файл
//        //Обычно все параметры объекта записывают через разделитель. Зачастую это ;
//        //назвнаие;цена;количество
//
//
//        String filePath = "fileTovar.txt";
//        ArrayList<Tovar> listTovar = new ArrayList<>();
//        //как записать
////        listTovar.add(new Tovar("hleb", 100, 20));
////        listTovar.add(new Tovar("moloko", 80, 25));
////
////        try {
////            FileWriter fw = new FileWriter(filePath);
////            for (int i = 0; i < listTovar.size(); i++) {
////                fw.write(listTovar.get(i).getName());
////                fw.write(";");
////                fw.write(String.valueOf(listTovar.get(i).getPrice()));
////                fw.write(";");
////                fw.write(String.valueOf(listTovar.get(i).getCount()));
////                fw.write("\n");
////            }
////            fw.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        //как считать
//
//        try {
//            Scanner scn = new Scanner(new File(filePath));
//            while(scn.hasNextLine()){
//                String line = scn.nextLine();
//                String[] arr = line.split(";");
//                Tovar tovar = new Tovar(arr[0], Double.valueOf(arr[1]), Integer.valueOf(arr[2]));
//                listTovar.add(tovar);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < listTovar.size(); i++) {
//            System.out.println(listTovar.get(i).getName()+" "+listTovar.get(i).getPrice()+" "+listTovar.get(i).getCount());
//        }
//
//    }
//
//
//    public static void task1(){
//        int a = 2;
//        int b = 0;
//        if(b==0){
//            System.out.println("Генерация исключения");
//            throw new ArithmeticException(); //сами генерируем исключение
//        }
//        else{
//            System.out.println(a/b);
//        }
//
//    }
//
//    //обработка через throws
//    public static void task2(File file) throws FileNotFoundException{
//        if (!file.exists()) {
//            System.out.println("Файл не существует");
//            throw new FileNotFoundException();
//        } else {
//            System.out.println("Файл существует");
//        }


//
//------------------------------------------------------------ HOMEWORK ------------------------------------------------------------
//------------------------------------------------------------ HOMEWORK ------------------------------------------------------------
//


////        Task 1.
////        Создать вручную файл с содержимым: 2 4 5 6 7
////        Считать из него числа и найти их сумму, максимум и минимум
//
//        int [] array = new int [5];
//        String filePath = "fileTask1.txt";
//        File file = new File(filePath);
//        int i = 0;
//        try{
//            Scanner scn = new Scanner(file);
//            while(scn.hasNextInt()){
//                //array[i] = Integer.valueOf(scn.next());
//                array[i] = scn.nextInt();
//                i++;
//            }
//            int sum = 0;
//            int min = array[0];
//            int max = array[0];
//            for (int j = 0; j < array.length; j++) {
//                sum = sum + array[j];
//                if (array[j] < min) {
//                    min = array[j];
//                }
//                if (array[j] > max) {
//                    max = array[j];
//                }
//                System.out.println("array [" + j + "] = " + array[j]);
//            }
//            //System.out.print("\n" + "SUMMA = " + sum + "  " + "MIN = " + min  + "  " + "MAX =  " + max);
//            System.out.println(String.format("\nSUMMA = %d, MIN = %d, MAX = %d", sum, min, max));
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
////        end - Task 1.
//
//
////        Task 2.
////        Создать вручную файл с содержимым:
////        Александр Пушкин; Лев Толстой; Федор Достоевский
////        Считать из него всех авторов и вывести каждого автора в отдельной строке в консоли
//
//        try {
//            String filePath = "fileTask2.txt";
//            Scanner scn = new Scanner(new File(filePath));
//            //String [] array = new String [3];
//            ArrayList<String> author = new ArrayList();
//
//            while (scn.hasNextLine()) {
//                String line = scn.nextLine();
//                String[] arr = line.split(";");
//                for (int i = 0; i < arr.length; i++) {
//                    author.add(arr[i]);
//                }
//
//            }
//            System.out.print(" ");
//            System.out.println(author);
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//
////        end - Task 2.
//
//
//
//
//
////        Task 3.
////        Создать консольное меню:
////        1. Вывести всех авторов
////        2. Добавить автора
////        3. Удалить автора
////        4. Выход
////        При запуске программы все авторы из файла в пункте 2 должны быть считаны в программу.
////        При завершении программы все изменения должны быть сохранены в том же файле
//        ArrayList<String> list = new ArrayList();
//        String [] array = null;
//        Scanner scn = new Scanner(System.in);
//        String input = "";
//        try {
//            String pathFile = "fileTask2.txt";
//            Scanner scnFile = new Scanner (new File(pathFile));
//            while(scnFile.hasNext()){
//                String line = scnFile.nextLine();
//                array = line.split("; ");
//            }
//            if(array!=null) {
//                for (int i = 0; i < array.length; i++) {
//                    list.add(array[i]);
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while(!input.equals("4")){
//            System.out.println("1. Вывести всех авторов");
//            System.out.println("2. Добавить автора");
//            System.out.println("3. Удалить автора");
//            System.out.println("4. Выход");
//            input = scn.nextLine();
//            if(input.equals("1")){
//                System.out.println(list);
//            }else if(input.equals("2")){
//                System.out.println("Введите имя и фамилию автора через пробел:");
//                String varNewAuthor = scn.nextLine();
//                list.add(varNewAuthor);
//                System.out.println();
//            }else if(input.equals("3")){
//                System.out.println("Введите имя и фамилию автора через пробел:");
//                String varDelete = scn.nextLine();
//
//                for (int i = 0; i < list.size(); i++) {
//                    if (varDelete.toLowerCase().equals(list.get(i).toLowerCase())){
//                        System.out.println("Автор " + list.get(i) + " удален");
//                        list.remove(list.get(i));
//                        break;
//                    }
//                    if(i == (list.size() - 1)){
//                        System.out.println("Данный автор отсутствует в списке");
//                    }
//                }
//                System.out.println("Введите номер удаляемого автора:");
//                int varNumber = scn.nextInt();
//                list.remove(list.get(varNumber - 1));
//            }else if(input.equals("4")) {
//                try {
//                    String pathFile = "fileTask2.txt";
//                    FileWriter fw = new FileWriter(pathFile);
//                    for (int i = 0; i < list.size(); i++) {
//                        if(i <= (list.size() - 2)){
//                            fw.write(list.get(i) + "; ");
//                        }else {
//                            fw.write(list.get(i));
//                        }
//                    }
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
////        end - Task 3.
//
////        Task 4.
////        Создать вручную файл с содержимым:
////        3; 3; 5; 1; 6; 1; 6
////        Считать из него числа и найти их сумму, максимум и минимум
//
//
//        try {
//            int sum = 0;
//            int max, min;
//            String filePath = "fileTask4.txt";
//            Scanner scn = new Scanner(new File(filePath));
//            String [] array = new String [7];
//            int [] arrayInt = new int [array.length];
//            while (scn.hasNextLine()) {
//                String line = scn.nextLine();
//                array = line.split("; ");
//            }
//            for (int i = 0; i < array.length; i++) {
//                arrayInt[i] = Integer.valueOf(array[i]);
//                System.out.print(arrayInt[i] + " ");
//                sum = sum + arrayInt[i];
//            }
//
//            max = arrayInt[0];
//            min = arrayInt[0];
//            for (int i = 0; i < arrayInt.length; i++) {
//                if(max < arrayInt[i]){
//                    max = arrayInt[i];
//                }
//                if(min > arrayInt[i]){
//                    min = arrayInt[i];
//                }
//            }
//
//            System.out.println("\n" + "SUMMA = " + sum + " " + "\n" + "MAX = " + max + " " +"\n" + "MIN = " + min);
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//
//        end - Task 4.

////        Task 5.
////        5. Создать вручную excel файл с содержимым:
////        Александр Пушкин; 1799; Евгений Онегин: Капитанская дочка: Пиковая дама
////        Лев Толстой; 1828; Анна Коренина: Война и мир
////        Федор Достоевский; Братья Карамазовы: Преступление и наказание: Игрок: Записки из подполья
////        Данные в файле имеют следующий формат: автор; год рождения; книга1:книга2:....:книгаN
////        У каждого автора может быть любое количество книг, перечисленные через двоеточие.
////        Сохранить созданный excel в формате csv. Далее, написать программу, работающую с этим csv. (csv - это файл, который является одновременно текстовым,
////        его можно открыт через блокнот/wordpad и прочее и одновременно такой файл поддерживается excel).
////        Создать меню
////        1. Вывести список авторов и их произведения
////        2. Вывести произведения по фамилии автора
////        3. Добавить произведение автору
////        4. Удалить произведение у автора
////        5. Добавить автора
////        6. Удалить автора
////        7. Выход
////        При запуске программы данные из файла должны быть считаны в программу.
////        При завершении программы все изменения должны быть сохранены в том же файле
//
//
//        ArrayList<Author> listAuthorYearBooks = new ArrayList<>();  // список, содержащий автора (имя-фамилия) -год рождения - книги
//
//        Scanner scn = new Scanner(System.in);
//        String input = "";
//        String authorName, authorSurname;   // имя фамилия автора
//        String pathFile = "fileTask5.csv";
//
//        try {
//            Scanner scnFile = new Scanner(new File(pathFile));
//            while (scnFile.hasNextLine()) {
//                ArrayList<String> listBooks = new ArrayList<>(); // список, содержащий только книги автора
//                String line = scnFile.nextLine();
//
//                String[] arrayAuthorYearBooks = line.split(";");  // разделяем строку по знаку ";" на элементы массива
//
//                String line1 = arrayAuthorYearBooks[0];  // 0-й элемент массива разделяем по знаку " " и создаем имя и фамилию автора (name и surname)
//                String[] arrayNames = line1.split(" ");
//                authorName = arrayNames[0];
//                authorSurname = arrayNames[1];
//
//                String line2 = arrayAuthorYearBooks[2];  // 2-й элемент массива разделяем по знаку ":" и создаем список с книгами автора
//                listBooks.addAll(Arrays.asList(line2.split(":")));
//
//                Author authorYearBooks = new Author(authorName, authorSurname, Integer.valueOf(arrayAuthorYearBooks[1]), listBooks);  //  создаем экземпляр класса Author
//                listAuthorYearBooks.add(authorYearBooks);  // создаем список, содержащий экземпляры класса Author
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.print("Выберите пункт меню");
//        while(!input.equals("7")) {
//            System.out.println("\n");
//            System.out.println("1. Вывести список авторов и их произведения");
//            System.out.println("2. Вывести произведения по фамилии автора");
//            System.out.println("3. Добавить произведение автору");
//            System.out.println("4. Удалить произведение у автора");
//            System.out.println("5. Добавить автора");
//            System.out.println("6. Удалить автора");
//            System.out.println("7. Выход");
//            input = scn.nextLine();
//            if (input.equals("1")) {  //1. Вывести список авторов и их произведения
//
//                for (int i = 0; i < listAuthorYearBooks.size(); i++) {
//                    Author author = listAuthorYearBooks.get(i);
//                    System.out.print(author.getName() + " " + author.getSurname() + "; ");
//                    System.out.print(author.getBirth() + "; ");
//                    author.printBooks();
//                }
//
//            }else if (input.equals("2")){  //2. Вывести произведения по фамилии автора
//                System.out.println("Введите фамилию автора");
//                String inputSurname = scn.nextLine();
//
//                for (int i = 0; i < listAuthorYearBooks.size(); i++) {
//                    Author author = listAuthorYearBooks.get(i);
//                    if(inputSurname.equals(author.getSurname())){
//                        System.out.println("Книги автора " + author.getName() + " " + author.getSurname() + ":");
//                        author.printBooks();
//                    }
//                }
//            }
//
//            else if (input.equals("3")){  //3. Добавить произведение автору
//                System.out.println("Введите фамилию автора");
//                String inputSurname = scn.nextLine();
//                String inputBook = "";
//
//                for (int i = 0; i < listAuthorYearBooks.size(); i++) {
//                    Author author = listAuthorYearBooks.get(i);
//                    if (inputSurname.equals(author.getSurname())) {
//                        System.out.println("Автор " + author.getSurname() + " есть в списке" + "\n" + "Введите название книги:");
//                        inputBook = scn.nextLine();
//                        author.addBook(inputBook);
//                        System.out.println("Книга " + "\"" + inputBook + "\"" + " добавлена в список книг автора " + author.getName() + " " + author.getSurname());
//                        System.out.println("Книги автора:");
//                        author.printBooks();
//                    }
//                }
//            }
//
//            else if (input.equals("4")){  //4. Удалить произведение у автора
//                System.out.println("Введите фамилию автора");
//                String inputSurname = scn.nextLine();
//                String inputBook = "";
//
//                for (int i = 0; i < listAuthorYearBooks.size(); i++) {
//                    Author author = listAuthorYearBooks.get(i);
//                    if (inputSurname.equals(author.getSurname())) {
//                        System.out.println("Автор " + author.getSurname() + " есть в списке" + "\n");
//                        System.out.println("Книги автора:");
//                        author.printBooks();
//                        System.out.println("Введите название книги, которая будет удалена:");
//                        inputBook = scn.nextLine();
//                        author.removeBook(inputBook);
//                        System.out.println("\n" + "Книга " + "\"" + inputBook + "\"" + " удалена из списка книг автора " + author.getName() + " " + author.getSurname());
//                        System.out.println("\n" + "Книги автора:");
//                        author.printBooks();
//                    }
//                }
//            }
//
//            else if (input.equals("5")) {  //5. Добавить автора
//                ArrayList<String> listBooks = new ArrayList<>();
//                System.out.println("Введите имя автора");
//                String inputName = scn.nextLine();
//                System.out.println("Введите фамилию автора");
//                String inputSurname = scn.nextLine();
//                System.out.println("Введите год рождения автора");
//                String inputBirthTemp = scn.nextLine();
//                int inputBirth = Integer.valueOf(inputBirthTemp);
//                System.out.println("Ввод книг автора. Для завершения наберите \"end\", а затем нажимите \"enter\"");
//
//                String inputBook = "";
//                while (!inputBook.equals("end")) {
//                    System.out.println("Введите книгу автора:");
//                    inputBook = scn.nextLine();
//                    if(!inputBook.equals("end")){
//                        listBooks.add(inputBook);
//                    }else{
//                        break;
//                    }
//                }
//
//                Author authorYearBooks = new Author(inputName, inputSurname, inputBirth, listBooks);  //  создаем экземпляр класса Author
//                listAuthorYearBooks.add(authorYearBooks);  // создаем список, содержащий экземпляр класса Author
//            }
//
//            else if (input.equals("6")){  //6. Удалить автора
//                System.out.println("Введите фамилию автора");
//                String inputSurname = scn.nextLine();
//                int index = 0;
//
//                for (int i = 0; i < listAuthorYearBooks.size(); i++) {
//                    Author author = listAuthorYearBooks.get(i);
//                    if (inputSurname.equals(author.getSurname())) {
//                        System.out.println("Автор " + author.getSurname() + " есть в списке" + "\n");
//                        System.out.println("Книги автора:");
//                        author.printBooks();
//                        index = i;
//                    }
//                }
//
//                System.out.println("\n" + "Удалить автора? (да/нет)");
//                String inputChoice = scn.nextLine();
//                Author author = listAuthorYearBooks.get(index);
//                if (inputChoice.equals("да")) {
//                    System.out.println("Информация об авторе " + author.getName() + " " + author.getSurname() + " удалена");
//                    listAuthorYearBooks.remove(index);
//                }
//            }
//
//            else if (input.equals("7")){  //7. Выход
//                try {
//                    FileWriter fw = new FileWriter(pathFile);
//                    for (int i = 0; i < listAuthorYearBooks.size(); i++) {
//                        Author author = listAuthorYearBooks.get(i);
//                        String tempLine1 = author.getName() + " " + author.getSurname();
//                        String tempLine2 = String.valueOf(author.getBirth());
//                        String tempLine3 = "";
//                        for (int j = 0; j < author.getBooksCount(); j++) {
//                            if(j < (author.getBooksCount() - 1)){
//                                tempLine3 = tempLine3 + author.getBook(j) + ":";
//                            }else{
//                                tempLine3 = tempLine3 + author.getBook(j);
//                            }
//                        }
//                        String tempLine = tempLine1 + ";" + tempLine2 + ";" + tempLine3 + "\n";
//                        fw.write(tempLine);
//                    }
//                    fw.close();
//                    System.out.println("Программа завершила свою работу");
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }else{
//                System.out.print("Некорректный ввод");
//            }
//        }
////        end - Task 5.

//        Task 6.
//        6. На странице википедии есть таблица со списком самых дорогих картин мира
//     https://ru.wikipedia.org/wiki/%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_%D1%81%D0%B0%D0%BC%D1%8B%D1%85_%D0%B4%D0%BE%D1%80%D0%BE%D0%B3%D0%B8%D1%85_%D0%BA%D0%B0%D1%80%D1%82%D0%B8%D0%BD
//     Сформировать на основе этой таблицы ексел файл из первых 10-и строк этой таблицы. Включить в нее столбцы:
//     - номер
//     - цена
//     - название картины
//     - художник
//     - год создания
//     - продавец
//     - покупатель
//     Сохранить созданный ексел в формате csv. Далее, написать программу, работающую с этим csv.
//     Что надо сделать.
//     Нужно написать консольное меню
//     1. Вывести информацию о всех картинах
//     2. Добавить новую картину
//     3. Удалить картину
//     4. Вывести картины одного автора
//     5. Отсортировать картины по цене по возрастанию
//     6. Вывести картины, где покупатель не аноним
//     7. Вывести картины, где указан продавец и покупатель не аноним
//     8. Выход
//
//     При запуске программы данные из csv файла должны загружаться в программу.
//     После завершения работы программы все изменения с картинами должны сохраниться в том же файле
//
//     Напоминание: при считывании классом Scanner файла с русскими буквами необходимо указать кодировку кириллица следующим образом:
//     Scanner scn = new Scaner (new File ("ваш файл"), "cp1251");
//     Если этого не сделать, русские символы не будут считываться.



        ArrayList<String> listHeader = new ArrayList(); // список для "шапки" таблицы
        ArrayList<Integer> listNumber = new ArrayList(); // список для нумерации строк таблицы
        ArrayList<Picture> listPictureFullInfo = new ArrayList<>(); // список для информации внутри таблицы (без "шапки")
        Scanner scn = new Scanner(System.in);
        String input = "";

        String pathFile = "fileTask6.csv";

        try {
            Scanner scnFile = new Scanner(new File(pathFile), "cp1251");
            scnFile.hasNextLine();
            String header = scnFile.nextLine(); // считываем "шапку" таблицы
            listHeader.addAll(Arrays.asList(header.split(":"))); // создаём список с элементами "шапки" таблицы

            while(scnFile.hasNextLine()){
                String line = scnFile.nextLine();
                String[] arrayPictureLine = line.split(";");  // разделяем строку по знаку ";" на элементы массива
                String price = "";
                String priceTemp = arrayPictureLine[1];
                if(priceTemp.contains(",")){
                    price = priceTemp.replace(',','.');
                }else{
                    price = priceTemp + ".0";
                }

                listNumber.add(Integer.valueOf(arrayPictureLine[0]));

                Picture pictureLine = new Picture(Double.valueOf(price), arrayPictureLine[2], arrayPictureLine[3], Integer.valueOf(arrayPictureLine[4]), arrayPictureLine[5], arrayPictureLine[6]);
                listPictureFullInfo.add(pictureLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int size = listPictureFullInfo.size();

        System.out.print("Выберите пункт меню");
        while(!input.equals("8")) {
            System.out.println("\n");
            System.out.println("1. Вывести информацию о всех картинах");
            System.out.println("2. Добавить новую картину");
            System.out.println("3. Удалить картину");
            System.out.println("4. Вывести картины одного автора");
            System.out.println("5. Отсортировать картины по цене по возрастанию");
            System.out.println("6. Вывести картины, где покупатель не аноним");
            System.out.println("7. Вывести картины, где указан продавец и покупатель не аноним");
            System.out.println("8. Выход");
            input = scn.nextLine();

            if (input.equals("1")) {  //1. Вывести информацию о всех картинах
                Picture headerAndNumber = new Picture(listHeader, listNumber); // экземпляр headerAndNumber класса Picture для печати заголовка и номеров строк
                headerAndNumber.printHeader();
                for (int i = 0; i < size; i++) {
                    headerAndNumber.printNumber(i);
                    Picture picture = listPictureFullInfo.get(i);
                    picture.printPicture();
                }

            }else if(input.equals("2")){  //2. Добавить новую картину
                System.out.println("Введите автора картины:");
                String inputAuthor = scn.nextLine();
                System.out.println("Введите стоимость картины, в млн. долларов США:");
                String inputPrice = scn.nextLine();
                if(inputPrice.contains(",")){
                    inputPrice = inputPrice.replace(',','.');
                }
                System.out.println("Введите название картины:");
                String inputName = scn.nextLine();
                System.out.println("Введите год создания картины:");
                String inputYear = scn.nextLine();
                System.out.println("Введите продавца картины:");
                String inputSeller = scn.nextLine();
                System.out.println("Введите покупателя картины:");
                String inputBuyer = scn.nextLine();


                listNumber.add(size + 1);
                Picture picture = new Picture(Double.valueOf(inputPrice), inputName, inputAuthor, Integer.valueOf(inputYear), inputSeller, inputBuyer);
                listPictureFullInfo.add(picture);

                System.out.println("Информация о картине:");
                Picture headerAndNumber = new Picture(listHeader, listNumber);
                headerAndNumber.printHeader();
                headerAndNumber.printNumber(size);
                picture.printPicture();
                System.out.println("успешно добавлена");

            }else if(input.equals("3")){  //3. Удалить картину
                Picture headerAndNumber = new Picture(listHeader, listNumber);
                System.out.println("Введите название картины:");
                String inputName = scn.nextLine();
                Picture picture = new Picture();
                int index = 0;

                for(int i = 0; i < size; i++){
                    picture = listPictureFullInfo.get(i);
                    if(inputName.equals(picture.getPictureName())){
                        System.out.println("Данная картина есть в списке картин" + "\n" + "Удалить информацию о картине? (да/нет)");
                        String choice = scn.nextLine();
                        if(choice.equals("да")){
                            System.out.println("Информация о картине:");
                            headerAndNumber.printHeader();
                            headerAndNumber.printNumber(i);
                            picture.printPicture();
                            System.out.println("была успешно удалена");
                            listPictureFullInfo.remove(picture);
                            index = size - 1;
                            listNumber.remove(index);
                            size = index;
                        }else {
                            if(choice.equals("нет")){
                                System.out.println("Отказ от удаления");
                            }else{
                                System.out.println("Некорректный ввод");
                            }
                        }
                        break;
                    }else{
                        System.out.println("Данная картина отсутствует в списке картин");
                        break;
                    }
                }

            }else if(input.equals("4")){  //4. Вывести картины одного автора
                Picture headerAndNumber = new Picture(listHeader, listNumber);
                System.out.println("Введите художника:");
                String inputAuthor = scn.nextLine();
                Picture picture = new Picture();
                int index = 0;
                for (int i = 0; i < size; i++) {
                    picture = listPictureFullInfo.get(i);
                    if(inputAuthor.equals(picture.getAuthor())){
                        index++;
                    }
                }
                if(index != 0){
                    headerAndNumber.printHeader();
                    int i = 0;
                    while (i < size){
                        picture = listPictureFullInfo.get(i);
                        if(inputAuthor.equals(picture.getAuthor())){
                            headerAndNumber.printNumber(i);
                            picture.printPicture();
                        }
                        i++;
                    }
                }

            }else if(input.equals("5")) {  //5. Отсортировать картины по цене по возрастанию
                for (int i = 0; i < listPictureFullInfo.size(); i++) {
                    Picture pictureMin = listPictureFullInfo.get(i);
                    int indexMin = i;
                    for (int j = i; j < listPictureFullInfo.size() ; j++) {
                        Picture currentPicture = listPictureFullInfo.get(j);
                        if(currentPicture.getPrice() < pictureMin.getPrice()){
                            pictureMin = currentPicture;
                            indexMin = j;
                        }
                    }
                    Picture tmp = listPictureFullInfo.get(i);
                    listPictureFullInfo.set(i, pictureMin);
                    listPictureFullInfo.set(indexMin, tmp);
                }
                
//                Picture headerAndNumber = new Picture(listHeader, listNumber);
//                double minPrice = 0.0;
//                int indexMinPrice = 0;
//                Picture pictureI = new Picture();


//                for (int i = 0; i < size; i++) {
//                    pictureI = listPictureFullInfo.get(i);
//                    minPrice = pictureI.getPrice();
//                    indexMinPrice = i;
//                    for (int j = i; j < size; j++) {
//                        Picture pictureJ = new Picture();
//                        pictureJ = listPictureFullInfo.get(j);
//                        if(pictureJ.getPrice() < minPrice){
//                            minPrice = pictureJ.getPrice();
//                            indexMinPrice = j;
//                        }
//                    }
//                    // int tmp = arr[i];
//                    // int temp = list.get(i).getPrice();
//                    Picture pictureTemp = new Picture(pictureI.getPrice(), pictureI.getPictureName(), pictureI.getAuthor(), pictureI.getYear(), pictureI.getSeller(), pictureI.getBuyer());
//
//
//                    // arr[i] = min;  list.add(10);
//                    // list.get(i).setPrice(min);
//
//                    Picture pictureIndexMinPrice = new Picture();
//                    pictureIndexMinPrice = listPictureFullInfo.get(indexMinPrice);
//
//                    double tempPrice = pictureIndexMinPrice.getPrice();
//                    pictureI.setPrice(tempPrice);
//
//                    String tempPictureName = pictureIndexMinPrice.getPictureName();
//                    pictureI.setPictureName(tempPictureName);
//
//                    String tempAuthor = pictureIndexMinPrice.getAuthor();
//                    pictureI.setAuthor(tempAuthor);
//
//                    int tempYear = pictureIndexMinPrice.getYear();
//                    pictureI.setYear(tempYear);
//
//                    String tempSeller = pictureIndexMinPrice.getSeller();
//                    pictureI.setSeller(tempSeller);
//
//                    String tempBuyer = pictureIndexMinPrice.getBuyer();
//                    pictureI.setBuyer(tempBuyer);
//
//
//                    // arr[indexMin] = tmp;
//                    // list.get(indexMin).setPrice(temp);
//
//                    tempPrice = pictureTemp.getPrice();
//                    pictureIndexMinPrice.setPrice(tempPrice);
//
//                    tempPictureName = pictureTemp.getPictureName();
//                    pictureIndexMinPrice.setPictureName(tempPictureName);
//
//                    tempAuthor = pictureTemp.getAuthor();
//                    pictureIndexMinPrice.setAuthor(tempAuthor);
//
//                    tempYear = pictureTemp.getYear();
//                    pictureIndexMinPrice.setYear(tempYear);
//
//                    tempSeller = pictureTemp.getSeller();
//                    pictureIndexMinPrice.setSeller(tempSeller);
//
//                    tempBuyer = pictureTemp.getBuyer();
//                    pictureIndexMinPrice.setBuyer(tempBuyer);
//
//                }

//                for(int i = 0; i < size; i++){
//                    headerAndNumber.printNumber(i);
//                    Picture picture = listPictureFullInfo.get(i);
//                    picture.printPicture();
//                }

            }else if(input.equals("6")) {  //6. Вывести картины, где покупатель не аноним (к анониму также относится "неизвестен")
                Picture headerAndNumber = new Picture(listHeader, listNumber);
                Picture picture = new Picture();
                int index = 0;
                for (int i = 0; i < size; i++) {
                    picture = listPictureFullInfo.get(i);
                    if(!picture.getBuyer().equals("аноним") && !picture.getBuyer().equals("неизвестен")){
                        index++;

                    }
                }
                if(index != 0){
                    headerAndNumber.printHeader();
                    int i = 0;
                    index = 0;
                    while (i < size){
                        picture = listPictureFullInfo.get(i);
                        if(!picture.getBuyer().equals("аноним") && !picture.getBuyer().equals("неизвестен")){
                            headerAndNumber.printNumber(index);
                            picture.printPicture();
                            index++;
                        }
                        i++;
                    }
                }

            }else if(input.equals("7")) {  //7. Вывести картины, где указан продавец и покупатель, не аноним (к анониму также относится "неизвестен"))
                Picture headerAndNumber = new Picture(listHeader, listNumber);
                Picture picture = new Picture();
                int index = 0;
                for (int i = 0; i < size; i++) {
                    picture = listPictureFullInfo.get(i);
                    if(!picture.getBuyer().equals("аноним")){
                        if(!picture.getBuyer().equals("неизвестен")){
                            if(!picture.getSeller().equals("аноним")){
                                if(!picture.getSeller().equals("неизвестен")){
                                    index++;
                                }
                            }
                        }
                    }
                }
                if(index != 0){
                    headerAndNumber.printHeader();
                    int i = 0;
                    index = 0;
                    while (i < size){
                        picture = listPictureFullInfo.get(i);
                        if(!picture.getBuyer().equals("аноним")){
                            if(!picture.getBuyer().equals("неизвестен")){
                                if(!picture.getSeller().equals("аноним")){
                                    if(!picture.getSeller().equals("неизвестен")){
                                        headerAndNumber.printNumber(index);
                                        picture.printPicture();
                                        index++;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }

            }else if(input.equals("8")) {  //8. Выход
                Picture picture = new Picture();
                try{
                    FileWriter fw = new FileWriter(pathFile, Charset.forName("cp1251"));
                    String tempLine = "";
                    String tempLine1 = "";
                    String tempLine2 = "";
                    for(int i = 0; i < listHeader.size(); i++){
                        if(i < (listHeader.size() - 1)){
                            tempLine1 = String.valueOf(listHeader.get(i)) + ";";
                            tempLine = tempLine + tempLine1;
                        }else{
                            tempLine2 = String.valueOf(listHeader.get(i));
                            tempLine = tempLine + tempLine2 + "\n";
                        }
                    }
                    tempLine = tempLine + "\n";
                    fw.write(tempLine);

                    for(int i = 0; i < size; i++){
                        tempLine = "";
                        picture = listPictureFullInfo.get(i);
                        tempLine = String.valueOf(listHeader.get(i)) + ";" + String.valueOf(picture.getPrice()) + ";" + picture.getPictureName() + ";" + picture.getAuthor() + ";" + String.valueOf(picture.getYear()) + ";" + picture.getSeller() + ";" + picture.getBuyer();
                        //tempLine = picture.getPrice() + ";" + picture.getPictureName() + ";" + picture.getAuthor() + ";" + picture.getYear() + ";" + picture.getSeller() + ";" + picture.getBuyer();
                        tempLine = tempLine + "\n";
                        fw.write(tempLine);
                    }
                    fw.close();
                    System.out.println("Программа завершила свою работу");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else{
                System.out.print("Некорректный ввод");
            }
        }


    }
}
