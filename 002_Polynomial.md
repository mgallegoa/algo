# Polynomial to find the Big O complexity


1 public void polynomial (int n){
2     for (int i=0; i <= n; i++){
3         for (int j=0; j <= n; j++){
4             s.o.p("i=" + i + ", j="+j)
6         }
7         s.o.p("End of inner loop j")
8     }
8     s.o.p("End of outer loop i")
9 }

| Line no. | operations                  |  Unit time    |
|----------|-----------------------------|---------------|
|    2     | 1 + 3n + 3 + 3n             |  6n + 4       |
|    3     | n(1 + 3n + 3 + 3n)          |  6n2 + 4n     |
|    4     | n2 * (1 + 1 + 1)            |     3n2       |
|    6     |       n(1)                  |      n        |
|    8     |          1                  |      1        |
|--------------------------------------------------------|
