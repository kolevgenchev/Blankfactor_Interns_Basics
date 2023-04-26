function fizzBuzz (num){
    let finalArr=[]
    for(let i=1; i<=num; i++){
        if(i % 3===0 && i % 5===0){
            finalArr.push('FizzBuzz')
            continue;
        }
        if(i % 3===0){
            finalArr.push('Fizz')
            continue;
        }
        if(i % 5===0){
            finalArr.push('Buzz')
            continue;
        }
        finalArr.push(i.toString())
    }
    return finalArr;
}

console.log(fizzBuzz(3))