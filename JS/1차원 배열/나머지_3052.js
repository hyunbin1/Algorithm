// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');


let sample = `1
2
3
4
5
6
7
8
9
10`

const input = sample.trim().split("\n").map(Number);

for(i=0; i<10; i++){
    input[i] = input[i] % 42;
}

let a = new Set(input)
a = [...a].length
console.log(a)


