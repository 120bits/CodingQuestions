    static String checkMagazine(String[] magazine, String[] note) {
        
        HashMap<String, Integer> magz_map = new HashMap<String, Integer>();
        boolean answer = true;
        
        for (int i = 0; i < magazine.length; i++)  {
            Integer n = magz_map.get(magazine[i]);
            n = ( n == null) ? 1 : ++n;
            magz_map.put(magazine[i], n);
        }
        
        for (int i = 0; i < note.length; i++) {
            Integer count = magz_map.get(note[i]);
            if (count == null || magz_map.get(note[i]) == 0){
                answer = false;
                break;
            } else {
                magz_map.put(note[i], count - 1);
            }
        }
        return (answer) ? "Yes" : "No";
  }
