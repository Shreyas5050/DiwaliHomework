//Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0



class SC9 {
    public int numJewelsInStones(String J, String S) {

        //Initialize count
        int count = 0;

        for(int i=0; i< S.length(); i++){
            for(int j=0; j<J.length(); j++){
                if(S.charAt(i) == J.charAt(j)){ //check if there's a match
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
