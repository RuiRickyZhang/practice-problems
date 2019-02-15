def isUgly(num):
    if(num ==1):
        return False
    set = [2, 3, 5]
    for i in set:
        while(num %i == 0):
            num /= i
    return num==1
test = 20
ans = isUgly(test)
print(ans)