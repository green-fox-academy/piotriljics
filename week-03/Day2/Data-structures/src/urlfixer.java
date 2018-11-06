public class urlfixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.substring(0, 4) + ":" + url.substring(5, url.length());
        System.out.println(url);

    }
}
