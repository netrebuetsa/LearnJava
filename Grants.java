 class Main {

    public static void main(String[] args) {
        Student newAspirant = new Aspirant( "Viktor", "Rybov", "ATP-2022", "");
        newAspirant.setAvgMark(5.0);
        System.out.println("Стипендия аспиранта " + newAspirant.getScolarship());
    }
}
