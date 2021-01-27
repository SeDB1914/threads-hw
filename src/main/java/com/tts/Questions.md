

1. BadThreads compiled and runs with output of "Mares do eat oats" 

2. Adjustments in the sleep durations affect the interruption. 
   When the main runtime is faster tha the CorrectorThread, 
   the exception is thrown and "mares do not eat oats" prints

Would it help to change the parameters of the two invocations of Sleep?
3. Depends on the desired result, but yes to experiment with different outcomes.

How would you guarantee that all changes to message will be visible in the main thread?
4. By adding a join statement you can guarantee that all messages are visible

Who's watching today?