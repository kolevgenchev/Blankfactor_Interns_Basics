function countUnfinishedTasks(tasks, papers) {
  let unfinishedTasks = 0;
  let availablePaper = null;

  for (let i = 0; i < tasks.length; i++) {
    const taskPaper = tasks[i];

    
    if (availablePaper === null || taskPaper === availablePaper) {
      availablePaper = papers[i];
    } 
    
    else {
      unfinishedTasks++;
    }
  }

  return unfinishedTasks;
}
