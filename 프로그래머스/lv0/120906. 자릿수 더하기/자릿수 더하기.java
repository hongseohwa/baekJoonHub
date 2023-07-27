class Solution {
    public int solution(int n) {
        int answer = 0;
        String no = String.valueOf(n);

        for(int i = 0; i < no.length(); i++) {
            answer += Integer.parseInt(String.valueOf(no.charAt(i)));
        }

        return answer;
    }
}