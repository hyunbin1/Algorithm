// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const sample = `5
20 10 35 30 7`
const input = sample.split("\n")

let count = Number(input[0]);
let nums = input[1].split(" ").map(Number);

let max = nums[0];
let min = nums[0];


for(let i=0; i<count; i++){
    if(max < nums[i]){
        max = nums[i]
    }
};

for(let i=0; i<count; i++){
    if(min > nums[i]){
        min = nums[i]
    }
};


console.log(min, max)

