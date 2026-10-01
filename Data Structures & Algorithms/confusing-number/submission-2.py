class Solution:
    def confusingNumber(self, n: int) -> bool:
        invalid = set([2, 3, 4, 5, 7])
        rotateDict = {0:0, 1:1, 6:9, 8:8, 9:6}

        digits = [int(c) for c in str(n)]
        strBuilder = ""
        for num in digits:
            if num in invalid:
                return False
            elif num in rotateDict.keys():
                strBuilder = str(rotateDict[num]) + strBuilder
            else:
                strBuilder = str(num) + strBuilder
        if int(strBuilder) == n:
            return False
        else:
            return True


        