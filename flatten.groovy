import java.util.ArrayList
def flatten

flatten = { list ->
	switch(list){
	    case list.size() == 0:
		    return 
			break
		case {list.head() instanceof Integer && list.size() == 1}:
			result = list
			break
		case {list.head() instanceof Integer && list.size() == 2}:
			result = [list.head()] + flatten(list.tail())
			break
	    case {list.head() instanceof ArrayList && list.size() > 1}:
	    	result = flatten(list.head()) + flatten(list.tail())
			break
		case {list.head() instanceof ArrayList && list.size() == 1}:
		    result = flatten(list.head())
			break
	    case {list.head() instanceof Integer && list.size() > 1}:
	    	result = [list.head()] + flatten(list.tail())
			break
		case {list.head() instanceof Integer && list.size() == 1}:
		    result = [list.head()] 
			break
	}
}.trampoline()

def newList = flatten( [[1], 2, [[3, 4], 5]])
assert newList == [1, 2, 3, 4, 5]
println(newList)


