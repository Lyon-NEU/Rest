package dz.aist.com.rest.auth;

/**
 * Created by Wang on 2016/5/16.
 * @author Liang
 */
public class User {

    private long id;
    private String name;
    private String password;

    public User(long id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String toString(){
        return "ID:"+id+" ,Name:"+name;
    }
}
