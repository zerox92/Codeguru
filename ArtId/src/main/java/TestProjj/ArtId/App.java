package TestProjj.ArtId;

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
        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
//        
//        new Profiler.Builder()
//        .profilingGroupName("CodeGuruTestProfileGroup")
//        .build().start();
        
        System.out.println( "Done man done !!!!" );
    }
}