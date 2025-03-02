// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// class Animal {
// String name;
// int lifeExpect;
// int age;

// Animal(String name, int age) {
// this.name = name;
// this.lifeExpect = age;
// this.age = 0;
// System.out.println(this.name + " was born with life expectancy " +
// this.lifeExpect + " year(s)");
// }

// void live(int y) {
// if (this.age >= this.lifeExpect) {
// System.out.println(this.name + " died earlier");
// } else if (this.age + y < this.lifeExpect) {
// this.age += y;
// if (y > 1) {
// System.out.println(this.name + " lived " + y + " more years");
// } else
// System.out.println(this.name + " lived " + y + " more year");

// } else if (this.age + y >= this.lifeExpect) {
// if (this.lifeExpect - this.age == 1) {
// System.out.println(this.name + " lived " + (this.lifeExpect - this.age) + "
// more year and died");
// } else
// System.out.println(this.name + " lived " + (this.lifeExpect - this.age) + "
// more years and died");
// this.age = this.lifeExpect;
// }
// }

// boolean isAlive() {
// if (this.age < this.lifeExpect) {
// System.out.println(this.name + " is alive");
// return true;
// } else
// System.out.println(this.name + " is dead");
// return false;
// }

// }

// public class AnimalDomain1 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int N = scan.nextInt();

// List<Animal> animals = new ArrayList<>();
// for (int i = 0; i < N; ++i) {
// int type = scan.nextInt();
// if (type == 1) {
// String name = scan.next();
// int lifeExpect = scan.nextInt();
// animals.add(new Animal(name, lifeExpect));
// } else if (type == 2) {
// int id = scan.nextInt();
// int year = scan.nextInt();
// animals.get(id - 1).live(year);
// } else if (type == 3) {
// int id = scan.nextInt();
// animals.get(id - 1).isAlive();
// }
// }
// }
// }