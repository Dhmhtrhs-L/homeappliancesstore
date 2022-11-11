public class Main {
    public static void main(String[] args)
    {
        homeappliancesstore.callStatic();
        if(homeappliancesstore.company == null ) {
            System.out.println("ERROR");
        }
        else {
            int i = Integer.parseInt(homeappliancesstore.company);
            System.out.println("name: " + i);
        }
        if(homeappliancesstore.address == null ) {
            System.out.println("ERROR");
        }
        else {
            int j=Integer.parseInt(homeappliancesstore.address);
            System.out.println("address: " + j);
        }
        System.out.println("employees: "+homeappliancesstore.employees);
    }
}