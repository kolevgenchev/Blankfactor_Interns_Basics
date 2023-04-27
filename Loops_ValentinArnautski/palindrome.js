function palindrome(num) {
    let isPalindrome = false;
    let reversedNumber = num.toString().split('').reverse().join('');
  
    if (num.toString() === reversedNumber) {
      isPalindrome = true;
    }
  
    console.log(isPalindrome);
  }
  
  palindrome(123321);