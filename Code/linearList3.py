# 데이터가 삽입되는 함수를 완성해보자
katok = ["A", "B", "C", "D", "E"]

def insert_data(position, value):

    if position > len(katok) or position < 0:
        print("범위를 벗어났습니다.")
        return

    katok.append(None)
    kLen = len(katok)

    for i in range(kLen-1, position, -1):
        katok[i] = katok[i-1]
        katok[i-1] = None

    katok[position] = value

insert_data(5, "A")
print(katok)

# 데이터가 삭제되는 함수를 완성해보자
katok = ["A", "B", "C", "D", "E"]

def delete_data(position):
    if position > len(katok) or position < 0:
        print("범위를 벗어났습니다.")
        return

    katok[position] = None # 삭제하고자 하는 위치의 값 지우기
    kLen = len(katok)

    for i in range(position+1, kLen):
        katok[i-1] = katok[i]
        katok[i] = None

    del(katok[kLen-1])

delete_data(3)
print(katok)
