package Creational.BaiTap.BT2;

public class myStringBuilder {
    private String str = "";

    

    public myStringBuilder(Builder builder) {
        this.str = builder.str;
    }



    public static class Builder {
        String str = "";
        public Builder addString(String s) {
            this.str += s;
            return this;
        }

        public Builder addFloat(float f) {
            this.str += f;
            return this;
        }

        public Builder addBool(boolean b){
            this.str += b;
            return this;
        }

        public myStringBuilder build(){
            return new myStringBuilder(this);
        }
    }

    @Override
    public String toString() {
        return str;
    }    
}
