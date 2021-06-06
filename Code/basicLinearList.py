# 함수 선언 부분
def add_data(value):
    # basicList에 None(빈) 공간 추가
    basicList.append(None)
    basicLen = len(basicList)
    basicList[basicLen-1] = value

def insert_data(position, value):
    if position < 0 or position > len(basicList):
        print("범위를 벗어났습니다.")
        return

    basicList.append(None)
    basicLen = len(basicList)

    for i in range(basicLen-1, position, -1):
        basicList[i] = basicList[i-1]
        basicList[i-1] = None

    basicList[position] = value

def delete_data(position):
    if position < 0 or position > len(basicList):
        print("범위를 벗어났습니다.")
        return

    basicLen = len(basicList)

    for i in range(position+1, basicLen):
        basicList[i-1] = basicList[i]
        basicList[i] = None

    del(basicList[basicLen-1])

# 전역 변수 선언 부분
basicList=[]
select = -1 # 1: 추가, 2: 삽입, 3: 삭제, 4: 종료

# 메인 코드 부분
if __name__=="__main__":

    while (select != 4) :

        select = int(input("선택하세요(1: 추가, 2: 삽입, 3: 삭제, 4: 종료)--> "))

        if (select == 1):
            data = input("추가할 데이터--> ")
            add_data(data)
            print(basicList)
        elif (select == 2):
            pos = int(input("삽입할 위치--> "))
            data = input("추가할 데이터--> ")
            insert_data(pos, data)
            print(basicList)
        elif (select == 3):
            pos = int(input("삭제할 위치--> "))
            delete_data(pos)
            print(basicList)
        elif (select == 4):
            print(basicList)
            exit()
        else :
            print("1~4 중 하나를 입력하세요.")
            continue