'''
Created on Jul 12, 2021

@author: Administrateur
'''
import unittest
from main.anagram_of_palindrome import anagram_of_palindrome

class Test(unittest.TestCase):


    def test_basic(self):
        self.assertEqual([False], anagram_of_palindrome(["test"]))


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.test_basic']
    unittest.main()