// let input = require('fs').readFileSync('/dev/stdin').toString().split(' ');

let sample = 5;
let input = Number(sample);
let a = "";
let b = "";
let c = "";
let d = "";
let e = "";

// for(let i = 1; i <= input-1; i++){
//     c += a
// }


for(let i = 1; i <= input; i++){

    for(let j= input-i; j>=1; j--){
        a += " "
    }
    for(let k = 1; k <= i; k++){
        a += "*"
        
    } 
    
    a += "\n"
}

console.log(a)






