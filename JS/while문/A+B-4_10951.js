// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const sample=`1 1
2 3
3 4
9 8
5 2
0 0
`
let input = sample.split("\n");


let i= Number(0)
let sum = ""


while(input[i] != ""){
    let num = input[i].split(" ")
    sum += Number(num[0])+Number(num[1]) + "\n"
    i++;
}


console.log(sum )





