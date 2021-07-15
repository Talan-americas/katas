from pickle import FALSE


# A palindrome is a string that reads the same from left to right as it does from right to left.
# Two words are anagrams of one another if their letters can be rearranged to form the other word.
# Given a list of Strings, return a list of booleans for each string, with the values :
# - True if the String is an anagram of a palindrome
# - False if it is not the case 


def check_single_string(input_string: str):
    
    char_counter = dict()
    for c in input_string:
        if c in char_counter:
            char_counter[c] += 1
        else:
            char_counter[c] = 1

    nb_odd_letters = 0
    for value in char_counter.values():
        if value % 2 == 1:
            nb_odd_letters += 1
        
        if nb_odd_letters >= 2:
            return False
    
    return True

def anagram_of_palindrome(list_of_strings: list):
    # Write your code here
    return [check_single_string(c) for c in list_of_strings]


if __name__ == "__main__":
    results = anagram_of_palindrome(["aaabbaa", "ccddeeeee", "test", "testtest"])
    print(results)
