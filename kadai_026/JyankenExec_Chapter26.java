package kadai_026;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        Jyanken_Chapter26 play = new Jyanken_Chapter26();
        
        play.getMyChoice();
        play.getRandom();
        play.playGame();
        play.cleanup(); // 最後に Scanner を閉じる
    }
}

