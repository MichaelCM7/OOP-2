package OOP2_CODING_CHALLENGES.CodingChalllenge_8_Array;

public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"K567","B141","Z222","A785","B145","S344","M786","B982",};

        for(String orderId : orderIds){
            if(orderId.startsWith("B")){
                System.out.println(orderId);
            }
        }
    }
}
