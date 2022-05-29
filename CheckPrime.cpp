//template
#include<iostream>

using namespace std;


class Number
{
    private:
      int iNo;   //characterstics

      public:
       void Accept()  //setter
       {
           cout<<"enter the value\n";
           cin>>this->iNo;
       }

       void Display() // getter
       {
           cout<<"Value is:"<<this->iNo<<endl;
       }

      bool CheckPrime()
      {
          int iCnt=0;
    
    for(iCnt=2;iCnt<=iNo/2;iCnt++)
    {
        if(iNo%iCnt==0)
        {
           break;
        }
    }
    
    if(iCnt>iNo/2)   //if(icnt==(ino/2)+1)
    {
        return true;
    }
    else
    {
        return false;
    }

      }
};

int main()
{
    Number nobj;
    bool bRet=false;

    nobj.Accept();
    nobj.Display();

    bRet=nobj.CheckPrime();

    if(bRet==true)
    {
        cout<<"its prime\n";
    }
    else
    {
       cout<<"Not prime\n";
    }

    

    return 0;
}