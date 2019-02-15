def isPalindrome(year):
    if(year < 0):
        return False
    month = (year%10)*10 + (year//10)%10
    day = (year//100)%10*10 + year//1000
    print(month)
    print(day)
    big = [1, 3, 5, 7, 8, 10, 12]
    small = [4, 6, 9, 11]
    if(month < 1 or month > 12):
        return False

    if (month in big):
        if (day > 0 and day < 32):
            return True
    if (month in small):
        if (day > 0 and day < 31):
            return True
    if (month == 2):
        if (day > 0 and day < 28):
            return True
        if(day == 28 and year%4 == 0):
            return True
    return False

h = 2099
ans = isPalindrome(h)
print(ans)
