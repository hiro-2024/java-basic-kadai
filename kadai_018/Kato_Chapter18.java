package kadai_018;

public abstract class Kato_Chapter18 {
    //フィールド
    public String familyName = "加藤";
    public String givenName = "";
    public String address = "東京都中野区〇×";
    
    //共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前：" + this.familyName + this.givenName + "です");
        System.out.println("住所：" + this.address + "です");
    }
    
    //各サブクラスで個別に実装する必要がある
    public abstract void eachIntroduce();
    
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}