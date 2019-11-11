package Day46_SupeKeyword;

import Day45_Protected_Default.Test;
/*
 Topic: super Keyword: super. & super()
       Constructor in Inheritance
       super vs this
package: day46_SuperKeyword
Inheritance:  super and sub classes
    
        class   A    extends    B
                sub            super
        subclass:  sub class inherits features from the super class
                    sub class gets rich
                    public and protected access modifiers can always be inheritable in the subclass
                    default access modifier can only be inherited to the classes that are in the same package with
                    private can NEVER be inherited
        superclass: super class does not inherit anything from the sub class
this. : used for calling instances variables, can only be used in object instances
super. : used for calling instances (instance variable and methods) from the super class 
            super keyword can only be used in the subclass
this. vs super. :
        this. : used for calling the instances from the class itself
                to use this, we dont need inheritance 
        super. : used for calling the instances from the super class
                to use super, we MUST have super class and sub class
Constructor: at least one of the constructors from the super class has to be called in the sub class
        
        super class' default constructor is called in the sub class by default
super(): used for calling the constructors from the super class
        MUSt be used in the sub class.
this(): used for calling the constructors from the class itself
 */
class Data {
    
    public  int num1 =10;
    protected  int num2 = 20;
    private  int num3 = 30;
    int num4 = 40;
    
}
public class eee  extends Data{
    //          sub                     super           
    
    /*
         public  int num1 =10;
         protected  int num2 = 20;
          int num4 = 40;
     */
    
        static int staticNum;
               int insNum;
               
               public void mm() {
                   System.out.println( this.insNum );
               }
    
    public static void main(String[] args) {
        //System.out.println( this.insNum ); 
        // in order to call instances in a static method or block, we MUST have object
        
        InheritanceReveiw obj = new InheritanceReveiw();
        
          System.out.println(obj.num1);
          System.out.println(obj.num2);
        //  System.out.println(num3);
          System.out.println( obj.num4 );
          
          Data obj2 = new Data();
          System.out.println( obj2.num1 );
          System.out.println( obj2.num2);
          System.out.println( obj2.num4 );
          
        
          Test obj3 = new Test();
        //  System.out.println( obj3.nameProtected );  // protected is not visible outside package
          // public is worldwide
          
        
          InheritanceReveiw  objA = new InheritanceReveiw();
                            objA.staticNum  = 100;
                            objA.insNum = 200;
                
          InheritanceReveiw  objB = new InheritanceReveiw();
                    objA.staticNum  = 300;
                    objB.insNum = 400;
                    
                System.out.println( objB.insNum );  //400
                System.out.println(objA.insNum );    //200
                
                System.out.println( objB.staticNum );  //300
                System.out.println( objA.staticNum );  //300
          
          
          
    }
    
    
}