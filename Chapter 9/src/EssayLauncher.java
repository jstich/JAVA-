public class EssayLauncher
{
 public static void main(String[] args)
 {
  Essay englishEssayEmpty = new Essay();
  Essay englishEssay = new Essay(30, 20, 20, 30);
  
  englishEssayEmpty.setGrammar(20);
  englishEssayEmpty.setSpelling(15);
  englishEssayEmpty.setCorrectLength(5);
  englishEssayEmpty.setContent(28);
  
  englishEssayEmpty.setScore(englishEssayEmpty.getTotal());
  englishEssay.setScore(englishEssay.getTotal());
  
  System.out.println(englishEssayEmpty.getGrammarScore() + "\n" + englishEssayEmpty.getSpellingScore() +
         "\n" + englishEssayEmpty.getCorrectLengthScore() + "\n"
         + englishEssayEmpty.getContentScore() + "\n" + englishEssayEmpty.getTotal() + "\n" +
         englishEssayEmpty.getScore() + "\n" + englishEssayEmpty.getGrade() + "\n");
  
  System.out.println(englishEssayEmpty + "\n\nScore : "+ englishEssayEmpty.getTotal() +" pts.\n\nGrade : "
         + englishEssayEmpty.getGrade() + "\n\n" + englishEssay + "\n\nScore : " +
         englishEssay.getTotal() +" pts.\n\nGrade : " + englishEssay.getGrade());
 }
}