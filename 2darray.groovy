//Print the largest (maximum) hourglass sum found 

def scan = new Scanner(System.in)
def grid = []

def highest = -100
while(scan.hasNextLine()){
    grid <<  scan.nextLine().tokenize(" ")*.toInteger()
}

4.times{i->
    4.times{j->
        Integer sample = grid[i][j] + grid[i][j+1] + grid[i][j+2] +
            grid[i+1][j+1] +
            grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
        if(sample > highest) highest = sample
        
    }
}
println highest
