katok = ["A", "B", "C", "D", "E"]

def delete_data(position):

    if position > len(katok) or position < 0:
        print("wrong range")
        return

    katok[position] = None
    kLen = len(katok)

    for i in range(position+1, kLen):
        katok[i-1] = katok[i]
        katok[i] = None

    del(katok[kLen-1])
    print(katok)

delete_data(3)