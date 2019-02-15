def wave_1(arr, n): #Complexity: nlogn
    arr.sort()
    for i in range(1, n-1,2):
        print(i)
        temp = arr[i]
        arr[i] = arr[i+1]
        arr[i+1] = temp
    return

def wave_2(arr,n): #Complexity: n
    for i in range(1, n-1,2):
        if(i > 0 and arr[i] < arr[i-1]):
            swap(arr,i,i-1)
        if(i < n-1 and arr[i] < arr[i+1]):
            swap(arr,i,i+1)
    return

def swap(arr,a,b):
    temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
    return

test = [5,1,4,3,2]
n = 5
wave_2(test, n)
print(test)
