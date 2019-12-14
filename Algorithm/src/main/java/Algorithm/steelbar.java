package Algorithm;

import java.util.ArrayList;
import java.util.Stack;

class steelbar {
    public int solution(String arrangement) {
        int answer = 0;
        Stack<Character> s = new Stack<>();
        ArrayList<Integer> razer = new ArrayList<>();
        int count2= 0;
        for(int i =0 ; i<arrangement.length() ; i++ ){
            int count =0;
            s.push(arrangement.charAt(i));

            if(arrangement.charAt(i)=='(' && arrangement.charAt(i+1)==')'){
                razer.add(i);
                razer.add(i+1);
                count ++;
                if(arrangement.charAt(i+2)=='('&&arrangement.charAt(i+3)==')'){
                    count ++;
                    answer += count * (count2-1);
                }else{
                    answer += count * (count2);
                }
                count2 =0;
            }else {
                count2 ++;
            }
            System.out.println(count+","+count2+","+answer);
        }
        return answer+1;
    }

public static void main(String[] args) {
    steelbar s = new steelbar();
    s.solution("()(((()())(())()))(())");
}

}