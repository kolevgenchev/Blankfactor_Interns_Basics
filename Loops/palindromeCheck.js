function palindromeCheck (x) {
 
    if(x.toString()===x.toString().split('').reverse().join('')){
        return 'yes'
    }else{
        return 'no'
    }
     
    }
    console.log(palindromeCheck(122))