package com.example.logoquiz;

import java.util.ArrayList;

import android.app.Application;
import android.widget.Toast;

public class LogoQuizApp extends Application {

	public ArrayList<Logo> logoMasterList;
	public static final String DEBUG_TAG = "LogoQuiz";
	
	@Override
	public void onCreate(){
		super.onCreate();
		logoMasterList = new ArrayList<Logo>();
		
		logoMasterList.add(new Logo("Genrali Group",R.drawable.assicurazioni_generali));
		logoMasterList.add(new Logo("Bank of America",R.drawable.bank_of_america));
		logoMasterList.add(new Logo("BMW",R.drawable.bmw));
		logoMasterList.add(new Logo("Chevron",R.drawable.chevron));
		logoMasterList.add(new Logo("China National Petroleum",R.drawable.china_national_petroleum));
		logoMasterList.add(new Logo("ConocoPhillips",R.drawable.conocophillips));
		logoMasterList.add(new Logo("Credit Agricole",R.drawable.credit_agricole));
		logoMasterList.add(new Logo("Deutsche Bank",R.drawable.deutsche));
		logoMasterList.add(new Logo("Exxonmobil",R.drawable.exxonmobil));
		logoMasterList.add(new Logo("General Electrics",R.drawable.ge));
		logoMasterList.add(new Logo("General Motors",R.drawable.general_motors));
		logoMasterList.add(new Logo("ING Group",R.drawable.ing_group));
		logoMasterList.add(new Logo("P & G",R.drawable.p_and_g));
		logoMasterList.add(new Logo("Royal Bank of Scotland",R.drawable.royal_bank_of_scotland));
		logoMasterList.add(new Logo("Shell",R.drawable.royal_dutch_shell));
		logoMasterList.add(new Logo("Total",R.drawable.total));
		logoMasterList.add(new Logo("Toyota",R.drawable.toyota));
		logoMasterList.add(new Logo("Volkswagen",R.drawable.volkswagen));
		logoMasterList.add(new Logo("Walmart",R.drawable.walmart));
		logoMasterList.add(new Logo("Allianz",R.drawable.allianz));
		logoMasterList.add(new Logo("AT&T",R.drawable.att));
		logoMasterList.add(new Logo("HBOS",R.drawable.hbos));
		logoMasterList.add(new Logo("Honda",R.drawable.honda));
		logoMasterList.add(new Logo("HP",R.drawable.hp));
		logoMasterList.add(new Logo("HSBC",R.drawable.hsbc));
		logoMasterList.add(new Logo("Hyndai",R.drawable.hyundai));
		logoMasterList.add(new Logo("LG",R.drawable.lg));
		logoMasterList.add(new Logo("Nestle",R.drawable.nestle));
		logoMasterList.add(new Logo("Peugeot",R.drawable.peugeot));
		logoMasterList.add(new Logo("Samsung",R.drawable.samsung));
		logoMasterList.add(new Logo("UBS",R.drawable.ubs));
		logoMasterList.add(new Logo("Vodafone",R.drawable.vodafone));
		
		logoMasterList.add(new Logo("Addidas",R.drawable.adidas));
		logoMasterList.add(new Logo("Amazon",R.drawable.amazon));
		logoMasterList.add(new Logo("Atari",R.drawable.atari));
		logoMasterList.add(new Logo("Calvin Klein",R.drawable.calvin_klein));
		logoMasterList.add(new Logo("Cartoon Network",R.drawable.cartoon_network));
		
		logoMasterList.add(new Logo("Apple",R.drawable.apple));
		logoMasterList.add(new Logo("Bacardi",R.drawable.bacardi));
		logoMasterList.add(new Logo("Barclays",R.drawable.barclays));
		logoMasterList.add(new Logo("BlueTooth",R.drawable.bluetooth));
		logoMasterList.add(new Logo("BNP",R.drawable.bnp));
		logoMasterList.add(new Logo("Brazzers",R.drawable.brazzers));
		logoMasterList.add(new Logo("Bridgestone",R.drawable.bridgestone));
		
		logoMasterList.add(new Logo("Chanel",R.drawable.chanel));
		logoMasterList.add(new Logo("Chrome",R.drawable.chrome));
		logoMasterList.add(new Logo("Corona",R.drawable.corona));
		
		logoMasterList.add(new Logo("Dove",R.drawable.dove));
		logoMasterList.add(new Logo("Dunlop",R.drawable.dunlop));
		
		logoMasterList.add(new Logo("Facebook",R.drawable.facebook));
		logoMasterList.add(new Logo("FBI",R.drawable.fbi));
		logoMasterList.add(new Logo("Ferrari",R.drawable.ferrari));
		logoMasterList.add(new Logo("Firefox",R.drawable.firefox));
		logoMasterList.add(new Logo("Fosters",R.drawable.fosters));
		
		logoMasterList.add(new Logo("Harley",R.drawable.harley));
		logoMasterList.add(new Logo("Hello Kitty",R.drawable.hello_kitty));
		logoMasterList.add(new Logo("HTC",R.drawable.htc));
		
		logoMasterList.add(new Logo("Internet Explorer",R.drawable.interner_explorer));
		
		logoMasterList.add(new Logo("John Deer",R.drawable.john_deer));
		logoMasterList.add(new Logo("Joniee Walker",R.drawable.johniee_walker));
		logoMasterList.add(new Logo("JPMChase",R.drawable.jpmchase));
		
		logoMasterList.add(new Logo("Kellogs",R.drawable.kelloggs));
		logoMasterList.add(new Logo("KFC",R.drawable.kfc));
		logoMasterList.add(new Logo("Knor",R.drawable.knor));
		logoMasterList.add(new Logo("Kodak",R.drawable.kodak));
		
		logoMasterList.add(new Logo("Lays",R.drawable.lays));
		logoMasterList.add(new Logo("Louis Vuitton",R.drawable.louis_vuitton));
		logoMasterList.add(new Logo("Lufthansa",R.drawable.lufthansa));
		
		logoMasterList.add(new Logo("Mc Doonalds",R.drawable.mcdonalds));
		logoMasterList.add(new Logo("Michelln",R.drawable.michelln));
		logoMasterList.add(new Logo("Monster",R.drawable.monster));
		logoMasterList.add(new Logo("Motorola",R.drawable.motorola));
		logoMasterList.add(new Logo("Mountain Dew",R.drawable.mountain_dew));
		logoMasterList.add(new Logo("MSN",R.drawable.msn));
		logoMasterList.add(new Logo("MTV",R.drawable.mtv));
		
		logoMasterList.add(new Logo("Napster",R.drawable.napster));
		logoMasterList.add(new Logo("Netscape",R.drawable.netscape));
		logoMasterList.add(new Logo("Nike",R.drawable.nike));
		logoMasterList.add(new Logo("Nissan",R.drawable.nissan));
		
		logoMasterList.add(new Logo("Opel",R.drawable.opel));
		logoMasterList.add(new Logo("Opera",R.drawable.opera));
		
		logoMasterList.add(new Logo("Paramount",R.drawable.paramount));
		logoMasterList.add(new Logo("Pizza Hut",R.drawable.pizza_hut));
		logoMasterList.add(new Logo("PlayBoy",R.drawable.playboy));
		logoMasterList.add(new Logo("Plastation",R.drawable.playstaion));
		logoMasterList.add(new Logo("Pringles",R.drawable.pringles));
		
		logoMasterList.add(new Logo("Red Bull",R.drawable.red_bull));
		logoMasterList.add(new Logo("Reddit",R.drawable.reddit));
		logoMasterList.add(new Logo("Reebok",R.drawable.reebok));
		
		logoMasterList.add(new Logo("Safari",R.drawable.safari));
		logoMasterList.add(new Logo("Skoda",R.drawable.skoda));
		logoMasterList.add(new Logo("Skype",R.drawable.skype));
		logoMasterList.add(new Logo("Sony Erricsson",R.drawable.sony_ericsson));
		logoMasterList.add(new Logo("Starbucks",R.drawable.starbucks));
		logoMasterList.add(new Logo("Suzuki",R.drawable.suzuki));
		logoMasterList.add(new Logo("Swatch",R.drawable.swatch));
		
		logoMasterList.add(new Logo("Twitter",R.drawable.twitter));
		
		logoMasterList.add(new Logo("Unicef",R.drawable.unicef));
		logoMasterList.add(new Logo("Unilever",R.drawable.unilever));
		
		logoMasterList.add(new Logo("Versace",R.drawable.versace));
		
		logoMasterList.add(new Logo("Warner Bros",R.drawable.warner_bros));
		logoMasterList.add(new Logo("Wikipedia",R.drawable.wikipedia));
		logoMasterList.add(new Logo("Windows 8",R.drawable.windows_8));
		logoMasterList.add(new Logo("WWF",R.drawable.wwf));
		
		logoMasterList.add(new Logo("Yamaha",R.drawable.yamaha));
		logoMasterList.add(new Logo("You Tube",R.drawable.you_tube));
		
		Toast.makeText(this, "total logos in db: " + logoMasterList.size(), Toast.LENGTH_SHORT).show();
	}
}
