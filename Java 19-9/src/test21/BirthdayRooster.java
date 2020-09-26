package test21;

public class BirthdayRooster {
        private static String[] day = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        private static Employee[] emp = {new Employee("Nguyen Quang Duy",
                new Date(23,9,2000),
                "IT"),
                new Employee("Nguyen Xuan Phuc",
                        new Date(26,9,2020),
                        "HR"),
                new Employee("Jayzer Nguyen",
                        new Date(1,11,1999),
                        "BA")};

        public static void print() {
            for(Employee e:emp)
                System.out.println(e + "(" + day[e.getBirthday().dayOfWeek()] + ")");
        }
}

