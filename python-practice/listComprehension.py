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
print("*-----------------------*")

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
        print("%4d" % list2[i][j], end = " ")
    print(" ")

Sum = 0
for i in range(0, 4):
    for j in range(0, 3):
        Sum += list2[i][j]
print("배열 내 값의 총 합은 : %d" % Sum)

# List Comprehension
# [수식 for 항목 in range() if 조건식]
numList = [num for num in range(1, 6)]
print(numList)
numList = [num*num for num in range(1, 6)]
print(numList)
# 1부터 20까지 숫자 중 3의 배수 리스트
numList = [num for num in range(1, 21) if num % 3 == 0]
print(numList)

# 2차원 리스트 컴프리헨션
# [[수식 for 항목 in range()] for 항목 in range()]

list2 = [[0 for _ in range(4)] for _ in range(3)]
print(list2)