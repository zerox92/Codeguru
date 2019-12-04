package TestProjj.ArtId;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */

import software.amazon.codeguruprofilerjavaagent.Profiler;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        new Profiler.Builder()
        .profilingGroupName("CodeGuruTestProfileGroup")
        .build().start();
        
        System.out.println( "Done man done !!!!" );
        
        
        String fileName = "intData.dat" ;   long sum = 0;

        try
        {      
          DataInputStream instr = 
            new DataInputStream(
              new BufferedInputStream(
                new FileInputStream( fileName  ) ) );

          sum += instr.readLong();
          sum += instr.readLong();
          System.out.println( "The sum is: " + sum );
          instr.close();
        }
        catch ( IOException iox )
        {
          System.out.println("Problem reading " + fileName );
        }
        
        
        System.out.println( "Hello World!" );
    }
}