def words = [ "cat", "car", "cat", "tac", "arrow", "caat", "rac", "rain", "ran" ]

def output = []
def aMap = [:]
words.eachWithIndex{ aWord, index->
    // get letters in the word
    def key = aWord.getChars().toList().sort().join()
    if(!aMap.containsKey(key)) aMap << [(key):[]]
    
    words.eachWithIndex{anotherWord, secondIndex ->
    	if(index != secondIndex){
    		def checkword = anotherWord.getChars().toList().sort().join()

    		if(checkword == key){
    			if(!aMap[key].contains(anotherWord)) aMap[key].add(anotherWord)
    			
    		}
    	}
    }
    
}
aMap.eachWithIndex{}