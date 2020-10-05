/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio4;

import  desafio4.socialMedia.Facebook;
import desafio4.socialMedia.Instagram;
import  desafio4.socialMedia.Twitter;
import desafio4.socialMedia.WhatsApp;

/**
 *
 * @author raissa_sc6
 */
public enum TypeSocialMedia {
    
	Facebook {
		@Override
		public SocialMedia shareLink(){
                    return new Facebook();
		}
	},
	Twitter {
		@Override
		public SocialMedia shareLink(){
                    return new Twitter();
		}
	},
        Instagram {
		@Override
		public SocialMedia shareLink(){
                    return new Instagram();
		}
	},
	WhatsApp {
		@Override
		public SocialMedia shareLink(){
                    return new WhatsApp();
		}
	};
	public abstract SocialMedia shareLink();
}
