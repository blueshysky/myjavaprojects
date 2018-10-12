class A{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal. Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and so dedicated, can long endure. We are met on a great battle-field of that war. We have come to dedicate a portion of that field, as a final resting place for those who here gave their lives that that nation might live. It is altogether fitting and proper that we should do this.");  
System.out.println(sb.capacity());//default 16  
sb.append("Hello");  
System.out.println(sb.capacity());//now 16  
sb.append("java is my favourite language");  
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
sb.ensureCapacity(10);//now no change  
System.out.println(sb.capacity());//now 34  
sb.ensureCapacity(50);//now (34*2)+2  
System.out.println(sb.capacity());//now 70  
}  
}  
