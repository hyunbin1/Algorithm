// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

sample = `150
266
427`

const input = sample.split('\n').map(Number)

let multi = String(input[0]*input[1]*input[2]);


for(let i= 0; i<=9; i++){
    console.log(multi.split(i+"").length -1)
}
