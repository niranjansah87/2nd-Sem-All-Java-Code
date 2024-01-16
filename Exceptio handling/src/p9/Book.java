package p9;

import java.util.Scanner;
 class Book {
String Bid;
String Bname;
String Baurthor;
int Yop;
public void setBID(String bid) {
try {
if(bid.matches("[A-Z a-z 0-9]+"))
{
Bid=bid;
}
else
{
throw new InvalidIDException(Bid);
}
}
catch(InvalidIDException e){
System.out.println(e);
}
}
public String getBID() {
return Bid;
}
public void setBNAME(String bname) {
boolean m=bname.matches("[A-Z a-z]+");
try {
if(!m)
{
throw new InvalidNameException(Bname);
}
else
{
this.Bname=bname;
}
}
catch(InvalidNameException e){
System.out.println(e);
}
}
public String getBNAME() {
return Bname;
}
public void setAURTHOR(String baurthor) {
boolean m=baurthor.matches("[A-Z a-z]+");
try {
if(!m)
{
throw new InvalidAurthorException(Baurthor);
}
else
{
this.Baurthor=baurthor;
}
}
catch(InvalidAurthorException e){
System.out.println(e);
}
}
public String getBAURTHOR() {
return Baurthor;
}
public void setYOP(int yop) {
Integer obj=yop;
String str=obj.toString();
int len=str.length();
try {
if(len==4)
{
Yop=yop;
}
else
{
throw new InvalidYOPException(Yop);
}
}
catch(InvalidYOPException e){
System.out.println(e);
}
}
public int getYOP() {
return Yop;
}

 public String toString() {
String str;
str=String.format("Book ID: %s%n, Book Name: %s%n Book Aurthor: %s%n Book YOP: %d%n", getBID(),getBNAME(),getBAURTHOR(),getYOP());
 return str;
 }
 }
class InvalidNameException extends Exception{
String Name;
InvalidNameException(String Name)
{
this.Name=Name;
}
public String toString()
{
return "Invalid Name: "+Name;
}
}
class InvalidIDException extends Exception{
String Id;
InvalidIDException(String Id)
{
this.Id=Id;
}
public String toString()
{
return "Invalid Id: "+Id;
}
}
class InvalidAurthorException extends Exception{
String Aurthor;
InvalidAurthorException(String Aurthor)
{
this.Aurthor=Aurthor;
}
public String toString()
{
return "Invalid Aurthor: "+Aurthor;
}
}
class InvalidYOPException extends Exception{
int YOP;
InvalidYOPException(int YOP)
{
this.YOP=YOP;
}
public String toString()
{
return "Invalid Year of Publication: "+YOP;
}
}
