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

      bool CheckPerfect()
      {
         int iCnt=0;
         int iSum=0;
     
        if(iNo<0)
         {
          iNo=-iNo;
         }

       for(iCnt=iNo/2;((iCnt>=1) && (iSum<=iNo));iCnt--)
         {
           if((iNo%iCnt)==0)
            {
             iSum=iSum+iCnt;
           }
        
        }

        if(iSum==iNo)
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
    bool bRet=false;
    Numbers obj;

    obj.Accept();
    obj.Display();
    
   bRet= obj.CheckPerfect();
   
   if(bRet==true)
   {
       cout<<"Number is perfect\n";
   }
   else
   {
       cout<<"not perfect\n";
   }
    

    return 0;
}