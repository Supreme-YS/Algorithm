# 데이터가 삽입되는 함수를 완성해보자
katok = ["A", "B", "C", "D", "E"]

def insert_data(position, friend):

    if position < 0 or position > len(katok):
        print("데이터를 삽입할 수 있는 범위를 벗어났습니다.")
        return
    katok.append(None) # 빈칸추가
    kLen = len(katok)  # 배열의 현재 크기

    for i in range(kLen-1, position, -1):
        katok[i] = katok[i-1]
        katok[i-1] = None

    katok[position] = friend # 지정한 위치에 친구 추가

insert_data(2, "ACE")
print(katok)
insert_data(3, "YS")
print(katok)