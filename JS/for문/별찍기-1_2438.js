let input = require('fs').readFileSync('/dev/stdin').toString().split(' ');

// let sample = 5;
// let input = Number(sample);
let a = "";
let b = "";
for(let i = 1; i <= input; i++){
    a += "*"
    b += a + "\n"
}

console.log(b)


