
//A. Write a range of integers in order into an array, usually starting with 1.
def aList = 1..50
//first mistake was I tried to collect instead of collectEntries
def aMap = aList.collectEntries{[(it):true]}
//B. Choose a small prime, usually 2
//C. mark false it's square and all its higher multiples that haven't already been crossed off. 
//(refactor this into a closure)
def multiple = 2
def factor = 2
def product = 0
while(product <= aList.max()){
    product = multiple * factor
    aMap[product] = false
    factor++
}

aMap.each{key,value -> println "key:"+key+" value:"+value}
