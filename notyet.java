公共类Puppy { int puppyAge ;
    public Puppy ( String name ) { //这个构造器有一个参数：name  
      
      
      系统。出去。println ( "小狗的名字是：" + name ) ; 
    }公共无效setAge ( int年龄) { puppyAge =年龄;
    } public int getAge ( ) {系统.出去。println ( "年轻人的年龄为：" + puppyAge ) ; 
       返回小狗年龄；
    } public static void main ( String [ ] args ) { /*创建对象*/ Puppy myPuppy = new Puppy ( " tommy " ) ;
       /*通过方法来设定年龄*/ myPuppy .设置年龄（2 ）；
       /*调用另一个方法获取年龄*/ myPuppy .获取年龄（）；
       /*你也可以像下面这样访问成员变量*/ System .出去。println ( "变量值 
   ：" + myPuppy.puppyAge ) ; } } 
