/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio4;

import java.util.Scanner;
import desafio4.TypeSocialMedia;
import desafio4.SocialMedia;

/**
 *
 * @author raissa_sc6
 */
public class Desafio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a URL que quer compartilhar: ");
        String link = sc.nextLine();
        System.out.println("Escolha uma rede social:");
        System.out.println("(1)-Facebook, \n(2)-Twitter, \n(3)-Instagram, \n(4)-WhatsApp,  ");
        int op = sc.nextInt();
        TypeSocialMedia typeSocialMedia = TypeSocialMedia.values()[op - 1];
        SocialMedia socialMedia = typeSocialMedia.shareLink();
        String share = socialMedia.shareLink(link);
        System.out.printf("O Link para compatilhar é:" + share);
    }
    
}
