# Sum of Numbers basic algorithm

## Efficient in Time complexity of O(1), using calculation

This is more efficient because is only one calculation and just a constant time execution:
function (integer number){
    return n * (n+1)/2
}

## In Iterative approach, time complexity of O(n), using loop

Using a loop to get the same result for sum the numbers:
function (integer number){
    int sum = 0;
    for (int i=0; i <= number; i++){
        sum = sum + i;
    }
    return sum
}
