def dice_game(k):
    if(k < 0):
        raise Exception

    expectation = 3.5
    for i in range(2, k+1):
        stop_rolls = [j for j in range(1, 7) if j > expectation]
        print(stop_rolls)
        expectation = 1/6. * sum(stop_rolls) + (1-len(stop_rolls)/6.) * expectation

    return expectation

ans = dice_game(-1)
print(ans)