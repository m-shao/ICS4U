public class Jam
{
  // Instance Variables
  private String contents ;   // type of fruit in the jar
  private ExpirationDate date  ;      // date packaged and shelf Life
  private int capacity ;      // amount of jam in the jar


  // Constructors
  public Jam( String contents, ExpirationDate date, int size )
  {
    this . contents = contents  ;
    this . date = date ;
    capacity = size;
  }

  public Jam( String contents, String date, int size )
  {
    this . contents = contents  ;
    this . date = new ExpirationDate (date,  200);
    capacity = size;
  }

  // Methods
  public boolean empty ()
  {
    return ( capacity== 0 ) ;
  }

  public String toString()
  {
    return contents + "\n" +  date + "\nCapacity: " +  capacity + " ml."  ;
  }

  public void spread ( int ml )
  {
    if ( !empty() )
    {
      if ( ml <= capacity )
      {
        System.out.println("Spreading " + ml + " ml " + contents );
        capacity = capacity - ml ;
      }
      else
      {
        System.out.println("Spreading " + capacity + " ml " + contents );
        capacity =  0 ;
      }
     }
     else
       System.out.println("No jam in the Jar!");
  }

  public int getCapacity()
  {
  return capacity;
  }

}