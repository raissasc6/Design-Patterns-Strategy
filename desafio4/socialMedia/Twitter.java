/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio4.socialMedia;

import desafio4.SocialMedia;

/**
 *
 * @author raissa_sc6
 */
public class Twitter implements SocialMedia{

    @Override
    public String shareLink(String link) {
        String address = "https://twitter.com/intent/tweet?text=";
        return address + link;
    }
    
    
}
