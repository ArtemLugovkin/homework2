public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println("frog " + frog);
        frog = frog * 10 / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);



        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var weightOfTwoFighters = firstFighter + secondFighter;
        System.out.println(weightOfTwoFighters);
        var weightDiffereceOfFighters = secondFighter - firstFighter;
        System.out.println(weightDiffereceOfFighters);
        var weightDiffereceOfFighters1 = secondFighter % firstFighter;
        System.out.println(weightDiffereceOfFighters1);

        var openingHours = 640;
        var employeeHours = 8;
        var numberOfEmployees = openingHours / employeeHours;
        System.out.println("Всего работников в компании -" + numberOfEmployees + " человек" );
        var additionalEmployees = 94;
        var nowPeopleInTheCompany = numberOfEmployees + additionalEmployees;
        System.out.println(nowPeopleInTheCompany);
        var newOppeningHours = nowPeopleInTheCompany * employeeHours;
        System.out.println("Если в компании работает " + nowPeopleInTheCompany + " человека, то всего " +
                newOppeningHours + " часов работы может быть поделено между сотрудниками");





    }
}