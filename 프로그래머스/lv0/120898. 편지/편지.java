class Solution {
    public int solution(String message) {
        int answer = 0;
        char[] messageCnt = new char[message.length()];
        for(int i = 0; i < message.length(); i++) {
        	messageCnt[i] = message.charAt(i);
        }
        answer = messageCnt.length * 2;
        return answer;
    }
}