// let input = require('fs').readFileSync('/dev/stdin').toString().split('');

let N= `26`
let input = N.split("");
let A = ""


while(N != N){
    let sum = parseInt(N/10) + (N%10)
    N = String(N%10) + String(sum)
    console.log(N)
}

console.log("출력")
console.log(N)

