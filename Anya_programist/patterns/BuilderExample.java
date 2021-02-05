package Anya_programist.patterns;

public class BuilderExample {
    static class User{
        private String name;
        private String age;
        private String birthday;

        private User(String name, String age, String birthday){
            this.name = name;
            this.age = age;
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", birthday='" + birthday + '\'' +
                    '}';
        }

        public static Builder toBuilder(){
            return new Builder();
        }

        private static class Builder {
            private String name;
            private String age;
            private String birthday;

            public Builder withName(String name){
                this.name = name;
                return this;
            }

            public Builder withAge(String age){
                this.age = age;
                return this;
            }

            public Builder withBirthday(String birthday){
                this.birthday = birthday;
                return this;
            }

            public User build(){
                return new User(name, age, birthday);
            }
        }
    }

    public static void main(String[] args) {
        User.Builder b = User.toBuilder()
                .withAge("age") ;

        System.out.println(b.build());
    }

    public static void someMethod(User.Builder b){
        if(System.currentTimeMillis() % 2 == 0) {
            b.withName("someMethodName");
        }
    }
}
