class Parentclass{
  public void parentmethod(){
    System.out.println("This is parent class");
  }
}

class Childclass extends Parentclass{
  public void childmethod(){
    System.out.println("This is child class");
  }
}

class Lab7prob1{
  public static void main(String[] args){
    Parentclass a = new Parentclass();
    Childclass b = new Childclass();
    a.parentmethod();
    b.childmethod();
    b.parentmethod();
  }
}