// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const sample = `3
29
38
12
57
74
40
85
61`

const input = sample.split("\n").map(Number)
let max = input[0]
let num = 0

for(i=0; i<9; i++){
    if(max < input[i]){
        max = input[i]
        num = i
    }
};
console.log(num+1)
console.log(max)


// while(input[i] = ""){
//     if(max < input[i]){
//         max = input[i]
//     }
//     console.log(max)
//     i++;
// }




// let count = Number(input[0]);
// let nums = input[1].split(" ").map(Number);

// let max = nums[0];
// let min = nums[0];

