//template
#include<iostream>

using namespace std;


class Number
{
    private:
      int iNo;   //characterstics

      public:
      bool bflag=false;
       void Accept()  //setter
       {
           cout<<"enter the value\n";
           cin>>this->iNo;
       }

       void Display() // getter
       {
           cout<<"Value is:"<<this->iNo<<endl;
       }
       
       bool Chkeven()
       {
           if(iNo%2==0)
           {
               bflag=true;
               
           }
           return bflag;
       }
      
};

int main()
{
    Number nobj;
    bool bRet=false;

    nobj.Accept();
    nobj.Display();

    bRet=nobj.Chkeven();

    if(bRet==true)
    {
        cout<<"number is even\n";
    }
    else
    {
        cout<<"number is not even\n";
    }

    

    return 0;
}