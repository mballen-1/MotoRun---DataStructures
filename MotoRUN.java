
import java.io.*;
import java.util.*;

class MotoRUN{
	// fields
	
	public void leerArchivo() {
		
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	 
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C://Users/dell/unal.dat");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         String linea1,linea2,linea3;
	         
	            System.out.println();

	         	linea1=br.readLine();
	            list_u.load(linea1);
	            
	            System.out.println("Loading usuarios ...(100%)	"+ list_u.size +" usuarios cargados");
	            
	            linea2=br.readLine();
	            list_e.load(linea2);
	            
	            System.out.println("Loading Estaciones ...(100%)	"+ list_e.size +" estaciones cargadas");
	            
	            linea3=br.readLine();
	            list_m.load(linea3);
	            
	            System.out.println("Loading Motos ...(100%)		"+ list_m.size +" motos cargadas");

	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
	
	
	public static B<Integer, User> list_u = new B<Integer, User>();
	public static B<Integer, MotorBike> list_m = new B<Integer, MotorBike>();
	public static B<Integer, Station> list_e = new B<Integer, Station>();
	public static SortedChain<Integer, record> log = new SortedChain<Integer, record>();
	
	int recordCounter=0;
	//Scanner que se usa todo el tiempo

	public static Scanner lec = new Scanner(System.in);
	public static Station cS = new Station();
	
	

	public static void main(String[ ] args){
      
		if( args.length != 1 ){
         System.out.println( "Syntax B [filename]" );
         return;
		 }
      
      MotoRUN x = new MotoRUN();
      
    list_e.put(1, new Station(1,"Calle 45",66));
    list_e.put(2, new Station(2,"Calle 26",78));
    list_e.put(3, new Station(3,"Edificio CYT",78));
    list_e.put(4, new Station(4,"Uriel Gutierrez",78));
    list_e.put(5,new Station(5,"CAN",78));
    list_e.put(6, new Station(6,"Agronomia",78));
    list_e.put(7, new Station(7,"En Transito",78)); //En Transito
    list_e.put(8,new Station(8,"Taller De Motos",78)); // Taller De Motos
  	      
      x.leerArchivo();
      menuEntrada();
      x.menuPrincipal();     
	}
	
	
	
	public static void menuEntrada( ){ //REVISAR
	
	  System.out.println();	
	  System.out.println("Bienvenido al sistema MotoRUN, MotoRUN rocks!");
	  System.out.println("==================================================");
	  System.out.println("Ingrese la estacion sobre la cual desea trabajar :");
	  System.out.println("==================================================");
	  System.out.println("C45 Calle 45");
      System.out.println("C26 Calle 26	");
      System.out.println("CYT Ciencia y Tecnologia");
      System.out.println("Uri Uriel Gutierrez");
      System.out.println("CAN Salida CAN");
      System.out.println("AGR Agronomia");
      System.out.println("ET En Transito");
      System.out.println(" TM Taller de Motos");
	  System.out.println();
	  System.out.print( "Digite su opcion: " );
	  
	  String cmd = lec.nextLine();  
	  
	  switch(cmd){
	  
	  case "C45":		  
		 cS = list_e.get(1);
		 
		 System.out.println("Se ha seleccionado la estación C45");
		 System.out.println("------------------------------------------");
		 System.out.println("Estación C45 (Calle 45)");
		 System.out.println("Ubicación : Entrada por la calle 45");
		 System.out.println("Capacidad : 40 motos");
		 System.out.println("Motos disponibles :__");
		 System.out.println("------------------------------------------");
		 System.out.println("Presione Enter para continuar ...");
		 lec.nextLine();
		 	 
		  break;
		  
	  case "C26":		  
			 cS = list_e.get(2);
			 
			 System.out.println("Se ha seleccionado la estación C26");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación C26 (Calle 26)");
			 System.out.println("Ubicación : Entrada por la calle 26");
			 System.out.println("Capacidad : 40 motos");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;
			 
	  case "CYT":		  
			 cS = list_e.get(3);
			 
			 System.out.println("Se ha seleccionado la estación CYT");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación CYT (CYT)");
			 System.out.println("Ubicación : Ciencia y Tecnologia");
			 System.out.println("Capacidad : 40 motos");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;
			  
			  
	  case "Uri":		  
			 cS = list_e.get(4);
			 
			 System.out.println("Se ha seleccionado la estación Uri");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación Uri (Uriel)");
			 System.out.println("Ubicación : Entrada por la calle 51");
			 System.out.println("Capacidad : 40 motos");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;
			  
			  
	  case "CAN":		  
			 cS = list_e.get(5);
			 
			 System.out.println("Se ha seleccionado la estación CAN");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación CAN (CAN)");
			 System.out.println("Ubicación :Estacion CAN");
			 System.out.println("Capacidad : 40 motos");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;
			  
	  case "AGR":		  
			 cS = list_e.get(6);
			 
			 System.out.println("Se ha seleccionado la estación AGR");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación AGR (AGR)");
			 System.out.println("Ubicación : AGR ");
			 System.out.println("Capacidad : 40 motos");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;
			  
	  case "ET":		  
			 cS = list_e.get(7);
			 
			 System.out.println("Se ha seleccionado la estación ET");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación ET (ET)");
			 System.out.println("Ubicación : En Transito");
			 System.out.println("Capacidad : 40 motos");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;
			  
	  case "TM":		  
			 cS = list_e.get(8);
			 
			 System.out.println("Se ha seleccionado la estación TM");
			 System.out.println("------------------------------------------");
			 System.out.println("Estación TM (TM)");
			 System.out.println("Ubicación : ...");
			 System.out.println("Capacidad : _");
			 System.out.println("Motos disponibles :__");
			 System.out.println("------------------------------------------");
			 System.out.println("Presione Enter para continuar ...");
			 lec.nextLine();
			 	 
			  break;  
	  }
  	
	}
	
   public void menuPrincipal( ){
	   System.out.println();
	   System.out.println("==============");
      System.out.println ("MENU PRINCIPAL");//REVISAR
      System.out.println("===============");
      System.out.println("[ES] Cambiar estacion por defecto");
      System.out.println("[MA] Mantenimiento de Listas");
      System.out.println("[CA] Cargar");
      System.out.println("[DE] Descargar");
      System.out.println("[CO] Consultas ");
      System.out.println("[S] Salir ");      
        
      System.out.println( );
      System.out.print( "Digite su opcion: " );
  	
	  do{
         String cmd = lec.next( );
         switch( cmd ){
         case "ES" : 
            menuEntrada();
            break;
            
         case "MA" :
        	 mantenimientoListas();
            break;
            
         case "CA" :
        	 
        	 System.out.println("Ingrese id del ususario");
        	 int iD = lec.nextInt();
        	 lec.nextLine();
        	 
        	 System.out.println("Ingrese la estacion de partida");
        	 String sP = lec.nextLine();
        	
        	 System.out.println("Ingrese la estacion de llegada");
        	 String sL = lec.nextLine();
   
        	 System.out.println("Ingrese codigo de la moto");
        	 int mC = lec.nextInt();
        	 lec.nextLine(); 
        	 prestamo(iD, sP, sL, mC);
            
            break;
        
         case "DE" :
        	 

        	 System.out.println("Ingrese codigo de la moto");
        	 int mC1 = lec.nextInt();
        	 lec.nextLine(); 
        	 
        	 System.out.println("Ingrese la estacion de llegada");
        	 String sL1 = lec.nextLine();
        	 
        	 System.out.println("Ingrese el estado de la moto");
        	 String sM1 = lec.nextLine();
   
        	// descarga(mC1, sL1 , sL1, sM1);         	      
            break;
            
         case "CO" :
           this.listarUsuarios();
            break;
         case "S" : list_u.save( "l_users.dat" ); 
         
         System.out.println( "Gracias por usar el sistema, vuelva pronto vecino!" );
         
         System.exit(0);
         return;
         }menuPrincipal();
      } while( true );
   }
	


	public  void mantenimientoUsuarios( ){
		System.out.println();
	   System.out.println("==============================");
      System.out.println("MENU MANTENIMIENTO DE USUARIOS");
      System.out.println("==============================");
      System.out.println("[A] Adicionar");
      System.out.println("[E] Eliminar");
      System.out.println("[M] Modificar");
      System.out.println("[C] Consultar");
      System.out.println("[L] Listar Usuarios");
      System.out.println("[S] Salir del Menu");
      System.out.println("[ ] Ver Menu ");
      System.out.println( );
      System.out.print( "Digite su opcion: " );
   
     do{
         String cmd = lec.nextLine( );
         switch( cmd ){
         case "A" : 
            System.out.print( "Entre cedula:" );
            int ced = lec.nextInt( );
            lec.nextLine( );
            System.out.print( "Entre nombre:" );
            String nom = lec.nextLine( );
            System.out.print( "Entre carrera:" );
            String car = lec.nextLine( );
            list_u.put( ced, new User( nom,ced, car ) );
            break;
         case "E" :
            System.out.print( "Entre cedula:" );
            ced = lec.nextInt( );
            lec.nextLine( );
            System.out.println( "removing ... " + list_u.remove( ced ) );
            break;
         case "M" :
        	 System.out.print( "Entre cedula:" );
             int ced1 = lec.nextInt( );
             lec.nextLine( );
             System.out.print( "Entre nombre:" );
             String nom1 = lec.nextLine( );
             System.out.print( "Entre carrera:" );
             String car1 = lec.nextLine( );
             list_u.put( ced1, new User( nom1,ced1, car1 ) );
             break;
        	 
           case "C" :
            System.out.print( "Entre cedula:" );
            int ced2 = lec.nextInt( );
            lec.nextLine( );
            System.out.println( "consultando ... " + list_u.get( ced2 ) );
            break;
         case "L" :
            this.listarUsuarios();
            break;
         case "S" : 
        	 list_u.save( "l_users.dat" );
        	 menuPrincipal();
        	 break;
         case " ":
        	 mantenimientoUsuarios();
        	 
        	 break;
         }
         mantenimientoUsuarios();
      } while( true );
   }
   
   public  void mantenimientoEstaciones( ){
	   
	   System.out.println();
	   System.out.println("==============================");
      System.out.println("MENU MANTENIMIENTO DE ESTACIONES");
      System.out.println("==============================");
      System.out.println("[A] Adicionar");
      System.out.println("[E] Eliminar");
      System.out.println("[M] Modificar");
      System.out.println("[C] Consultar");
      System.out.println("[L] Listar Estaciones");
      System.out.println("[S] Salir del Menu");
      System.out.println("[ ] Ver Menu ");
      System.out.println();
      System.out.print( "Digite su opcion: " );
      
      
      do{
          String cmd = lec.nextLine( );
         switch( cmd ){
         case "A" : 
            System.out.print( "Por favor entre codigo de la estacion:" );
            int cod = lec.nextInt( );
            lec.nextLine( );
            System.out.print( "Entre nombre:" );
            String nom = lec.nextLine( );
            System.out.print( "Entre capacidad:" );
            int cap = lec.nextInt( );
            list_e.put( cod, new Station( cod,nom, cap ) );

            break;
         case "E" :
            System.out.print( "Entre el codigo:" );
            int cod1 = lec.nextInt( );
            lec.nextLine( );
            System.out.println( "removing ... " + list_e.remove( cod1 ) );
            break;
         case "M" :
        	 System.out.print( "Entre codigo:" );
             int code = lec.nextInt( );
             lec.nextLine( );
             System.out.print( "Entre Nombre:" );
             String mar1 = lec.nextLine( );
             System.out.print( "Entre Capacidad:" );
             int capac = lec.nextInt( );
             list_e.put( code, new Station( code,mar1,capac ) );
             break;
         case "C" :
            System.out.print( "Entre el codigo:" );
            cod = lec.nextInt( );
            lec.nextLine( );
            System.out.println( "consultando ... " + list_e.get( cod ) );
            break;
         case "L" :
            this.listarEstaciones();
            break;
         case "S" : 
        	 list_e.save( "l_stat.dat" );
        	 menuPrincipal();
        	 return;
         }mantenimientoEstaciones();
      } while( true );
   }
   
   
   public  void mantenimientoMotos( ){
	   
	   System.out.println();
	   System.out.println("==============================");
      System.out.println("MENU MANTENIMIENTO DE MOTOS");
      System.out.println("==============================");
      System.out.println("[A] Adicionar");
      System.out.println("[E] Eliminar");
      System.out.println("[M] Modificar");
      System.out.println("[C] Consultar");
      System.out.println("[L] Listar Motos");
      System.out.println("[S] Salir del Menu");
      System.out.println("[ ] Ver Menu ");
      System.out.println( );
      System.out.print( "Digite su opcion: " );
           
      int cod;
      
		 do{
         
         String cmd = lec.nextLine( );
         switch( cmd ){
         case "A" : 
            System.out.print( "Ingrese Codigo de la Moto:" );
            cod = lec.nextInt( );
            lec.nextLine( );
            System.out.print( "Entre Ubicacion:" );
            String ubi = lec.nextLine( );
            System.out.print( "Entre Marca:" );
            String mar = lec.nextLine( );
            System.out.print( "Entre Placas:" );
            String pla = lec.nextLine( );
            System.out.print( "Entre el Estado:" );
            String est = lec.nextLine( );
            list_m.put( cod, new MotorBike(cod, ubi,mar, pla,est ) );
            break;
         case "E" :
            System.out.print( "Entre codigo:" );
            cod = lec.nextInt( );
            lec.nextLine( );
            System.out.println( "removing ... "  );
            this.borrarMoto( cod );
            break;
         case "M" :
        	 System.out.print( "Entre codigo:" );
             int cod1 = lec.nextInt( );
             lec.nextLine( );
             System.out.print( "Entre Marca:" );
             String mar1 = lec.nextLine( );
             System.out.print( "Entre Ubicacion:" );
             String ubic = lec.nextLine( );
             System.out.println("Ingrese placa");
             String placa = lec.nextLine();
             System.out.println("Ingrese Estado");
             String estado = lec.nextLine();
             list_m.put( cod1, new MotorBike( cod1,mar1, ubic,placa,estado ) );
             break;
          
         case "C" :
             System.out.print( "Entre el codigo:" );
             cod = lec.nextInt( );
             lec.nextLine( );
             System.out.println( "consultando ... " + list_m.get( cod ) );
             break;
         case "L" :
            listarMotos();
            break;
         case "S" : 
        	 list_m.save( "l_motos.dat" );
        	 menuPrincipal();
        	 return;
         }
         mantenimientoMotos();
      } while( true );
   }

	   public  void mantenimientoListas( ){
	  
	  System.out.println();
	  System.out.println("==============================");
      System.out.println("MENU MANTENIMIENTO DE LISTAS");
      System.out.println("==============================");
      System.out.println("[U] Usuarios ");
      System.out.println("[E] Estaciones ");
      System.out.println("[M] Motos");
      System.out.println("[ ] Ver Menu de Mantenimiento");
      System.out.println("[S] Salir del Menu");
      System.out.println( );
      System.out.print( "Por favor, digite su opcion: " );

  do{
         String cmd = lec.nextLine( );
         switch( cmd ){
         case "U" : 
		mantenimientoUsuarios();
            break;
         case "E" :		
		 mantenimientoEstaciones();
         case "M" :
         mantenimientoMotos();
            break;
         case " " :
		 mantenimientoListas();
            break;
         case "S" :
        	 menuPrincipal();
         return;
         }
         mantenimientoListas();
  	} while( true );
   }

	  

	
	
	
	//user methods
	public void crearUsuario(String name, int id, String career){
		list_u.put(id, new User(name, id, career));
		System.out.println("usuario creado exitosamente.");
		}

	public void borrarUsuario(int id){
		User p = new User();
		p=list_u.remove(id);
		if (p!=null) {
			System.out.println("usuario borrado exitosamente.");
		}
		else
			System.out.println("el usuario a borrar no existe.");
	}

	public void modificarUsuario(int id, String name, String career){
		if(list_u.remove(id)!=null){
		list_u.put(id, new User(name,id,career));
		System.out.println("usuario modificado exitosamente.");
		}
		else{
			System.out.println("datos incorrectos, intente de nuevo.");
		}
	}

	public void consultarUsuario(User o){
		System.out.println(o.toString());
	}

	public void listarUsuarios(){
		list_u.ascend();
	}

	//Station methods

	public void crearEstacion(int code, String name, int capacity){
		list_e.put(code, new Station(code, name, capacity));
		System.out.println("estacion creada exitosamente.");
		}

	public void borrarEstacion(int code){
		Station p = new Station();
		p=list_e.remove(code);
		if (p!=null) {
			System.out.println("estacion borrada exitosamente.");
		}
		else
			System.out.println("la estacion a borrar no existe.");
		
	}

	public void modificarEstacion(int code, String name, int capacity){
		if(list_e.remove(code)!=null){
		list_e.put(code, new Station (code, name, capacity));
		System.out.println("estacion modificada exitosamente.");
	}
	else{
		System.out.println("la estacion a modificar no existe, intente nuevamente.");
	}
	}

	public void consultarEstacion(Station o){
		System.out.println(o.toString());
	}

	public void listarEstaciones(){
		list_e.ascend();
	}

	//MotorBike methods

	public void crearMoto(int code, String location, String brand, String plate, String state){
		list_m.put(code, new MotorBike(code, location, brand, plate, state));
		System.out.println("moto agragada exitosamente");
		}

	public void borrarMoto(int code){
		MotorBike p = new MotorBike();
		p=list_m.remove(code);
		if (p!=null) {
			System.out.println("moto borrada exitosamente.");
		}
		else
			System.out.println("la moto a borrar no existe.");
	}

	public void modificarMoto(int code, String location, String brand, String plate, String state){
		if(list_m.remove(code)!=null){
			list_m.put(code, new MotorBike (code, location, brand, plate, state));
			System.out.println("moto modificada exitosamente.");
		}
		else{
			System.out.println("la moto a modificar no existe, intente nuevamente.");
		}
	}

	public void consultarMoto(MotorBike o){
		System.out.println(o.toString());
	}

	public void listarMotos(){
		list_m.ascend();
	}

	//borrow method

	public void prestamo(int id, String start, String finish, int motoCode){
		User p = new User();
		p=list_u.get(id);
		if(p.checkState()==true){
		MotorBike q = new MotorBike();
		q=list_m.get(motoCode);
		String aux=q.getLocation();
		if(p!=null && aux == start){
			recordCounter++;
			log.put(recordCounter, new record(p, start, finish, motoCode));
			q.setState("PR");
			q.setLocation("ET");
		}
		else{
			System.out.println("datos incorrectos, intente de nuevo.");
		}
	}
	else System.out.println("el usuario tiene sancion activa, prestamo no efectuado");
	}

	//download method
	//=================================================================== CAMBIAR DOWNLOAD BORROW

	public void descarga(int motoCode, String end, String state){
		record p= new record();
		int x = 0;//p.getMotoCode();
		int z =0;//= log.size();
		//while(motoCode!=x){
		for (int k = recordCounter;k>0 ;k--) {
			p= log.get(k);
			x= p.getMotoCode();
			if (motoCode==x) {
				z++;
				break;
			}
		}
		if (z==1) {
		User r = new User();
		r = p.getUser();	
		p.setFinishTime();
		p.setTime();
		MotorBike q = new MotorBike();
		q=list_m.get(motoCode);
		q.setState(state);

		if (p.getTime()>15 && p.getTime()<=60) {
			r.timeSanction();
		}
		if (p.getTime()>60) {
			r.timeSanction1();
		}
		if (p.getFinish()!= end) {
			r.wrongStation();
		}
		if (state == "DA") {
			r.damageSanction();
		}
		}
	}
	

	//secondary methods --stay away from here.

	//public void che

	//menu methods
	
}//closing MotoRUN :)

class User implements Serializable, Comparable<User>{
  String name;
  int id;
  String career;
  int loanNumber;
  boolean state;
  Calendar sanctionDate;//==================
  long sanctionDays;//=====================
  int inmunityCounter;//=====================
  int inmunityCounter2;//=======================


  public static final Comparator<User> BY_NAME = new ByName( );
  public static final Comparator<User> BY_ID = new ById( );
  public static final Comparator<User> BY_CAREER = new ByCareer( );
//  public static final Comparator<User> BY_STATE = new ByState( );//esto se quita

//=============================================cambie toda la clase user
  public User(){
    name="N/A";
    id = 0;
    //pass=null;
    state=false;
    loanNumber=0;
    sanctionDate=null;
  }

  public User(String name, int id, String career){
    this.name=name;
    this.id=id;
    this.career=career;
//    pass = "default";
    state=true;
    loanNumber=0;
    inmunityCounter=3;
    inmunityCounter2=5;
    sanctionDays=0;
    sanctionDate=null;
  }

  public String getName( ){
    return name;}

  public int getId( ){
    return id;}

  public String getCareer(){
    return career;}

  // public String getPass(){
  // return pass;}

  public boolean getState(){
    return state;}
  public int getLoanNumber(){
    return loanNumber;}

  public void setName(String name){
    this.name=name;}

  public void setId(int id){
    this.id=id;}

  public void setCareer(String career){
    this.career=career;}

  // public void setPass(String pass){
  //  this.pass=pass;}

  public void setState(boolean state){
    this.state=state;}

  public void setLoanNumber(){
    loanNumber++;}

  public long getSanctionDate(){
    return sanctionDate.getTimeInMillis();}

  public void setSanctionDate(){
Calendar p = Calendar.getInstance();
    //p.getInstance();
    long aux;
    aux = p.getTimeInMillis();
    if ((getSanctionDays()+getSanctionDate())<aux) {
      sanctionDays=0;
      sanctionDate=sanctionDate.getInstance();}
      else{}
}
  public long getSanctionDays(){
    return sanctionDays*86400000;}

  public void setSanctionDays(int days){
    sanctionDays+=days;}

  public void timeSanction(){
    if (inmunityCounter>0) {
      inmunityCounter--;
    }
    else{
      setSanctionDate();
      setSanctionDays(15);
      checkState();
    }
  }

  public void timeSanction1(){
    setSanctionDate();
    setSanctionDays(15);
    checkState();
  }

  public void damageSanction(){
      setSanctionDate();
      setSanctionDays(45);
      checkState();
  }

  public void wrongStation(){
      if (inmunityCounter2>0) {
        inmunityCounter2--;
      }
      else{
        setSanctionDays(30);
        checkState();
      }
    }

  public boolean checkState(){
    Calendar p = Calendar.getInstance();
    //p.getInstance();
    long aux;
    aux = p.getTimeInMillis();
    if ((getSanctionDays()+getSanctionDate())<aux && (getSanctionDays()/86400000)<100) {
      state=true;
      return true;
    }
    else{
      state=false;
    return false;
  }
}



  @Override
  public boolean equals( Object o )
  {
    if( o == null ) return false;
    if( o == this ) return true;
    if( ! ( o instanceof User ) ) return false;
    return this.id == ( ( User ) o ).id;
  }

    //@Override
  public String toString( )
  {
    return "[" + id + ", " + name + ", " + career +  ", " + state + "]";
  }

  //@Override
  public int hashCode( )
  {
    return Objects.hash( id );
  }

  //@Override
  public int compareTo( User o )
  {
    return this.id - o.id;
  }

  private static class ByName implements Comparator<User>{
  public int compare( User a, User b ) {
  return a.getName( ).compareTo( b.getName( ) );
  }
  }

  private static class ById implements Comparator<User>{
  public int compare( User a, User b ) {
  return a.id - b.id;
  }
  }


  private static class ByCareer implements Comparator<User>{
  public int compare( User a, User b ) {
  return a.getCareer( ).compareTo( b.getCareer( ) );
  }
  }

/*  private static class ByState implements Comparator<User>{
  public boolean compare( User a, User b ) {
  return (a.getState().compareTo(b.getState()));
  }
  }
*/
}//closing User class :)





class MotorBike implements Serializable, Comparable<MotorBike>{

	int code;
	String location;
	String brand;
	String plate;
	String state;

	public static final Comparator<MotorBike> BY_CODE = new ByCode( );
	public static final Comparator<MotorBike> BY_BRAND = new ByBrand( );
	public static final Comparator<MotorBike> BY_PLATE = new ByPlate( );
	public static final Comparator<MotorBike> BY_STATE = new ByState( );
	public static final Comparator<MotorBike> BY_LOCATION = new ByLocation( );


public MotorBike(){
	code=0;
	location=null;
	brand=null;
	plate=null;
	state=null;
}

public MotorBike(int code, String location, String brand, String plate, String state){
	this.code=code;
	this.location=location;
	this.brand=brand;
	this.plate=plate;
	this.state=state;
	}

	public void setCode(int code){
		this.code=code;}

	public void setLocation(String location){
		this.location=location;}

	public void setBrand(String brand){
		this.brand=brand;}

	public void setPlate(String plate){
		this.plate=plate;}

	public void setState(String state){
		this.state=state;}

	public int getCode(){
		return code;}

	public String getLocation(){
		return location;}

	public String getBrand(){
		return brand;}

	public String getPlate(){
		return plate;}

	public String getState(){
		return state;}

	@Override
	public boolean equals( Object o ){
	  if( o == null ) return false;
	  if( o == this ) return true;
	  if( ! ( o instanceof MotorBike ) ) return false;
	  return this.code == ( ( MotorBike ) o ).code;
	}

	  @Override
	public String toString( ){
	  return "[" + code + ", " + location + ", " + brand + ", " + plate + ", " + state + "]";
	}

	@Override
	public int hashCode( ){
	  return Objects.hash( code );
	}

	@Override
	public int compareTo( MotorBike o ){
	  return this.code - o.code;}

  	private static class ByLocation implements Comparator<MotorBike>{
	public int compare( MotorBike a, MotorBike b ) {
	return a.getLocation( ).compareTo( b.getLocation( ) );
	}
	}

	private static class ByCode implements Comparator<MotorBike>{
	public int compare( MotorBike a, MotorBike b ) {
	return a.code - b.code;
	}
	}


	private static class ByBrand implements Comparator<MotorBike>{
	public int compare( MotorBike a, MotorBike b ) {
	return a.getBrand( ).compareTo( b.getBrand( ) );
	}
	}

	private static class ByState implements Comparator<MotorBike>{
	public int compare( MotorBike a, MotorBike b ) {
	return a.getState( ).compareTo( b.getState( ) );
	}
	}

	private static class ByPlate implements Comparator<MotorBike>{
	public int compare( MotorBike a, MotorBike b ) {
	return a.getPlate( ).compareTo( b.getPlate( ) );
	}
	}

}//closing class MotorBike

class Station implements Serializable, Comparable<Station>{

int code;
String name;
int capacity;

public Station(){
	code=0;
	name=null;
	capacity=0;
}

public Station(int code, String name, int capacity){
	this.code=code;
	this.name=name;
	this.capacity=capacity;
}

	public static final Comparator<Station> BY_CODE = new ByCode( );
	public static final Comparator<Station> BY_NAME = new ByName( );
	public static final Comparator<Station> BY_CAPACITY = new ByCapacity( );

	public void setCode(int code){
		this.code=code;}

	public void setName(String name){
	this.name=name;}

	public void setCapacity(int capacity){
	this.capacity=capacity;}

	public int getCode(){
		return code;}

	public String getName(){
	return name;}

	public int getCapacity(){
	return capacity;}

	@Override
	public boolean equals( Object o ){
	  if( o == null ) return false;
	  if( o == this ) return true;
	  if( ! ( o instanceof Station ) ) return false;
	  return this.code == ( ( Station ) o ).code;
	}

	  @Override
	public String toString( ){
	  return "[" + code + ", " + name + ", "  + capacity + "]";
	}

	@Override
	public int hashCode( ){
	  return Objects.hash( code );
	}

	@Override
	public int compareTo( Station o ){
	  return this.code - o.code;}

  	private static class ByCode implements Comparator<Station>{
	public int compare( Station a, Station b ) {
	return a.code - b.code;
	}
	}


	private static class ByName implements Comparator<Station>{
	public int compare( Station a, Station b ) {
	return a.getName( ).compareTo( b.getName( ) );
	}
	}

	private static class ByCapacity implements Comparator<Station>{
	public int compare( Station a, Station b ) {
	return a.capacity - b.capacity;
	}
	}
}//closing Station class

class record{
User u;
int loanNumber;	
String start;
String finish;
Calendar startTime;
Calendar finishTime;
int motoCode;
long time;


public record(){
	u = null;
	loanNumber=0;
	start=null;
	finish=null;
	startTime=null;
	finishTime=null;
	motoCode=0;
	time=0;
}


public record(User p, String start, String finish, int motoCode){
//	User p = new User();
//	p = list_u.get(id);
	u=p;
	loanNumber=u.loanNumber;
	this.start=start;
	this.finish=finish;
	startTime=Calendar.getInstance();
	this.motoCode=motoCode;
	time=0;
}

public int getMotoCode(){
	return motoCode;}

public void setFinishTime(){
	finishTime=Calendar.getInstance();}

public long getTime(){
	return time;}

public void setTime(){
	time= startTime.getTimeInMillis() - finishTime.getTimeInMillis();
	time/=60;
}

public String getFinish(){
	return finish;}

public User getUser(){
	return u;}
}//closing record class 


class B<K extends Comparable<? super K>, E>{
	   // fields
	   Bn<K,E> r;
	   int size;

	   // constructor
	   B( ){
	      r = null;
	      size = 0;
	   }

	   // methods
	   public E get( K key ){
	      Bn<K,E> p = r;
	      while( p != null )
	         if( key.compareTo( p.k ) < 0 )
	            p = p.lc;
	         else if( key.compareTo( p.k ) > 0 )
	            p = p.rc;
	         else
	            return p.e;
	      return null;
	   }

	   public E put( K key, E ele ){
	      Bn<K,E> p = r, pp = null;
	      while( p != null ){
	         pp = p;
	         if( key.compareTo( p.k ) < 0 )
	            p = p.lc;
	         else if( key.compareTo( p.k ) > 0 )
	            p = p.rc;
	         else
	         {
	            E old = p.e;
	            p.e = ele;
	            return old;
	         }
	      }

	      size++;

	      Bn<K,E> x = new Bn<>( key, ele );

	      if( r == null )
	         r = x;
	      else{
	         if( key.compareTo( pp.k ) < 0 )
	            pp.lc = x;
	         else
	            pp.rc = x;
	      }
	      
	      return null;
	   }

	   public E remove( K key ){
	      Bn<K,E> p = r, pp = null;
	      while( p != null && ! p.k.equals( key) ){
	         pp = p;
	         if( key.compareTo( p.k ) < 0 )
	            p = p.lc;
	         else 
	            p = p.rc;
	      }
	      
	      if( p == null ) return null;

	      size--;

	      E old = p.e;
	      
	      if( p.lc != null && p.rc != null ){
	         Bn<K,E> s = p.lc, ps = p;
	         while( s.rc != null ){
	            ps = s;
	            s = s.rc;
	         }
	         p.e = s.e;
	         p.k = s.k;
	         p = s;
	         pp = ps;
	      }
	      
	      Bn<K,E> c;
	      if( p.lc == null ) c = p.rc;
	      else c = p.lc;

	      if( pp == null ) // if( p == r )
	         r = c;
	      else
	      {
	         if( p == pp.lc )
	            pp.lc = c;
	         else
	            pp.rc = c;
	      }
	      
	      return old;
	   }

	   public static <K extends Comparable<? super K>,E> void in( Bn<K,E> t ){
	      if( t != null ){
	         in( t.lc );
	         System.out.println( t );
	         in( t.rc );
	      }
	   }

	   public void ascend( ){
	      in( r );
	   }

	   public static void m( ){
	      System.out.println("MENU MANTENIMIENTO DE USUARIOS");
	      System.out.println("==============================");
	      System.out.println("[A] Adicionar");
	      System.out.println("[E] Eliminar");
	      System.out.println("[M] Modificar");
	      System.out.println("[C] Consultar");
	      System.out.println("[L] Listar Usuarios");
	      System.out.println("[S] Salir del Menu");
	      System.out.println( );
	      System.out.print( "Digite su opcion: " );
	   }

	   public static <K extends Comparable<? super K>,E> void sa( Bn<K,E> t, ObjectOutputStream o ) throws IOException {
	      if( t!= null ){
	         sa( t.lc, o );
	         o.writeObject( t );
	         sa( t.rc, o );
	      }
	   }

	   @SuppressWarnings( "unchecked" )
	   public void load( String fn ){
	      try{
	         ObjectInputStream is = 
	            new ObjectInputStream( new FileInputStream( fn ) );
	         int n = is.readInt( );
	         for( int i = 0; i < n; i++ ){
	            Bn<K,E> temp = (Bn<K,E>) is.readObject( );
	            put( temp.k, temp.e );
	         }
	      }
	      catch( IOException | ClassNotFoundException e ){
	         System.out.println( e );
	      }
	   }

	   public void save( String fn ){
	      try{
	         ObjectOutputStream os = 
	            new ObjectOutputStream( new FileOutputStream( fn ) );
	         os.writeInt( size );
	         sa( r, os );
	      }
	      catch( IOException e ){
	         System.out.println( e );
	      }
	   }
		
}

class Bn<K extends Comparable<? super K>,E> implements Serializable {
	   // fields
	   K k;
	   E e;
	   Bn<K,E> lc,rc;

	   // constructors
	   Bn( ){
	      this( null, null, null, null );
	   }

	   Bn( K key, E ele ){
	      this( key, ele, null, null );
	   }

	   Bn( K key, E ele, Bn<K,E> lc, Bn<K,E> rc ){
	      k = key;
	      e = ele;
	      this.lc = lc;
	      this.rc = rc;
	   }

	   // methods
	   @Override
	   public String toString( ){
	      return "[ key=" + k + ", element=" + e + "]";
	   }
	}

