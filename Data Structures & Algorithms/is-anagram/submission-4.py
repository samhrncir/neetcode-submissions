class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        ds = {}
        dt = {}
        for ls in s:
            if ls in ds:
                ds[ls] += 1
            else:
                ds[ls] = 1

        for lt in t:
            if lt in dt:
                dt[lt] += 1
            else:
                dt[lt] = 1

        for k in ds:
            if ds.get(k) != dt.get(k):
                return False
            
        return True