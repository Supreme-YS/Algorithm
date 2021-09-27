katok = ["A", "B", "C", "D", "E"]

def insert_data(position, value):

    if position > len(katok) or position < 0:
        print("wrong range")
        return

    katok.append(None)
    kLen = len(katok)

    for i in range(kLen-1, position, -1):
        katok[i] = katok[i-1]
        katok[i-1] = None

    katok[position] = value
    print(katok)

insert_data(3, "S")