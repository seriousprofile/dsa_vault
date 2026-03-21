Set<Character> set = new HashSet<>();

int left = 0;
int maxLen = 0;

for (int right = 0; right < s.length(); right++) {

    while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
    }

    set.add(s.charAt(right));
    maxLen = Math.max(maxLen, right - left + 1);
}

/*
Trigger:
-> Longest / maximum substring
-> No repeating characters
-> Contiguous
-> Constraint on duplicates

Invariant: Window always valid

Action:
-> Expand right
-> While invalid → shrink left

Time Complexity: O(n)
*/
