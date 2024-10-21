stack = []

#push()
stack.append("cakes")
stack.append("doughnuts")
stack.append("croissants")
print("Pastries: " , stack)

#pop()
last = stack.pop()
print("Pop: " , last)

#peek()
print("Peek: " , stack[-1])

#isEmpty()
isEmpty = not bool(stack)
print("isEmpty: " , isEmpty)

#size()
print("Size: " , len(stack))

