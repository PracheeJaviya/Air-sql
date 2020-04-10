public class pythonexec implements Runnable {

    private String commandParameters = "scrape.py";

    // Just Creating a Constructor 
    public pythonexec(String cmd)
    {
         this.commandParameters = cmd;
    }

    public void run()
    {
      try
      {
        Runtime runtime = Runtime.getRuntime();
        // Custom command parameters can be passed through the constructor.
        Process process = runtime.exec("python " + commandParameters);
        process.getOutputStream();
      }
      catch(Exception e)
      {
             // Some exception to be caught..
      }
    }   
}