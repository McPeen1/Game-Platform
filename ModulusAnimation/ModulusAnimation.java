package ModulusAnimation;
///import java.util.Scanner;

public class ModulusAnimation {
public static void main( String[] args ) throws Exception {
int repeats = 50;
int steps_per_second = 77;
for ( int i=0; i<repeats*11 ; i++ ) {
if ( i%11 == 0 )
System.out.print(" +1 \r");
else if ( i%11 == 1 )
System.out.print(" |_____0...____|\r");
else if ( i%11 == 2 )
System.out.print(" |__0...._______| \r");
else if ( i%11 == 3 )
System.out.print(" +1|0..._______| \r");
else if ( i%11 == 4 )
System.out.print(" +1|0..._______| \r");
else if ( i%11 == 5 )
System.out.print(" |...0________| \r");
else if ( i%11 == 6 )
System.out.print(" |_....0______| \r");
else if ( i%11 == 7 )
System.out.print(" |_......0___| \r");
else if ( i%11 == 8 )
System.out.print(" |______...0__|\r");
else if ( i%11 == 9 )
System.out.print(" |________...0| \r");
else if ( i%11 == 10 )
System.out.print(" |______0....|");
Thread.sleep(1000/steps_per_second);
}
}
}
