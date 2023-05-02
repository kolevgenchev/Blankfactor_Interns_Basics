var x = 12321;
var size = x.length;
var isPalindrome = true;
for (var i = 0; i < size / 2; i++){
    if(x[i] !== x[size - 1 - i]){
        isPalindrome = false;
        break;
    }
}
{isPalindrome? console.log('Is a Palindrome'): console.log("Isn't a Palindrome")};