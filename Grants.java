 class Main {

    public static void main(String[] args) {
        Student newAspirant = new Aspirant( "Viktor", "Rybov", "ATP-2022", "");
        newAspirant.setAvgMark(5.0);
        System.out.println("Стипендия аспиранта " + newAspirant.getScolarship());

        Student[] Learners = {new Student("Ivan", "Ivanov", "ATP-2022"), new Aspirant("Petr", "Petrov", "ATP-2022", "essai")};
        Learners[0].setAvgMark(5);
        Learners[1].setAvgMark(4);
        for (int i = 0; i < Learners.length; i++) {
            System.out.println("Учащийся " + i + " = " + Learners[i]);
            System.out.println("Его стипендия " + Learners[i].getScolarship());
        }
    }
}
