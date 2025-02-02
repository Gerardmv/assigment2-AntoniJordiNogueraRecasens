package cat.tecnocampus.mobileapps.practica2.MontasellVallsGerard.NogueraRecasensAntoniJordi;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    /*
    Opina tu pero no creo que sea necessario se puedem usar nickname como primary key
    @PrimaryKey
    public int uid;
    */
    @PrimaryKey
    @ColumnInfo(name="nick_name")
    public String nickName;

    @ColumnInfo(name = "punctuation")
    public int punctuation;

    @ColumnInfo(name = "num_games")
    public int numGames;

    public User(String nickName, int punctuation, int numGames) {
        this.nickName = nickName;
        this.punctuation = punctuation;
        this.numGames = numGames;
    }

    public String getNickName() {
        return nickName;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public int getNumGames() {
        return numGames;
    }
}
