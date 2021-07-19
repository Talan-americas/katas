from pickle import TRUE


# A numeric string, , is beautiful if it can be split into a sequence of two or more positive integers, a[1], a[2], a[3]....a[n], 
# satisfying the following conditions:
# 1 => a[i] - a[i - 1] = 1 for any 1 < i <= n (each element of the sequence is 1 more than the previous number)
#
# 2 => No a[i] contains a leading 0, for example 10203 could be splitted into {1, 02, 03} but is not a beautiful string since 02 and 03 
# are not valid.
#
# 3 => The contents of the sequence cannot be rearranged. Therefore s = 312 is not a beautiful string.
#
#
# Given a list of strings, for each string return "NO" if it is not a beautiful String and return "YES x" if it is a beautiful string 
# with x  the first number of the sequence.
#
# Examples:
# Input: ["123", "9101112", "1112134"]
# Output: ["YES 1", "YES 9", "NO"]

def check_recursive_string(start_value, number_string):    
    next_number = start_value + 1
    str_next_number = str(next_number)
    
    if not number_string:
        return True
    
    if number_string[:len(str_next_number)] == str_next_number:
        if len(number_string) == len(str_next_number):
            return True
        return check_recursive_string(next_number, number_string[len(str_next_number):])
    
    return False

def check_single_string(in_string: str):
    # Write your code here for a single string
    
    nb_characters = len(in_string)
    for i in range(1, int(nb_characters / 2) + 1):        
        possible_start = int(in_string[:i])
        if check_recursive_string(possible_start, in_string[i:]):
            return "YES " + str(possible_start)
    
    return "NO"

def separate_the_numbers(list_of_strings: list):
    return [check_single_string(s) for s in list_of_strings]
    

if __name__ == "__main__":
    result = separate_the_numbers(["123", "9101112", "1112134", "99100101", "55565758"])
    print(result)
