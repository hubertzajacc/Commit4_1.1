import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      Service s = new Service();

      System.out.print("Imie: ");
      String name = scanner.nextLine().trim();
      if (name.isEmpty() || name.contains(" ")) {
        System.out.println("Imie nie moze byc puste ani zawierac spacji");
        return;
      }

      System.out.print("Wiek: ");
      int age = Integer.parseInt(scanner.nextLine().trim());

      s.addStudent(new Student(name, age));

      var students = s.getStudents();
      for (Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (NumberFormatException e) {
      System.out.println("Wiek musi byc liczba calkowita.");
    } catch (IOException e) {
      System.out.println("Blad pliku: " + e.getMessage());
    }
  }
}