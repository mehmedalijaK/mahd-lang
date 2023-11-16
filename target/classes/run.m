a :number = 0xf
b :string = "test"
b.len
c :number[] = [1]
d :number[] = []
c.size
matrix :number[][] = {[1,2,3],[2,2]}
matrix1 :number[][] = {[12,2,2]}
matrix2 :number[][] = {[]}
firstDouble :double = +5.0
secondDouble :double = -0.1
arrayDouble :double[] = []
newDouble :double[] = [1.1,1.2,1.3,-55]
matrixDouble :double[][] = {[1.1,1.2],[1.3,-0.2]}
newMatrixDouble :double[][] = {[]}
testMatrixDouble :double[][] = {[1.2,1.3]}

c1 :char = 'b'
c2 :char[] = ['a','b','c']
c3 :char[] = []
c4 :char[] = ['a']
c5 :char[][] = {[]}
c6 :char[][] = {['a','b','c'],['b'],['a']}

s1 :string = "novistring"
s2 :string[] = ["123","123"]
s3 :string[] = ["1"]
s4 :string[] = []
s5 :string[][] = {[]}
s6 :string[][] = {["a"]}
s7 :string[][] = {["a","b"],["aa","bbbb","ccccc"]}

function ( a :number ) {
    return a
}

Class A extends B { }

main {
    input c2
    print c3
    o1 :number = 1 + 3
    o2 :number = 1 - 3
    o3 :number = 1 * 3
    o4 :number = 1 / 3
    o5 :number = 10 % 2
    o6 :number = o4 ++
    o7 :number = o4 --
    o1 == o2
    o1 != o2
    o1 < o2
    o1 > o2
    o1 >= o2
    o1 <= o2

    o1 & o2
    o1 | o2
    o1 >> o2
    o1 << o2
    ~ o1
    o1 ? nesto1 : nesto2

    if ( ( o1 >= o2 && o1 >= o3 ) || ! o1 <= o4 ) { }
    elif ( o1 == o2 ) { }
    else o3 = o1

    for ( i :number = 0 i < 5 i ++ ) { }

    while ( i < 5 ) { }
    do { } while ( i < 5 )

    loadArray c1
    printArray c1
    loadMatrix matrix
    printMatrix matrix

    return c1
}
