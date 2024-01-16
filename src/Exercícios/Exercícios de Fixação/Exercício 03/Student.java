public class Student {
    
    public String name;
    public double nota1;    
    public double nota2;
    public double nota3;    

    public double notaAno() {
        return nota1 + nota2 + nota3;
    }

    public double recuperacao() {
        if (notaAno() < 60) {
            return 60.0 - notaAno();
        }
        else {
            return 0.0;
        }
    }
}
