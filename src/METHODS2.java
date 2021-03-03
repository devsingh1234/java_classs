class student{

    String name;
    int  numberOfFriends;
    String changeName(String newName){
        this.name = newName;
        return this.name;
    }

}

class College{
    public static void main(String[] args) {
        student kumar = new student();
        kumar.name = "Kumar sanskar"
                kumar.numberOfFriends = 6;
        var nayaNam = kumar.changeName("sid");
    }
}