# PossibleNumber
This program explores the following scenario :

Suppose there's a number n. The program computes the first number abcd such that : d*n = abcd
The twist is that it can be logically proven that the number abcd does not exist for all values of n.

For instance,
Let the number to be computed be abc...z having k digits, and let the value of n be, say 43.

Then, by the problem,
                abc...z = n x bc...z
                (Let bc...z = X)
                
        Then,
                (a * 10^k) + X = 43X
             or,(a * 10^k) = 42X
             or, a * (2^k)(5^k) = (7 * 3 * 2)X
             
        Comparing both sides, we find that 7 and 3 can't be a part of 10^k. Thus they "have" to 
        be equal to a.
        
        But, a is a single digit number. Hence, abcd can't exist for n = 43.
        
