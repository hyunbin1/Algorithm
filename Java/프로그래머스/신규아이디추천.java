class Solution {
    public String solution(String answer) {
        // 1 단계
        answer = answer.toLowerCase();
        
        // 2 단계
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        
        // 3 단계
        answer = answer.replaceAll("[.]{2,}", ".");
        
        // 4 단계
        if (answer.length() > 0) {
            if(answer.charAt(0) == '.'){
            answer = answer.substring(1);
            }
        }
        if (answer.length() > 0) {
            if(answer.charAt(answer.length()-1) == '.'){
                answer = answer.substring(0, answer.length()-1);
            }
        }
        
        // 5 단계
        if(answer.isEmpty()) 
            answer = "a";
        // 6 단계
        if(answer.length() >= 16){
            answer=answer.substring(0,15);
        }
        if(answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0,answer.length()-1);
        }
        
        
        // 7 단계
        if(answer.length() <= 2){
            for(int i = answer.length(); i < 3; i++){
                answer += answer.charAt(answer.length()-1);
            }
        }
        
        
        return answer;
    }
}