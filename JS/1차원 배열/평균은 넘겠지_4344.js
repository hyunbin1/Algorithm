// let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const sample = `5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91`

let input = sample.split("\n")

let linesNumber = input[0]
let sum = 0
let average = 0
let result = 0
let count_number = ""

for(i = 1; i <= linesNumber; i++){
    let people = ""
    sum = 0
    result = 0
    let lines = input[i]
    let line_nums = lines.split(" ").map(Number)
    for(j = 1; j <= line_nums[0]; j++){
        sum += line_nums[j]
        // console.log("합산: ", sum)
    }
    average = sum/line_nums[0] 
    // console.log("평균: ", average)

    for(k = 1; k <= line_nums[0]; k++){
        if(average < line_nums[k]){
            people += line_nums[k] + " "
            
        }
    }
    count_people = people.split(" ").length -1
    // console.log(count_people)
    result = count_people/line_nums[0]*100

    // 비율: 맞은사람/사람들*100

    console.log(result.toFixed(3)+"%")


    
    

}