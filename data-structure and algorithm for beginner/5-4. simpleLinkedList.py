# 노드 선언부
class Node():
    def __init__(self):
        self.data = None
        self.link = None

# 노드 출력부
def printNodes(start):
    current = start
    if current == None:
        return
    print(current.data, end=' ')
    while current.link != None:
        current = current.link
        print(current.data, end=' ')
    print()

# 노드 데이터 선언부
memory = []
head, current, pre = None, None, None
dataArray = ["A", "B", "C", "D", "E"]

# 실행부
if __name__ == "__main__":

    node = Node()
    node.data = dataArray[0]
    head = node
    memory.append(node)

    for data in dataArray[1:]:
        pre = node
        node = Node()
        node.data = data
        pre.link = node
        memory.append(node)

    printNodes(head)