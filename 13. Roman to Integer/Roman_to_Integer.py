class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        #Create a translations dictionary with key:value pairs for roman numerals and their respective numerical values
        translations = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        #Create the variable number to keep a running total of the roman integers and their numerical values
        number = 0
        #Replace the roman numerals "IV", "IX", "XL", "XC", "CD", and "CM" so that we can apply the translations dictionary to string s easily
        s = s.replace("IV", "IIII").replace("IX", "VIIII")
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX")
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
        #Iterate through each character in string s
        for char in s:
            #Add to the running total the numerical value for the key "char"
            number += translations[char]
        #Return the running total
        return number