package hello.hellospring.domain;

import org.springframework.stereotype.Repository;

@Repository
public class Member {

    private Long id;

    private String name;

    private String passwd;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPasswd(){return passwd;}

    public void setPasswd(String passwd) {this.passwd = passwd; }

}
