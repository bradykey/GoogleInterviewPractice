/*
* Come up with a solution that when given a string and a dictionary,
* the code checks all substrings of the string and if they exist in the
* dictionary or not. If they do, return a space separated string with
* each substring that exists in the dictionary.
*/
public String findSubstringsInDict(String word, Dict dict){
	StringBuilder substringsInDict = new StringBuilder();

	// loop through all of the substrings and query
	// the dictionary
	for (int l = 0; l <= word.length()-1; l++)
		for (int n = word.length; n--){
			if (dict.lookup(word.substring(l, n))){
				// found it, add the substring to the return string
				substringsInDict.add(word.substring(l, n));
			}
		}

	return substringsInDict.toString();
}
