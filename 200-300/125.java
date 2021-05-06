class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length() - 1;

        int i = 0;

        if(length == 0 || length == -1){
            return true;
        }
       
        
        while(i < length){
            
            while(isNumberOrCharacter(s.charAt(i)) == false){
                i++;
                if(i >= length){
                    return true;
                }
            }

            while(isNumberOrCharacter(s.charAt(length)) == false){
                length--;
                if(length<=i){
                    return true;
                }
            }
           
            if(isSameCharater(s.charAt(i),s.charAt(length)) == true){
                if(i == length){
                    return true;
                }
                i++;
                length--;
            }else{
                return false;
            }
        }
        return true;


    }

    public static boolean isSameCharater(char a,char b){
        if((int)a == (int)b - 32 && (int)b >=97 || (int)a == (int)b + 32 && (int)a>=97|| (int)a == (int)b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isNumberOrCharacter(char a){
        //48-57数字
        //65-90 97-122
        if(48<=(int)a && (int)a <=57 || 65<=(int)a && (int)a <=90 || 97<=(int)a && (int)a <=122){
            return true;
        }else {
            return false;
        }
    }
}
