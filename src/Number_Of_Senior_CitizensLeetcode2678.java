public class Number_Of_Senior_CitizensLeetcode2678 {
    public static void main(String[] args) {
        String[]details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        int ans=countSenior(details);
        System.out.println(ans);
    }

    private static int countSenior(String[] details) {
        int c=0;


                for (String passengerInfo : details) {
                    int ageTens = passengerInfo.charAt(11) - '0';
                    int ageOnes = passengerInfo.charAt(12) - '0';
                    int age = ageTens * 10 + ageOnes;
                    if (age > 60) {
                        c++;
                    }
                }
        return c;
    }
}
