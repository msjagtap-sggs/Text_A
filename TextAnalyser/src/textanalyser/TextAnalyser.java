/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyser;

/**
 *
 * @author dell
 */
public class TextAnalyser {

    
      private  String inputText;
        
        private int textLength;
        private int wordCount;
        private int lineCont;
        private int tabCount;
        private int spaceCount;
        
        private String uniqueCharText;

    public TextAnalyser(String inputText) {
        this.inputText = inputText;
                
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCont() {
        return lineCont;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public String getUniqueCharText() {
        return uniqueCharText;
    }
        int getCharWordCount(String text){
            
            return 0;
        }
        
        
        
        private void Analyze(){
             textLength = inputText.length();
             lineCont = textLength>0 ? inputText.split("\n",-1).length:0;
             tabCount = inputText.split("\t",-1).length-1;
             spaceCount = inputText.split(" ",-1).length-1;
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        
      TextAnalyser textSample =new TextAnalyser("asb \n cssg \t dg");
        
        
    
    

    }

    @Override
    public String toString() {
        return "TextAnalyser{" + "inputText=" + inputText + ", textLength=" + textLength + ", wordCount=" + wordCount + ", lineCont=" + lineCont + ", tabCount=" + tabCount + ", spaceCount=" + spaceCount + ", uniqueCharText=" + uniqueCharText + '}';
    }

}