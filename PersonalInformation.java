public class PersonalInformation {
    
    // Personal Information Fields
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;
    private String country;
    private String profession;
    private String education;
    
    // Constructor to initialize personal information
    public PersonalInformation(String name, int age, String email, String phone, 
                         String city, String country, String profession, String education) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.profession = profession;
        this.education = education;
    }
    
    // Method to display personal information
    public void displayInformation() {
        System.out.println("========== MY PERSONAL INFORMATION ==========");
        System.out.println("Name:       " + name);
        System.out.println("Age:        " + age);
        System.out.println("Email:      " + email);
        System.out.println("Phone:      " + phone);
        System.out.println("City:       " + city);
        System.out.println("Country:    " + country);
        System.out.println("Profession: " + profession);
        System.out.println("Education:  " + education);
        System.out.println("===========================================");
    }
    
    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getProfession() { return profession; }
    public String getEducation() { return education; }
    
    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setCity(String city) { this.city = city; }
    public void setCountry(String country) { this.country = country; }
    public void setProfession(String profession) { this.profession = profession; }
    public void setEducation(String education) { this.education = education; }
    
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance with personal information (you can modify these values)
        PersonalInformation introduction = new PersonalInformation(
            "Prathamesh Otari",           // Name
            27,                   // Age
            "prathameshotari@gmail.com", // Email
            "+91-7083396250",    // Phone
            "Pune",           // City
            "India",      // Country
            "Cloud & DevOps Engineer", // Profession
            "Bachelor of Engineering in Mechanical" // Education
        );
        
        // Display the personal information
        introduction.displayInformation();
    }
}
