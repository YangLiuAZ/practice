class bag:
	def __init__(self, id):
		self.id = id
		self.data = []
	def put(self, weight):
		self.data.append(weight)
bag_instance = bag(2)
bag_instance.put(12)
print bag_instance.id
print bag_instance.data
