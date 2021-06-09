# Array
# Code02-07

list1 = []
list2 = []
value = 1

for i in range(0, 3):
    for j in range(0, 4):
        list1.append(value)
        value += 1
    list2.append(list1)
    list1 = []

for i in range(0, 3):
    for j in range(0, 4):
        print("%3d" % list2[i][j], end = " ")
    print(" ")

# SelfStudy
# 4행 3열짜리 리스트를 생성한 후 12~1을 입력하고 출력해보자. 배열의 모든 숫자 합게도 계산해 보자

list1 = []
list2 = []
value = 12

for i in range(0, 4):
    for j in range(0, 3):
        list1.append(value)
        value -= 1
    list2.append(list1)
    list1 = []

for i in range(0, 4):
    for j in range(0, 3):
        print("%3d" % list2[i][j], end = " ")
    print(" ")

Sum = 0
for i in range(0, 4):
    for j in range(0, 3):
        Sum += list2[i][j]
print("배열의 총 합은 : %d" % Sum)
