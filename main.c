int intvalue = 10+5;
bool isPowerOfTwo(int x)
{
// First x in the below expression is
// for the case when x is 0
return x && (!(x & (x - 1)));
}