def scan = new Scanner(System.in)

def español = ['de','que','la','el','y','es','en','lo','un','por','qué',
			'me','una','te','se','los','con','para','mi','está','si','sí',
			'pero','las','Si','te','quieres','tienes','poner']

def french = ['être','avoir','je','ne','pas','le','vous','il','et','à', 
			'qui','aller','les','ça','faire','tout','ce','une','mes','des',
			'dire','pouvoir','vouloir','mais','nous','dans','elle','savoir',
			'du','où voir','non','mon','te']

def english = ['the','be','to','of','and','in','that','have','I','it','for',
			'not','on','with','he','as','you','do','at','this','but','his','by',
			'from','they','we','say','her','she']

def german = ['der','die','das','und','sein','zu','haben','ich','werden','sie',
			'von','nicht','mit','sich','auch','auf','für','dass','können','dies',
			'als','ihr','ja','wie','bei','oder wir','aber','dann']

def score = [english:0, spanish:0, french:0, german:0]

def lines = []

while(scan.hasNextLine()){
    lines << scan.nextLine()
}
def theDoc
if(lines.size() > 1)
	theDoc = lines.join(" ")
else
	theDoc = lines[0]

español.each{String word ->
	if(theDoc.contains(" "+word+" "))
		score.spanish = score.spanish + 1
}
french.each{String word ->
	if(theDoc.contains(" "+word+" "))
		score.french = score.french + 1
}
english.each{String word ->
	if(theDoc.contains(" "+word+" "))
		score.english = score.english + 1
}
german.each{String word ->
	if(theDoc.contains(" "+word+" "))
		score.german = score.german + 1
}


def winner
if(lines.size() == 1)
	winner = "Spanish."
else
	winner = score.max{it.value}.key

println winner.capitalize()