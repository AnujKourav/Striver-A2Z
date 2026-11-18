package DSA.Beginner;
import java.util.*;
public class BasicStrings {
    public void reverseString(List<Character> s) {
        int i=0;
        int j = s.size() - 1;
        System.out.println(s);
        while(i < j){
            char ch = s.get(i);
            s.set(i,s.get(j));
            s.set(j,ch);
            i++;
            j--;
        }
        System.out.print(s);
    }
    public boolean palindromeCheck(String s) {
        int i = 0;
        int j= s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public String largeOddNum(String s) {
        int i = 0;
        int j = s.length()-1;
        while(j >= 0){
            int a = s.charAt(j) - '0';
            if(a % 2 != 0)break;
            j--;
        }
        while(i < s.length()){
            if(s.charAt(i) - '0' != 0)break;
            i++;
        }
        if(i > j)return "";
        return s.substring(i,j+1);
    }
    public String longestCommonPrefix(String[] str) {
        if(str.length == 0)return "";
        if(str.length == 1)return str[0];
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length-1];
        int i = 0;
        while(i<Math.min(str1.length() , str2.length())){
            if(str1.charAt(i) != str2.charAt(i))return str1.substring(0,i);
            i++;
        }
        if(i > 0)return str1;
        return "";
    }
    public boolean isomorphicString(String s, String t) {
        if(s.length() != t.length())return false;
        if(s.equals(t))return true;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i)))map.put(s.charAt(i),t.charAt(i));
            else if(!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)))return false;
            else {
                if(map.get(s.charAt(i)) != t.charAt(i))return false;
            }
        }
        return true;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        if(s.equals(goal))return true;
        s = s + s;
        if(s.contains(goal))return true;
        return false;
    }
    public boolean anagramStrings(String s, String t) {
        if(s.length() != t.length())return false;
        if(s.equals(t))return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))map.put(s.charAt(i),1);
            else map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0)map.remove(ch);
            }
            else return false;
        }
        return map.isEmpty();
    }
    public List<Character> frequencySort(String s) {
        int []freq = new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i) - 'a';
            freq[a]++;
        }
        boolean flag = true;
        List<Character> list = new ArrayList<>();
        while(flag == true){
            int max = 0;
            int index = -1;
            for(int i=0;i<26;i++){
                if(freq[i] > max){
                    max = freq[i];
                    index = i;
                }
            }
            if(index == -1){
                break;
            }
            list.add((char)(index+'a'));
            freq[index] = 0;
        }
        return list;
    }
    public List<Character> frequencySortTreeMap(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i) - 'a';
            freq[a]++;
        }
        TreeMap<Integer, List<Character>> map = new TreeMap<>();
        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                if(!map.containsKey(freq[i])){
                    map.put(freq[i], new ArrayList<>());
                }
                map.get(freq[i]).add((char)(i+'a'));
            }
        }
        ArrayList <Character> ans = new ArrayList<>();
        while(!map.isEmpty()){
            int max = map.lastKey();
            List<Character> list = map.get(max);
            for(char ch : list){
                ans.add(ch);
            }
            map.remove(max);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        System.out.print("Enter the size of list: ");
        int n = sc.nextInt();
        System.out.println("Enter the characters");
        for(int i=0;i<n;i++){
            list.add(sc.next().charAt(0));
        }
        BasicStrings obj = new BasicStrings();
        obj.reverseString(list);
    }
}
