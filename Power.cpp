

#include<iostream>
using namespace std;


class Numbers
{
   private:
    int iNo,iPower;

    public:
      void Accept()
      {
          cout<<"enter number\n";
          cin>>this->iNo;

          cout<<"Enter power\n";
          cin>>iPower;
      }

      void Display()
      {
         cout<<"number is:"<<this->iNo<<"\n";
         cout<<"power is:"<<this->iPower<<"\n";

      }

      int Power()
      {
          int iCnt=0;
          int iMult=1;
          for(iCnt=1;iCnt<=iPower;iCnt++)
          {
              
              iMult=iMult*iNo;
          }
          return iMult;
      }


};


int main()
{
    int iRet=0;
    Numbers obj;

    obj.Accept();
    obj.Display();
    iRet=obj.Power();

    cout<<"power is"<<iRet<<"\n";

    return 0;
}