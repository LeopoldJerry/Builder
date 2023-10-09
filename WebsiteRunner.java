public class WebsiteRunner {
    public static void main(String[] args){
        Director director = new Director();

        director.setBuilder(new VisitCardWebsite());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
