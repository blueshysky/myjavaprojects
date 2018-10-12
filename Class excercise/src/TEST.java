import java.lang.Math;
public class TEST 
{
	public static void main(String[] args) 
	{    
		 double x , y, z, c, v, b, q, w, e, r, t, o;
		 
		 x =Math.ceil( Math.pow( 3 , 0.5 ) );

		y =   Math.floor( Math.pow( 1.5 , 2 ) );	

		z =   Math.ceil( Math.floor( 3.5  ) );

		c =  Math.min( Math.max( 3.0 , 2 ), 2.5);

		v =  Math.max( Math.min( 2.0 , 3 ), 3.0);

		b =   Math.sqrt( Math.pow( 2.0 , 3 ) )	;

		q = Math.pow( Math.sqrt( 9 ) , 2 ) ;

		w = Math.round( Math.max( 2.1 , 3.1 ) )	;

		e = Math.abs( Math.abs( 8.0  ) );

		t = Math.min( Math.abs( 1.5) , 2 ) ;

		o = Math.ceil( Math.pow( 1 , 0.5 ) );

		 System.out.println(x );
		 System.out.println(y );
		 System.out.println(z );
		 System.out.println(c );
		 System.out.println(v );
		 System.out.println(b );
		 System.out.println(q );
		 System.out.println(w );
		 System.out.println(e );
		 System.out.println(t );
		 System.out.println(o );
	}
}
