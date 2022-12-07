//You are given a list of words and asked to find the longest chain. Two words (or more) form a chain if a single letter can be added anywhere in a word, s, to form a word, t (where s and t are both words within the list of words you’re given). Return the length of the longest chain you can form.
Ex: Given the following words…
words = ["a", "ab", "abc"], return 3 ("a" can be transformed to "ab" by adding a "b" and "ab" can be transformed by adding a "c" giving a chain length of 3).
Ex: Given the following words…
words = ["a", "abc"], return 1 (both "a" or "abc" form their own chains of size one, they cannot be added together).


class SC16 {
    public int longestStrChain(String[] words) {
        List<Set<String>> W = new ArrayList<>(17);
        for (int i = 0; i < 17; i++)
            W.add(new HashSet<>());
        for (String word : words) 
            W.get(word.length()).add(word);
        Map<String, Integer> dp = new HashMap<>();
        int best = 1;
        for (int i = 16; i > 0; i--) {
            if (W.get(i-1).isEmpty()) continue;
            for (String word : W.get(i)) {
                int wVal = dp.getOrDefault(word, 1);
                for (int j = 0; j < word.length(); j++) {
                    String pred = word.substring(0,j) + word.substring(j+1);
                    if (W.get(i-1).contains(pred) && wVal >= dp.getOrDefault(pred,1)) {
                        dp.put(pred, wVal + 1);
                        best = Math.max(best, wVal + 1);
                    }
                }
            }
        }
        return best;
    }
}