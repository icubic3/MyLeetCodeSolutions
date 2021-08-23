#
# @lc app=leetcode id=7 lang=ruby
#
# [7] Reverse Integer
#
# https://leetcode.com/problems/reverse-integer/description/
#
# algorithms
# Easy (25.23%)
# Total Accepted:    646.6K
# Total Submissions: 2.6M
# Testcase Example:  '123'
#
# Given a 32-bit signed integer, reverse digits of an integer.
# 
# Example 1:
# 
# 
# Input: 123
# Output: 321
# 
# 
# Example 2:
# 
# 
# Input: -123
# Output: -321
# 
# 
# Example 3:
# 
# 
# Input: 120
# Output: 21
# 
# 
# Note:
# Assume we are dealing with an environment which could only store integers
# within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
# of this problem, assume that your function returns 0 when the reversed
# integer overflows.
# 
#
# @param {Integer} x
# @return {Integer}
def reverse(x)
    str = x.to_s
    newNum = str.reverse.to_i

    if x > 0 && newNum < 2**31 - 1
        return newNum
    elsif x < 0 && newNum < 2**31
        return -newNum
    else
        return 0
    end
end

