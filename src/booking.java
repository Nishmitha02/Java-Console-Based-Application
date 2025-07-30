import java.util.Scanner;


final class booking {
        Scanner bookin = new Scanner(System.in);
        calendar calen  =  new calendar();
        Filing_agency fl_ag = new Filing_agency();
        special_astro s_t_A_r_S = new special_astro();

        private int num_pax, num_pax_chl, pax_dd, pax_mm;
        private int pax_yy = 2024;
        private int pl_lim=50;
        private String pax_ch_1; // can use same but using diff ones just to be safe.
        private String pax_dest;
        private String pax_dept;
        private String pax_name[] = new String[20] ;

        //fun :)
        final private String FS = "\u001B[6;1m";
        final private String FSR = "\u001B[0m";
        final private String RED = "\u001B[31m";



        booking()
        {   //Initialization area.
            num_pax= -1;
            pax_dd = -1;
        }

       

        protected void booking_ph0()
        {

            System.out.println();
            System.out.println();
            System.out.println("Welcome to the Booking section, we are happy to serve you today!");
            System.out.println();
            System.out.println();

        }

        protected void booking_ph1()
        {   
            while(true)
            {    
                System.out.print("Enter whether you are planning an 'International' or a 'Domestic' Flight:");
                pax_ch_1 = bookin.next();

                switch (pax_ch_1)
                    {
                        case ( "International" ):
                        {   System.out.println();
                            System.out.println("Booking flights to international ariport.");
                       
                            while(true)
                            {
                           
                                System.out.print("Enter your destination Airport:");
                                pax_dest = bookin.nextLine();

                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dest = bookin.nextLine();

                                System.out.println("The Arrival airport you've entered is "+pax_dest+" confirm ?[Y / N ]" );
                                char ch = bookin.next().charAt(0);
                                if (ch == 'Y')
                                {
                                    break;
                                }
                            }
                        
                            while(true)
                            {
                                System.out.print("Enter your Embarking airport: ");
                                pax_dept = bookin.nextLine();
    
                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dept = bookin.nextLine();
    
                                System.out.println("The Arrival airport you've entered is "+pax_dept+" confirm ?[Y / N ]" );
                                char ch1 = bookin.next().charAt(0);

                                if (ch1 == 'Y')
                                {
                                    break;
                                }
                            }
                            break;
                        }
                        
                        case ("Domestic"):
                        {   System.out.println();
                            System.out.println("Booking flights to domestic ariport.");
                   
                            while(true)
                            {
                       
                                System.out.print("Enter your destination Airport:");
                                pax_dest = bookin.nextLine();

                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dest = bookin.nextLine();

                                System.out.println("The Arrival airport you've entered is "+pax_dest+" confirm ?[Y / N ]" );
                                char ch = bookin.next().charAt(0);
                                if (ch == 'Y')
                                {
                                    break;
                                }
                            }
                    
                            while(true)
                            {
                           
                                System.out.print("Enter your Embarking airport: ");
                                pax_dept = bookin.nextLine();

                                ///there is a clash in how the above input seem to be working and this line fixes the input being blank
                                pax_dept = bookin.nextLine();

                                System.out.print("The Arrival airport you've entered is "+pax_dept+" confirm ?[Y / N ]" );
                                char ch1 = bookin.next().charAt(0);

                                if (ch1 == 'Y')
                                {
                                    break;
                                }
                            }
                            break;
                        }

                        case ("skip"): {
                            s_t_A_r_S.special2();
                        }
                        default:
                        System.out.println("Invlid Option"); continue;
                } 
            break;    
        } 
 } 

 protected void booking_ph2(){
    while(true){
        try {
            
            System.out.println("Enter the month you want to book the flight [ MM format ]:");
            pax_mm = bookin.nextInt();
            if(pax_mm>12 || pax_mm<1)
        {
            System.out.println("The specific month is not specified correctly, please enter the month limit followed by the Gregorian Calendar.");
        }
        else{
            
            break;
        }
        } catch (Exception e) {
            bookin.next(); // Clearing the input buffer : Normally when you press enter, the \n also gets stored and remains in the buffer and hence is used to remove any such unwated character from the buffer.
            System.out.println("Please enter the correct digits.");
        }
        
        
    }
    System.out.println();
    calen.printCalendar(2024, pax_mm);
    boolean a=true;

    while(a == true){
            try{
                System.out.println();
                System.out.print("Enter the departure date:");
                pax_dd=bookin.nextInt();

                if(pax_mm == 1 ||pax_mm == 3 || pax_mm == 5 || pax_mm == 7 || pax_mm == 8 || pax_mm == 10 || pax_mm ==12 ){
                    if(pax_dd > 31 || pax_dd < 1){
                            System.out.println("The specific date is not specified correctly, please enter within the max specified by the month.");
                            System.out.println();
                            continue;
                        }
                }

                else if(pax_mm ==2 ||pax_mm == 4 || pax_mm == 6 || pax_mm == 8 || pax_mm == 9 || pax_mm ==11 )
                {
                    if(pax_dd > 30 || pax_dd < 1){
                        System.out.println("The specific date is not specified correctly, please enter within the max specified by the month.");
                        System.out.println();
                        continue;
                    }
                }
                
                else{
                    a=false;
                }
                
            System.out.println("Do you want to re-enter any of the details[Enter 'Y' to re-enter the dates] ?");
            char ch2 = bookin.next().charAt(0);
            if(ch2 == 'Y'){
                booking_ph2();      //Using recursion to reprogram itself from the begining.
            }
            else{
                a=false;
                break;
            }

            }catch(Exception e){
                bookin.next();
                System.out.println("Please enter the correct digits.");
            }
            break;
        }     
 }




 protected void booking_ph3(){
    while(true){
        System.out.println("Enter the number of passengers :");
        num_pax = bookin.nextInt();
           
        System.out.println("(Optional)Are there any children in the passengers?");
        num_pax_chl=bookin.nextInt();
        if (num_pax>0 && num_pax < pl_lim) {
            break;
        }

        else{
            if(num_pax > pl_lim)
            {
                System.out.println("Mass Booking is currently only serviceable using the Customer Care.");
            }

            else{
                System.out.println("Please enter the correct amount on passengers.");
            }
        } 
    }
 }

 protected void booking_ph4(){

    System.out.println("Enter the names of the passengers :");
    for(int k=0 ;k<num_pax; k++){
        System.out.println("Passenger ["+(k+1)+"] :");
        pax_name[k] = bookin.next();  //Used to read the passengers names.

    }



    System.out.println(FS+"ENSURE the details given below are correct!:");
    System.out.println(FSR);

                    System.out.println(" __________________________________________________");
					System.out.println("|                   ~ASTRO~           \t         |");
					System.out.println("|                                              \t   |");
                    System.out.println("|   Dest  : "+pax_dest+"         Dept : "+pax_dept+" \t\t   |");
					System.out.println("|                                              \t  |");
					System.out.println("|                                              \t  |");
					System.out.println("|                                              \t  |");
					System.out.println("|     ON:"+pax_dd+"/"+pax_mm+"/"+pax_yy+" \t\t                  |");
					System.out.println("|                                              \t  |");
					System.out.println("|_________________________________________________|");

    if(num_pax_chl>0){
        System.out.println("Additional info:"+num_pax_chl);
    }
    System.out.print(RED);
    System.out.println(FS+" WARNING !");
    System.out.print(FSR);
    boolean b = true;

    while(b == true){
        System.out.println("Are you absolutely sure the information provided by you are correct?[Enter 'Yes' to continue.]");
        String te = bookin.next();
        if(te.equals("Yes") ){
            b = false;
            System.out.println("Booking Tickets!");
            System.out.println();
            System.out.println();
            s_t_A_r_S.stars();
            s_t_A_r_S.special2();
            System.out.println("Thank you for using ASTRO booking systems. Have a great day ahead~");
            bookin.next();
            booking_passer();
            return;
        }
        else{
            System.out.println("Do you want to change any of the details? {Enter 'No/Nope' to continue onwards. OR 'Yes' to go back to the start}");
            te = bookin.next();
            if(te.equals("Yes")){
                System.out.println("Redirecting to start....");
                System.out.println();
                try {
                    Thread.sleep(555);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return;
            }
            else{
                System.out.println("Booking Tickets!");

                booking_passer();
                return;
            }
        }
    } 
  }


  void booking_passer(){
   fl_ag.call(pax_dest,pax_dept,pax_name,num_pax_chl,num_pax,pax_dd,pax_mm,pax_yy);
 }
}