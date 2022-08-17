import java.util.*;
class Scrabble {
    private List<Character> list = new ArrayList<Character>();

    Scrabble(String word) {
        word = word.toUpperCase();
        char[] array = word.toCharArray();
        for(char c : array){
            this.list.add(c);
        }
    }

    int getScore() {
        int sum = 0;
        for(char c : this.list){
            switch(c){
                case 'A':
                    sum +=1;
                    break;
                case 'E':
                    sum +=1;
                    break;
                case 'I':
                    sum +=1;
                    break;
                case 'O':
                    sum +=1;
                    break;
                case 'U':
                    sum +=1;
                    break;
                case 'L':
                    sum +=1;
                    break;
                case 'N':
                    sum +=1;
                    break;
                case 'R':
                    sum +=1;
                    break;
                case 'S':
                    sum +=1;
                    break;
                case 'T':
                    sum +=1;
                    break;
                case 'D':
                    sum +=2;
                    break;
                case 'G':
                    sum +=2;
                    break;
                case 'B':
                    sum +=3;
                    break;
                case 'C':
                    sum +=3;
                    break;
                case 'M':
                    sum +=3;
                    break;
                case 'P':
                    sum +=3;
                    break;
                case 'F':
                    sum +=4;
                    break;
                case 'H':
                    sum +=4;
                    break;
                case 'V':
                    sum +=4;
                    break;
                case 'W':
                    sum +=4;
                    break;
                case 'Y':
                    sum +=4;
                    break;
                case 'K':
                    sum +=5;
                    break;
                case 'J':
                    sum +=8;
                    break;
                case 'X':
                    sum +=8;
                    break;
                case 'Q':
                    sum +=10;
                    break;
                case 'Z':
                    sum +=10;
                    break;
            }
            
        }
        return sum;
    }

}
