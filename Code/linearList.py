katok = ["다현", "정연", "쯔위", "사나", "지효"]
print(katok)

# 만약 새로운 데이터를 끝에 삽입한다면?
# 1. 선형 리스트에 빈칸을 추가한다.
# 2. 추가한 빈칸에 새로운 데이터를 삽입한다.
katok.append(None)
print(katok)

katok[5] = "모모"
print(katok)