public class WordPattern{
	public static void main(){
		
	}

	public static boolean(String pattern, String str){
		Map<Character, String> mapping = new HashMap<>();
		Map<Character, String> reverse_maping = new HashMap<>();
		String[] words = str.split(" ");
		if(pattern.length() != words.length){
			return false;
		}

		for(int i = 0; i < pattern.length(); i++){
			char a = pattern.charAt(i);
			String b = words[i];
			if(!mapping.containsKey(a)){
				map.put(a, b);
			}else if(!mapping.get(a).equals(b)){
				return false;
			}

			if(!reverse_mapping.containsKey(b)){
				reverse_mapping.put(b, a);
			}else if(reverse_mapping.get(b) != a){
				return false;
			}
		}
		return true;
	}
}
