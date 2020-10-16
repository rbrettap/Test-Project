import java.util.*;

public class Sample1
{
		public static ArrayList<ArrayList<Integer>> find_words(String text, List<String> words) {
			// Write your code here
			ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
			Map<String, List<Integer>> wordMap = new LinkedHashMap<>();

			// add words to HashMap...
			int index = 0;

			for (String word : words) {
				List<Integer> valueList = new ArrayList<>();
				valueList.add(-1);
				wordMap.put(word, valueList);
			}

			String[] wordList = text.split(" ");

			for (String word: wordList) {
				if (wordMap.containsKey(word)) {
					// add index to map...
					List<Integer> valueList = wordMap.get(word);
                    if (valueList.contains(-1)) {
						valueList.clear();;
						valueList.add(index);
					} else {
						valueList.add(index);
					}
				}
				index = index + word.length() +1;
			}
			Iterator<Map.Entry<String, List<Integer>>> iterator = wordMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, List<Integer>> entry = iterator.next();
				resultList.add((ArrayList<Integer>)entry.getValue());
			}

			return resultList;
		}

	public static void main(String [] args)
	{
		String text = "you are very very smart";
		List<String> words = new ArrayList<>();
		words.add("you");
		words.add("are");
		words.add("very");
		words.add("handsome");
		ArrayList<ArrayList<Integer>> result = find_words(text, words);

		System.out.println("finished");
	}
}