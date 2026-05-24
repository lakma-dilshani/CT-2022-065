package Q4;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Hashini" , "0702345678");
        Bicycle bicycle1 = new Bicycle(owner1);

        System.out.println("Owner Name:" + bicycle1.getOwner().getOwnerName());
        System.out.println("Phone Number:" + bicycle1.getOwner().getPhoneNo());
    }
}
