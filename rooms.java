
public class rooms{

    int []id={1,2,3};
    String []category={" Single "," Double "," Suite  "};
    boolean []available={true,true,true};
    double []price={1500,2500,3500,};

    public void avbrooms() {
    	System.out.println("*******************");
        for (int i=0;i<id.length ;i++ ) {
        	System.out.print(id[i]+" ");
        	System.out.print(category[i]+" ");
        	System.out.print(available[i]+" ");
        	System.out.print(price[i]);
        	System.out.println("");
        }
        System.out.println("*******************");
    }
}
