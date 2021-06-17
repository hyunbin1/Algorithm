// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const sample = `5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX`

let input = sample.split("\n")
let num_count = input[0]
for(i = 1; i <= num_count; i++){
    let count = 0;
    let sum = 0;
    for(let j = 0; j< input[i].length; j++){
        if(input[i][j] === "O"){
            count++;       
        } else{
            count = 0;
        }
        sum += count;
    }
    console.log(sum)
}

