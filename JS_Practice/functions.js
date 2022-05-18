//Named Functions
function first(){
    console.log("This is Named function");
}
first();

function second(a,b){
    return a*b;
}
var res=second(10,20);
console.log(res);

//Function Expression(Anonymous) 
var greet=function(name){
    console.log("Good morning" ,name);
    return "bye";
}
var result=greet("Pavi");
console.log(result);

var calAdd=function(x,y){
    var z=x+y;
    return z;
}
console.log(calAdd(10,9));

//Function Expression(Named)
var calMul=function mul(m,n){
    var op=m*n;
    return op;
}
console.log(calMul(2,8));

//IIFE(Immediately Invoked Function Expression)
//Functions that are executed as soon as they are mounted, 
//these functions are known as IIFEs.
(function(){
    console.log("Inside IIFE")
})();

(function (age){
    console.log(age);

})(12);


//Arrow Function(ES6 Features)
var result=input=>{
    console.log(input);
    console.log("This is a simple Arrow Function");
    
}
result("Arrow ()");
