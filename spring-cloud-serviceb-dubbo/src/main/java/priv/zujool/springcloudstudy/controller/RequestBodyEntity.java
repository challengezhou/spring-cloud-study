package priv.zujool.springcloudstudy.controller;

public record RequestBodyEntity(String a, String b){

    public RequestBodyEntity{
        a+=" received";
        b+=" received";
    }
}
