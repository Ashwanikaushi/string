public static String compression2(String str){
        StringBuilder ans = new StringBuilder();
        
        // String ans = ""+str.charAt(0);
        ans.append(str.charAt(0));
        int idx = 1;
        int count = 1;
        while(idx < str.length()){
            char curr = str.charAt(idx);
            char prev = str.charAt(idx-1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    // ans = ans + count;
                    ans.append(count);
                }
                // ans = ans + curr;
                ans.append(curr);
                count = 1;
            }
            idx++;
        }
        if(count > 1){
            // ans = ans + count;
            ans.append(count);
        }

		return ans.toString();
	}
