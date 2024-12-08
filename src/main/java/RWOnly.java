class RWOnly{

    private RWname;

    RWOnly(String name){
         System.out.println(name);
    }
    void setName(String name){
         RWname = this.name;
    }
     String getName(){
          return RWname;
     }
}