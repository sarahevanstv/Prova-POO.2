public class Produto {

    private String name;
    private String code;

    public Produto(int code, int name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
}
