function print() {
    let tasks = [0,1,0,1];
    let paper = [1,1,1,1];
    let counter = 0;
    while(counter <= tasks.length && tasks.length) {
        if(tasks[0] === paper[0]){
            counter = 0;
            tasks.shift();
            paper.shift();
        } else {
            counter++;
            let firstItem = tasks[0];
            tasks.shift()
            tasks.push(firstItem);
        }
    }

    if (counter > tasks.length) {
        console.log(tasks.length)
    } else {
        console.log("SUCCESS")
    }
}

print();