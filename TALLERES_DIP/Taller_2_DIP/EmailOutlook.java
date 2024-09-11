public class EmailOutlook  extends Email{
    

    public EmailOutlook(String image, String to, String body){
    super (to, subject, body);
    this.image = image;
    }
}
