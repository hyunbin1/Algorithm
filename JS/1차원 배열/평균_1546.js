// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const sample = `3
40 80 60`

let input = sample.split("\n");
let count = input[0]
// console.log(count)

let numbers = input[1].split(" ").map(Number)
// console.log(numbers)

let max = numbers[0]

// 최댓값 구하기
for(i=0; i<count; i++){
    if(max < numbers[i]){
        max = Number(numbers[i]);
    }
}

// console.log(max);

let newNum=0

for (let j=0; j<count; j++){
    newNum += numbers[j]/max*100/count

}


newNum = newNum.toFixed(2)
console.log(newNum);

