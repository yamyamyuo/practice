// using DP
// construct two functions
// G(n): the number of unique BST for a sequence of length n
// F(i, n), 1 <= i <= n: the number of unique BST for root i
// G(n) = F(1,n) + F(2,n) + ... + F(n,n)
// particularly, G(0) = G(1) = 1
// Forthermore, F(i,n) = G(i-1) * G(n-i)
// Combining the two formular: G(n) = G(0) * G(n-1) + G(1) * G(n-2) + … + G(n-1) * G(0)
