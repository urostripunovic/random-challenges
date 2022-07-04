//Part 1 Nick White
/**
 * Find the sum of this array
 */
const ar = [5, 3, 2, 1, 7];
let sum = 0;
for (let i = 0; i < ar.length; i++) {
   sum += ar[i];
}
console.log('Sum: ' + sum);


/**
 * Linear Search, return -1 if the num doesn't exist.
 */
let arr = [2, 5, 8, 7, 13, 17];
let num = 13;

function linearSearch(arr, num) {
    let ans = 0;
    for (let i = 0; i < arr.length; i++) {
        if (num === arr[i]) {
            break;
        }
        ans++;
    }
    return ans > arr.length - 1 ? -1 : ans;
}
console.log('Linear search: ' + linearSearch(arr,num));


/**
 * print “Fizz” if an integer is divisible by 3, “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5
 */
let N = 504;
function FizzBuzz(N) {
    //summan av N skall vara delbar med 3 eller om summan slutar med 0 eller 5
    if (N % 3 === 0 && N % 5 === 0) {
        console.log(N, 'FizzBuzz')
    } else if (N % 3 === 0) {
        console.log(N, 'Fizz');
    } else if (N % 5 === 0) {
        console.log(N, 'Buzz')
    } else {
        console.log(N);
    }

}
FizzBuzz(N);


//Part 2 Kenny Gunderman
/**
 * Reverse the string for example cat => tac
 */
let str = 'cat';
function reverse(str) {
    let res = ''
    for (let i = str.length; i > 0; i--) {
        res += str.substring(i - 1,i);
    }
    return res;
}
console.log(reverse(str));

/**
 * Sum 2D array
 */
let items = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15]
];
function sum2DArray(items) {
    let sum = 0;
    for (let i = 0; i < items.length; i++) {
        for (let j = 0; j < items[i].length; j++) {
            sum += items[i][j];
        }
    }
    return sum;
}
console.log(sum2DArray(items))

/**
 * The two-sum problem is a question that asks that if given an array of integers (numbers), like [1, 2, 6, 8, 3], and a target sum number, such as 5, 
 * return an array of elements that add up to that target sum number. If no two numbers in the array add up to the target number, 
 * then we need to return an empty array; []. This is a double for loop problem the question online didn't communicate that well, the video gave a hint about it
 */
let twoSum = [1, 3, 5, 6, 11, 23]
let target = 9;
function twoSumProblem(arr, target) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = i+1; j < arr.length; j++) {
            if (arr[i] + arr[j] === target) {
                return [arr[i], arr[j]]
            }
        }
    }
    return []
}
console.log(twoSumProblem(twoSum, target))