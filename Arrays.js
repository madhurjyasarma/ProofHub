
/*JS ARRAY METHODS */

// delearing an empty array
const array = [];
// manually adding elements to the array
array[0] = "Github";
array[1] = "REACT";

// printing the array
console.log(array);

// adding elements at the end of the array
array.push("JAVA");
array.push("SpringBoot");
console.log(array);

// reminding elements at the end of the array
array.pop();
console.log(array);

const months = ['Jan', 'March', 'April', 'June'];
months.splice(1, 0, 'Feb');
// inserts at index 1
console.log(months);
// expected output: Array ["Jan", "Feb", "March", "April", "June"]

months.splice(4, 1, 'May');
// replaces 1 element at index 4
console.log(months);
// expected output: Array ["Jan", "Feb", "March", "April", "May"]


