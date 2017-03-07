public class Essay extends GradedActivity
{
 private int grammar;
 private int spelling;
 private int correctLength;
 private int content;
 
 public Essay()
 {
  grammar = 0;
  spelling = 0;
  correctLength = 0;
  content = 0;
 }
 
 public Essay(int gramScore, int spelScore, int cLScore, int contScore)
 {
  grammar = gramScore;
  spelling = spelScore;
  correctLength = cLScore;
  content = contScore;
 }
 
 void setGrammar(int grammar)
 {
  this.grammar = grammar;
 }
 
 void setSpelling(int spelling)
 {
  this.spelling = spelling;
 }
 
 void setCorrectLength(int correctLength)
 {
  this.correctLength = correctLength;
 }
 
 void setContent(int content)
 {
  this.content = content;
 }
 
 int getGrammarScore()
 {
  return grammar;
 }
 
 int getSpellingScore()
 {
  return spelling;
 }
 
 int getCorrectLengthScore()
 {
  return correctLength;
 }
 
 int getContentScore()
 {
  return content;
 }
 
 int getTotal()
 {
  return grammar + spelling + correctLength + content;
 }
 
 public String toString()
 {
  return "Grammar : " + grammar + " pts.\nSpelling : " + spelling + " pts.\nLength : "
    + correctLength + " pts.\nContent : " + content + " pts.";
 }
}