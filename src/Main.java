//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /*Transport[] transport = new Transport[5];
    transport[0]= new Transport();
    transport[1] = new Boat();
    transport[2]= new Car();
    for(int i = 0; i<3; i++){
        System.out.print("i = "+i + ": ");
        transport[i].move();
    }*/

    Animal[] animals = new Animal[2];
    animals[0] = new Dog();
    animals[1] = new Cat();

    animals[0].name = "Бобик";
    animals[1].name = "Мурзик";

    for(int i = 0; i<2; i++){
        System.out.print("i = "+i + ": ");
        animals[i].info();
        animals[i].sound();
    }
}
