//method overriding in java

class Sports
{
    public void contains()
    {
        System.out.println("Sport contains ball games, athletics etc.");
    }
}

class Football extends Sports
{
    public void contains()   
    {
        System.out.println("Football contains a ball, goal post, pitch.");
    }
    
    public static void main(String[] args) {
        Football f = new Football();
        f.contains();
    }
}
