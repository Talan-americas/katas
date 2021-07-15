"""
Created on Jul 12, 2021

@author: Administrateur
"""
import unittest
from main.separate_the_numbers import separate_the_numbers

class Test(unittest.TestCase):


    def test_basic(self):
        result = separate_the_numbers(["123", "9101112", "1112134", "99100101", "55565758"])
        
        self.assertEqual(["YES 1", "YES 9", "NO", "YES 99", "YES 55"], result)


if __name__ == "__main__":
    #import sys;sys.argv = ["", "Test.test_basic"]
    unittest.main()