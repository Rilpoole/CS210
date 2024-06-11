import org.junit.Assert;
import org.junit.Test;

public class Assignment1Problem5Test {
     @Test
     /**
      * Tests that negative input values throw an exception
      */
     public void NegativeException(){
      boolean thrown = false;
      try{
         Assignment1Problem5.GCD(-1, 10);
      }catch(RuntimeException e){
         thrown = true;
      }
      Assert.assertTrue(thrown);
     } 

     @Test
     /**
      * Tests that input values of zero throw an exception
      */
      public void ZeroException(){
         boolean thrown = false;
         try{
            Assignment1Problem5.GCD(0, 10);
         }catch(RuntimeException e){
            thrown = true;
         }
         Assert.assertTrue(thrown);
      } 

      @Test
      /**
       * Tests that minimum input values return normally
       */
      public void MinVal(){
         Assert.assertEquals(1, Assignment1Problem5.GCD(1,1));
        } 

       @Test
       /**
        * Tests that medium input values return normally
        */
        public void MedVal(){
         Assert.assertEquals(15, Assignment1Problem5.GCD(330,75));
        } 

        @Test
        /**
         * Tests that the maximum input values return normally
         */
        public void MaxVal(){
         Assert.assertEquals(Integer.MAX_VALUE, Assignment1Problem5.GCD(Integer.MAX_VALUE,Integer.MAX_VALUE));
        } 

         @Test
         /*
          * Tests that input values above maxiumum throw an exception
          */
          public void OverflowException(){
            boolean thrown = false;
            try{
               Assignment1Problem5.GCD(Integer.MAX_VALUE + 1, Integer.MAX_VALUE + 1);
            }catch(RuntimeException e){
               thrown = true;
            }
            Assert.assertTrue(thrown);
         } 
}
