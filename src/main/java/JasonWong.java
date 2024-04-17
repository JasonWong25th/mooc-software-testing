public class JasonWong {
//    String getFullName(). This method returns your full name, with spacing, as a string.
//            String getFirstName(). This method returns your first name as a string.
//            String getLastName(). This method returns your last name as a string.
//            String getUCInetID(). This method returns your UCInetID as a string.
//    int getStudentNumber(). This method returns your UCI student number.
//            String getRotatedFullName(int shift). This method returns your name, rotated (with wrap-around), by ’shift’ characters. Positive numbers rotate to the left, and negative numbers rotate to the right.
    public String getFirstName(){
        return "Jason";
    }
    public  String getLastName(){
        return "Wong";
    }
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    public String getUCInetID(){
        return "26428957";
    }
    public int getStudentNumber(){
        return 26428957;
    }
    public String getRotatedFullName(int shift){
        String name = getFullName();
        shift %= name.length();
        if (shift > 0){
            return name.substring(shift) + name.substring(0,shift);
        }
        shift *= -1;
        return name.substring(name.length()-shift) + name.substring(0, name.length()- shift);

    }

}
