function main() 
{
	int x;
	x = fib(4);
}

function fact(int n){
	int retVal;
	if(n < 2){
		retVal = 1;
	}
	else{
		retVal = n * fact(n - 1);
	}
}

function fib(int n) {
	int retVal;
	if (n == 0 || n ==1) {
		retVal = 1;
	} else {
		retVal = fib(n-1)+fib(n-2);
	}
}
