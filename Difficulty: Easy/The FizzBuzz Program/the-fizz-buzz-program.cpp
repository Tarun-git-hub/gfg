// User function Template for C++


void fizzBuzz(int n) {
    // Write your code here.
    if(n%3==0 && n%5==0)
    cout<<"FizzBuzz"<<endl;
    
    else if(n%3==0)
    cout<<"Fizz"<<endl;
    
    else if(n%5==0)
    cout<<"Buzz"<<endl;
    
    else 
    cout<<n<<endl;
}