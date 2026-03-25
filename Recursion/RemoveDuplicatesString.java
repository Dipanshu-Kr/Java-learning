public class RemoveDuplicatesString {
    public static void removeDup(String str, int i, StringBuilder newStr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(i);
        if (map[curr - 'a']) {
            removeDup(str, i + 1, newStr, map);
        } else {
            map[curr - 'a'] = true;
            removeDup(str, i + 1, newStr.append(curr), map);
        }
    }

    public static void main(String[] args) {
        removeDup("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
