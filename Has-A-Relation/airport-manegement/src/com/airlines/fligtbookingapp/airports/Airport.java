package com.airlines.fligtbookingapp.airports;

import com.airlines.fligtbookingapp.terminals.Terminals;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
        //@Data-it gives the combination of all above annotations and not necessory to write the all those.

public class Airport {


   private Terminals terminals ;

   private int airportFees ;

   public boolean allow(Terminals terminal){
     boolean isAllowed = false;
      if(airportFees >= 1000) {

          System.out.println("fees is paid.. pleas collect your possport");
          if (terminal != null) {
              System.out.println("possport is fine.. initialize posport details");

              terminals = terminal;
              this.terminals.displayDetails();
              isAllowed = true;
              System.out.println("Details are fine .. you are allowed to  airport ");
          } else {
              System.out.println("incorrect possport details");
          }
      }
         else{
            System.out.println("first pay fees after you can go to possport checking");
         }

      return isAllowed;
   }

}

