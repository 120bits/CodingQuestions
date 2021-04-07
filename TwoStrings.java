//Given two strings, determine if they share a common substring. A substring may be as small as one character.

    public static String twoStrings(String s1, String s2) {
        Set<Character> s1_chars = new HashSet<Character>();
        Set<Character> s2_chars = new HashSet<Character>();
        boolean answer = false;
        for (Character ch: s1.toCharArray()) {
            s1_chars.add(ch);
        }
        for (Character ch: s2.toCharArray()) {
            s2_chars.add(ch);
        }       
        s1_chars.retainAll(s2_chars);
        answer = (s1_chars.isEmpty()) ? false: true;
        return (answer == true) ? "YES" : "NO";
    }

