package modifier.person;

import modifier.Person;

public class author {

    Person p = new Person();

    public author() {
        // akan terjadi error di sini karena atribut name
        // telah diberikan mmodifier protected

        p.name = "Petani Kode";
    }
}