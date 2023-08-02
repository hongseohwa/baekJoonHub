class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(!('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z' || 'A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z')) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }
}