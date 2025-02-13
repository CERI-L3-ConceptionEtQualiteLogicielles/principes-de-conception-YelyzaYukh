package exo1;

public class AdaptorObjServiceEnvoiPhoto implements SendService{
    private ServiceSendPhoto serviceSendPhoto;

    @Override
    public void envoi(Contact contact, String message){
        serviceSendPhoto.envoiPhoto(contact, message);

    }



}
