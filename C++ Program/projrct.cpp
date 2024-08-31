#include <bits/stdc++.h>
#include <string.h>
using namespace std;
class Node
{

public:

string data;
Node* left;
Node* right;
Node (string val)
{

left =NULL;
right =NULL;
data= val;

}

};
class Bst

{

public:

int c=1;



Node * creat(string val,Node* r)

{




if(r==NULL)

{

r=new Node(val);

}
else if(val.size()<r->data.size())

{

r->left=creat(val,r->left);

10

}
else

{
r->right=creat(val,r->right);

}
return r;

}
void display(Node * r)

{
if(r!=NULL)

{
display(r->left);

cout<<c++<<" "<<r->data<<endl;
display(r->right);

}

}
int compareOperation(string s1, string s2)

{

if((s1.compare(s2)) == 0)

return 0;
else
return 1;

}
void fileRead(string wr)

{
string myText;

ifstream MyreadFile("MyFile.txt");
if(MyreadFile.is_open())

{
while(getline(MyreadFile,myText))

{
if(myText.find(wr,0)==0&&wr!="")

{

while(myText.length()!=0)

{

cout<<myText<<endl;
getline(MyreadFile,myText);

}

11

cout<<endl;
break;
}

}

}

else

{
cout<<"file is not found";

}
MyreadFile.close();

}

void nearestWord(Node* temp,string val,int a,int b,int i)

{

if(temp!=NULL)

{
nearestWord(temp->left,val,0,0,i);

while(a!=val.size())
{

if(int(val[a])==int(temp->data[a]))

{

b++;

}
a++;

}
if(b>=2)

{
bool ans;

cout<<"did you mean: "<<temp->data<<"?"<<endl;



//cin>>ans;
//	if(ans)

//	{

//fileRead(temp->data);

// }

}


12

nearestWord(temp->right,val,0,0,i);

}



}

string searhWord(Node * cur, string val)

{



Node* temp=cur;
while(cur!=NULL)

{
if (val.size()>=cur->data.size())

{
if(compareOperation(val,cur->data)==0)

{

cout<<cur->data<<" is found"<<endl;
fileRead( cur->data);
break;

}



cur=cur->right;

}
else

{

if(compareOperation(val,cur->data)==0)

{
cout<<cur->data<<" is found"<<endl;
fileRead(cur->data);
break;

}



cur=cur->left;

}

}

if(cur==NULL)
{

cout<<val<<" is not found"<<endl;

13


nearestWord(temp,val,0,0,0);




}

}
Node* findMaxNode(Node* root)

{
if(root->right == NULL)
return root;
findMaxNode(root->right);

}
Node* DeleteNodeInBST(Node* root,string data)

{

if(root == NULL)

{

cout<<"you search wrong input that is not existing"<<endl;

return root;

}

else if(root->data.size() > data.size()&&compareOperation(root->data,data)==1)

{
root->left = DeleteNodeInBST(root->left, data);

}

else if(root->data.size() <= data.size()&&compareOperation(root->data,data)==1)

{

root->right = DeleteNodeInBST(root->right, data);

}

else

{

if(root->left == NULL && root->right == NULL)

{
delete root;
root = NULL;


14


}

else if(root->right == NULL)

{
Node* temp = root;
root = root->left;
delete temp;

}

else if(root->left == NULL)

{
Node* temp = root;
root = root->right;

delete temp;
}






else

{

Node* maxNode = findMaxNode(root->left); root->data = maxNode->data;

root->left = DeleteNodeInBST(root->left, maxNode->data);



}

}

return root;






}

void findSimilarWord(string ch )

{
string myText;

ifstream MyreadFile("similarWord.txt"); if(MyreadFile.is_open())
{
while(getline(MyreadFile,myText))

15

{
if(myText.find(ch,0)==0&&ch!="")

{

while(myText.length()!=0)

{

cout<<myText<<endl;
getline(MyreadFile,myText);

}

cout<<endl;
break;
}

}

}

else

{
cout<<"file is not found";

}
MyreadFile.close();

}

};


#include<iostream>
#include<fstream>
#include<string>

#include"Bst.h"
using namespace std;

int main()

{
Bst *dc =new Bst();

Node * key=NULL;
string wr;
int i;
int c=1;
string myText;

ifstream MyreadFile("wordList.txt");

if(MyreadFile.is_open())
{
while(MyreadFile>>myText)

{

//cout<<c++<<" "<<myText<<endl;

key=dc->creat(myText,key);

//getline(MyreadFile,myText);

}

}

else

{
cout<<"file is not found";

}
MyreadFile.close();



7

// dc->display(key);



while(1)

{

cout<<endl<<"opt:1 add new word"<<endl; cout<<"opt:2 search a word"<<endl; cout<<"opt:3 delete a word"<<endl; cout<<"opt:4 similar meaning of word"<<endl; cout<<"opt:5 display"<<endl;

cout<<endl;

cout<<"input your option: ";
int in;
if( cin>>in)

{

}

else

{

cout<<"An error has ocurred! you have entered an invalid input "<<endl; break;
}

switch (in)
{
case 1:

{



string newWord,information,th;
string fileName("MyFile.txt");
ofstream fileOut;

cout<<"enter your new word"<<endl;
cin>>newWord;
key=dc->creat(newWord,key);
fileOut.open(fileName,std::ios_base::app);
cout<<"describe your defination and example"<<endl;

getline(cin>>information,th);
fileOut<<"\n"<<information<<th<<"\n";
cout<<"Done!"<<endl;
//return EXIT_SUCCESS;
fileOut.close();

8


}

break;
case 2:
{

cout<<"enter your word that you want to search"<<endl; string perameter;
cin>>perameter;

wr=dc->searhWord(key,perameter);

}

break;

case 3:
{
string dlt;

cout<<"enter your word that you want to delete"<<endl;

cin>>dlt;
key=dc->DeleteNodeInBST(key,dlt);
cout<<"delete successfully!"<<endl;



}

break;
case 4:
{

string input;

cout<<"Enter your word: ";
cin>>input;
dc->findSimilarWord(input);

}
break;
case 5:

{
dc->display(key);
dc->c=1;
}
}

}

}
