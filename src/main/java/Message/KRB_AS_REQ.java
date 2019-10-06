/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vermeirl
 */
public class KRB_AS_REQ implements Message {

    private Date preAuthData;
    private String principalName;
    private String realm;
    private String nonce;
    private Date expirationTime;
    private Date renewTillTime;
    private Date validStarting;

    public KRB_AS_REQ(String principalName, String realm) {
        Calendar calendar = Calendar.getInstance();
        this.principalName = principalName;
        this.realm = realm;
        preAuthData = calendar.getTime();
        validStarting = preAuthData;
        calendar.add(Calendar.DATE, 1);
        expirationTime = calendar.getTime();
        calendar.add(Calendar.DATE, 4);
        renewTillTime = calendar.getTime();
        SecureRandom random = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        nonce = stringBuilder.toString();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
//        System.out.println(formatter.format(preAuthData));
//        System.out.println(formatter.format(expirationTime));
//        System.out.println(formatter.format(renewTillTime));
//        System.out.println(formatter.format(validStarting));
    }

    public Date getPreAuthData() {
        return preAuthData;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getRealm() {
        return realm;
    }

    public String getNonce() {
        return nonce;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public Date getRenewTillTime() {
        return renewTillTime;
    }

    public Date getValidStarting() {
        return validStarting;
    }
}
