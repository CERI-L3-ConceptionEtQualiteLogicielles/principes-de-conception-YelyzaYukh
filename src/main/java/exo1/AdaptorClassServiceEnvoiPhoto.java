package exo1;

public class AdaptorClassServiceEnvoiPhoto extends ServiceSendPhoto implements SendService {
    @Override
    public void envoi(Contact contact, String message){
        envoiPhoto(contact, message);
    }
}
