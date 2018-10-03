/*
 * 
 * 
 * 
 */
package DataBase.Model;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Scoreboard {

    public int _id;
    public String nickname;
    public int score;

    public Scoreboard(int _id, String nickname, int score) {
        this._id = _id;
        this.nickname = nickname;
        this.score = score;
    }

    public Scoreboard() {
    }

    public Scoreboard(String string, int aInt) {
        this.nickname = string;
        this.score=aInt;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
