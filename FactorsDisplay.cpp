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

      void DisplayFact()
      {
          int iCnt=0;
          for(iCnt=1;iCnt<=iNo/2;iCnt++)
          {
              if(iNo%iCnt==0)
              {
                  cout<<iCnt<<"\n";
              }
          }
      }


};


int main()
{
    Numbers obj;

    obj.Accept();
    obj.Display();
    obj.DisplayFact();

    return 0;
}