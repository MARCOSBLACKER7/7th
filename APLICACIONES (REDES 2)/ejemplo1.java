try{
    MulticastSocket s= new MulticastSocket();
    s.setReuseAdress(true);
    s.setTimeToLive(255);
    InetAdress gpo=null;
    String dir = "230.1.1.1";
    try{
        gpo= InetAdress.getByName(dir);
        catch(UnknownHostException a){
            System.out.println("la dir no es valida");
            System.exit(); 
        }
        s.joinGroup(gpo);
    }


}