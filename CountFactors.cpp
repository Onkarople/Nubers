#include<iostream>
using namespace std;


class Numbers
{
   private:
    int iNo;

    public:
      void Accept()
      {
          cout<<"enter number\n";
          cin>>this->iNo;
      }

      void Display()
      {
         cout<<"number is:"<<this->iNo<<"\n";
      }

      int CountFact()
      {
          int iCnt=0;
          int iCount=0;
          int iSum=0;
          for(iCnt=1;iCnt<=iNo/2;iCnt++)
          {
              if(iNo%iCnt==0)
              {
                  iCount++;
              }
          }
          return iCount;
      }


};


int main()
{
    int iRet=0;
    Numbers obj;

    obj.Accept();
    obj.Display();
    iRet=obj.CountFact();

    cout<<"sum is"<<iRet<<"\n";

    return 0;
}