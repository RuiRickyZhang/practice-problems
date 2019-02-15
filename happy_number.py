def happyNumber(n):
    before = []
    while(n not in before):
        before.append(n)
        remain = 0
        sum = 0
        while(n >0):
            remain = n%10
            sum += remain*remain
            n //= 10   #Remember! in Python, // is the divide return integer!!!!
        print(sum)
        if(sum == 1):
            return True
        else:
            n = sum

    return False

test = 19
ans = happyNumber(test)
print(ans)
