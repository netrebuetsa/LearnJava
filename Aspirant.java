class Aspirant extends Student{
    private String Essai;

    Aspirant (String Fn, String Ln, String Gr, String Es){
        super(Fn, Ln, Gr);
        Essai = Es;
    }

    @Override
    int getScholarship() {
        if (AverageMark == 5)
            return 200;
        else return 100;
    }

    @Override
    public String toString() {
        return (FirstName + " " + LastName + " " + Group + " ");
    }
}
