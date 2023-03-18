/*============================================================
File: ClasseB.java
Data: 25-11-22_22
-------------------------------------------------------------
Graduando: ELIAS DE JESUS MIRANDA 
ANTONIO MARIA PEREIRA DE RESENDE - DOCENTE - DCC 
Disciplina:Engenharia de Software 
TURMA: GCC188-2022/2-V1-10A-G010 
-------------------------------------------------------------*/

class ClasseB {
    private int b1;
    private int b2;

    public ClasseB(){
        b1 = 0;        
        b2 = 0;
    }
    public void getB1(){
        System.out.print("getB1()");
    }
    public void getB2(){
        System.out.print("getB2()");
    }
    public void setB1(){
        System.out.print("setB1()");
    }
    public void setB2(){
        System.out.print("setB2()");
    }
    public void mB1(){
        System.out.print("mB1()");
    }
    public void mB2(){
        System.out.print("mB2()");
    }
    // Atendendo o enunciando 12
    public void mB3(){
        System.out.print("mB3()");
    }

}



















class ClasseB{
    private int b1;
    private float b2;

    public ClasseB(){
        b1= 0;     
        b2= 0;    
    }

    public void getB1(){
       return beUm; 
    }

    public String getMatricula(){
       return beDois; 
    }

    public void setNome(String novoBeUm){
        this.beUm = novoBeUm;
    }

    public void setMatricula(String novoBeDois){
        this.beDois = novoBeDois;
    }
    
    public void metodoBTres(){
        System.out.println("MC3()");
    }
}
