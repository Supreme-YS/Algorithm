class Node():
    def __init__(self):
        self.data = None
        self.link = None

node1 = Node()  # 노드 객체 생성
node1.data = "다현" # 객체에 다현 삽입

print(node1.data, end=' ')

node2 = Node()
node2.data = "정연"
node1.link = node2 # 첫 번째 노드의 링크에 두 번째 노드를 넣어 연결!

