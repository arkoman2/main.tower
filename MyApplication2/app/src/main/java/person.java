/**
 * Created by TomeKorbinsky on 15/10/2016.
 */
public class person {
    protected String name;
    protected String num;
    protected String pic;
    protected String email;
    protected String group;
    protected String audio;

    public person(){
        this.name = "";
        this.num = "";
        this.pic = "";
        this.email = "";
        this.group = "";
        this.audio = "";
    }
    public person(String name, String num, String pic){
        this.name = name;
        this.num = num;
        this.pic = pic;
        this.email = "";
        this.group = "";
        this.audio = "";

    }
    public void changeName(String name){
        this.name = name;
    }

    public void changeNum(String num){
        this.num = num;
    }

    public void changePic(String pic){
        this.pic = pic;
    }

    public void changeEmail(String email){
        this.email = email;
    }
    public void changeGroup(Group type){
        this.group = type.toString();
    }

    public void changeAudio(String audio){
        this.audio = audio;
    }

    public enum Group {
        Work,
        School,
        Family

    }
}
