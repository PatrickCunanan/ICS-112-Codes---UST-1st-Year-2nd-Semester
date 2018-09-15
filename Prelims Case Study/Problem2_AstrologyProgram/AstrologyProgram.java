/*CRUZ, Jericho Janssen L.
  CUNANAN, Patrick Bryan F.
  MACALINO, Brendel Jeorge F.
  MALONZO, Marc Denzel S.
  REYES, Raiden Karl Mordecai D.
  RICO, Maeric Eulex R.
  1CSB
  Main Case Study Problem 2: This program gets the birthday of the user as input and displays his/her corresponding zodiac sign and horoscope.*/

import java.util.*;

public class AstrologyProgram{
	public static void main (String [] args) throws Exception{
		Scanner Scan = new Scanner(System.in);
		int Month, Day, Year;
		char Again;
		do{
			System.out.println("                    *****     ASTROLOGY PROGRAM     *****                    ");
			System.out.print("Input your birthday (MM DD YYYY): ");
			Month=Scan.nextInt();
			Day=Scan.nextInt();
			Year=Scan.nextInt();
			if((Month<=0)||(Month>12)){
				System.out.println("Wrong input! (Invalid Month)");
			}
			else if ((Day>31)||(Day<=0)){
				System.out.println("Wrong input! (Invalid Day)");
			}
			else if (Year<=0){
				System.out.println("Wrong input! (Invalid Year)");
			}
			else if (((Month==4)||(Month==6)||(Month==9)||(Month==11))&&(Day>=31)){
				System.out.println("Wrong input! (Invalid Month and Day)");
			}
			else if ((Month==2)&&(Day>=30)){
				System.out.println("Wrong input! (Invalid Day)");
			}
			else if ((Month==2)&&(Day<=31&&Day>=29)&&((Year%4)!=0||(Year%400)!=0&&((Year%100)==0))){
				System.out.println("Wrong input! (Invalid Day)");
			}
			else{
			if(((Month==3)&&(Day>=23)&&(Day<=31))||((Month==4)&&(Day<=17))){
			   System.out.println("Zodiac Sign: Aries (March 21 to April 19)");
			   System.out.println("Element: Fire");
			   System.out.print("Enthusiasm for spiritual and metaphysical studies could have you feeling optimistic about the future.");
			   System.out.println(" Let the insights flow, and write them down.");
			   System.out.println("Most Comfortable with other Aries and the two other FIRE signs Leo and Sagittarius.");
			}
		    else if((Month==4)&&(Day>=18)&&(Day<=21)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Aries - Taurus (April 18 to April 21)");
			   System.out.println("Element: Fire and Earth");
			   System.out.print("Enthusiasm for spiritual and metaphysical studies could have you feeling optimistic about the future.");
			   System.out.print(" Let the insights flow, and write them down.");
			   System.out.print("Discussions could lead to insights that none of you would have come up with alone.");
			   System.out.println("Don't forget to take notes of your discussions. You won't want to forget a thing you've heard or said.");
			   System.out.println("Most Comfortable with other Aries and the two other FIRE signs Leo and Sagittarius.");
			   System.out.println("Most Comfortable with other Taurus and the two other EARTH signs Virgo and Capricorn.");
			}
		    else if(((Month==4)&&(Day>=22)&&(Day<=30))||((Month==5)&&(Day<18))){
			   System.out.println("Zodiac Sign: Taurus (April 20 to May 20)");
			   System.out.println("Element: Earth");
			   System.out.print("Discussions could lead to insights that none of you would have come up with alone.");
			   System.out.println("Don't forget to take notes of your discussions. You won't want to forget a thing you've heard or said.");
			   System.out.println("Most Comfortable with other Taurus and the two other EARTH signs Virgo and Capricorn.");
			}
		    else if((Month==5)&&(Day>=19)&&(Day<=22)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Taurus - Gemini (May 19 to May 22)");
			   System.out.println("Element: Earth and Air");
			   System.out.print("Discussions could lead to insights that none of you would have come up with alone.");
			   System.out.print("Don't forget to take notes of your discussions. You won't want to forget a thing you've heard or said.");
			   System.out.print("Books or lectures on spiritual or metaphysical matters could inspire you to pursue a subject and perhaps do some writing.");
			   System.out.println("You might receive some insights about how to pursue your goals more effectively.");
			   System.out.println("Most Comfortable with other Taurus and the two other EARTH signs Virgo and Capricorn.");
			   System.out.println("Most Comfortable with other Gemini and the two other AIR signs Libra and Aquarius.");
			}
		    else if(((Month==5)&&(Day>=23)&&(Day<=31))||((Month==6)&&(Day<=18))){
			   System.out.println("Zodiac Sign: Gemini (May 21 to June 20)");
			   System.out.println("Element: Air");
			   System.out.print("Books or lectures on spiritual or metaphysical matters could inspire you to pursue a subject and perhaps do some writing.");
			   System.out.println("You might receive some insights about how to pursue your goals more effectively.");
			   System.out.println("Most Comfortable with other Gemini and the two other AIR signs Libra and Aquarius.");
			}
		    else if((Month==6)&&(Day>=19)&&(Day<=22)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Gemini - Cancer (June 19 to June 22)");
			   System.out.println("Element: Air and Water");
			   System.out.print("Books or lectures on spiritual or metaphysical matters could inspire you to pursue a subject and perhaps do some writing.");
			   System.out.print("You might receive some insights about how to pursue your goals more effectively.");
			   System.out.print("The opportunities are there if you look.");
			   System.out.println("If you're serious about this change, it's best to pursue it now.");
			   System.out.println("Most Comfortable with other Gemini and the two other AIR signs Libra and Aquarius.");
			   System.out.println("Most Comfortable with other Cancer and the two other WATER signs Scorpio and Pisces.");
			}
		    else if(((Month==6)&&(Day>=23)&&(Day<=30))||((Month==7)&&(Day<=20))){
			   System.out.println("Zodiac Sign: Cancer (June 21 to July 22)");
			   System.out.println("Element: Water");
			   System.out.print("The opportunities are there if you look.");
			   System.out.println("If you're serious about this change, it's best to pursue it now.");
			   System.out.println("Most Comfortable with other Cancer and the two other WATER signs Scorpio and Pisces.");
			}
		    else if((Month==7)&&(Day>=21)&&(Day<=24)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Cancer - Leo (July 21 to July 24)");
			   System.out.println("Element: Water and Fire");
			   System.out.print("The opportunities are there if you look.");
			   System.out.print("If you're serious about this change, it's best to pursue it now.");
			   System.out.print("Increased intuition, imagination, and spiritual insight could inspire you to either undertake a course of study or move ahead with related creative projects.");
			   System.out.println("This could be an inspiring and productive time for you.");
			   System.out.println("Most Comfortable with other Cancer and the two other WATER signs Scorpio and Pisces.");
			   System.out.println("Most Comfortable with other Leo and the two other FIRE signs Aries and Sagittarius.");
			}
		    else if(((Month==7)&&(Day>=25)&&(Day<=31))||((Month==8)&&(Day<=20))){
			   System.out.println("Zodiac Sign: Leo (July 23 to August 22)");
			   System.out.println("Element: Fire");
			   System.out.print("Increased intuition, imagination, and spiritual insight could inspire you to either undertake a course of study or move ahead with related creative projects.");
			   System.out.println("This could be an inspiring and productive time for you.");
			   System.out.println("Most Comfortable with other Leo and the two other FIRE signs Aries and Sagittarius.");
			}
		    else if((Month==8)&&(Day>=21)&&(Day<=24)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Leo - Virgo (August 21 to August 24)");
			   System.out.println("Element: Fire and Earth");
			   System.out.print("Increased intuition, imagination, and spiritual insight could inspire you to either undertake a course of study or move ahead with related creative projects.");
			   System.out.print("This could be an inspiring and productive time for you.");
			   System.out.print("Recent new ideas, insights, and visions could motivate you to invite friends with similar interests over today");
			   System.out.println("Write down your thoughts and go over them later.");
			   System.out.println("Most Comfortable with other Leo and the two other FIRE signs Aries and Sagittarius.");
			   System.out.println("Most Comfortable with other Virgo and the two other EARTH signs Taurus and Capricorn.");
			}
		    else if(((Month==8)&&(Day>=25)&&(Day<=31))||((Month==9)&&(Day<=20))){
			   System.out.println("Zodiac Sign: Virgo (August 23 to September 22)");
			   System.out.println("Element: Earth");
			   System.out.print("Recent new ideas, insights, and visions could motivate you to invite friends with similar interests over today");
			   System.out.println("Write down your thoughts and go over them later.");
			   System.out.println("Most Comfortable with other Virgo and the two other EARTH signs Taurus and Capricorn.");
			}
		    else if((Month==9)&&(Day>=21)&&(Day<=24)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Virgo - Libra (September 21 to September 24)");
			   System.out.println("Element: Earth and Air");
			   System.out.print("Recent new ideas, insights, and visions could motivate you to invite friends with similar interests over today");
			   System.out.print("Write down your thoughts and go over them later.");
			   System.out.print("An invitation to a social event in your neighborhood could put you in touch with artistic or spiritually inclined people.");
			   System.out.println("You might have trouble getting to sleep otherwise.");
			   System.out.println("Most Comfortable with other Virgo and the two other EARTH signs Taurus and Capricorn.");
			   System.out.println("Most Comfortable with other Libra and the two other AIR signs Gemini and Aquarius.");
			}
		    else if(((Month==9)&&(Day>=25)&&(Day<=30))||((Month==10)&&(Day<=20))){
			   System.out.println("Zodiac Sign: Libra (September 23 to October 22)");
			   System.out.println("Element: Air");
			   System.out.print("An invitation to a social event in your neighborhood could put you in touch with artistic or spiritually inclined people.");
			   System.out.println("You might have trouble getting to sleep otherwise.");
			   System.out.println("Most Comfortable with other Libra and the two other AIR signs Gemini and Aquarius.");
			}
		    else if((Month==10)&&(Day>=21)&&(Day<=24)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Libra - Scorpio (October 21 to October 24)");
			   System.out.println("Element: Air and Water");
			   System.out.print("An invitation to a social event in your neighborhood could put you in touch with artistic or spiritually inclined people.");
			   System.out.print("You might have trouble getting to sleep otherwise.");
			   System.out.print("Spiritual insights you received over the past few days could turn your thoughts to serving others. ");
			   System.out.println("Even the most admirable of enterprises needs to be faced in a practical frame of mind.");
			   System.out.println("Most Comfortable with other Libra and the two other AIR signs Gemini and Aquarius.");
			   System.out.println("Most Comfortable with other Scorpio and the two other WATER signs Cancer and Pisces.");
			}
		    else if(((Month==10)&&(Day>=25)&&(Day<=31))||((Month==11)&&(Day<=19))){
			   System.out.println("Zodiac Sign: Scorpio (October 23 to November 21)");
			   System.out.println("Element: Water");
			   System.out.print("Spiritual insights you received over the past few days could turn your thoughts to serving others. ");
			   System.out.println("Even the most admirable of enterprises needs to be faced in a practical frame of mind.");
			   System.out.println("Most Comfortable with other Scorpio and the two other WATER signs Cancer and Pisces.");
			}
		    else if((Month==11)&&(Day>=20)&&(Day<=23)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Scorpio - Saggitarius (November 20 to November 23)");
			   System.out.println("Element: Water and Fire");
			   System.out.print("Spiritual insights you received over the past few days could turn your thoughts to serving others. ");
			   System.out.print("Even the most admirable of enterprises needs to be faced in a practical frame of mind.");
			   System.out.print(" You could discover that you and a current or potential romantic partner have many spiritual interests in common.");
			   System.out.println("Schedule a few and stick to your plans.");
			   System.out.println("Most Comfortable with other Scorpio and the two other WATER signs Cancer and Pisces.");
			   System.out.println("Most Comfortable with other Saggitarius and the two other FIRE signs Aries and Leo.");
			}
		    else if(((Month==11)&&(Day>=24)&&(Day<=30))||((Month==12)&&(Day<=21))){
			   System.out.println("Zodiac Sign: Saggitarius (November 22 to December 21)");
			   System.out.println("Element: Fire");
			   System.out.print(" You could discover that you and a current or potential romantic partner have many spiritual interests in common.");
			   System.out.println("Schedule a few and stick to your plans.");
			   System.out.println("Most Comfortable with other Saggitarius and the two other FIRE signs Aries and Leo.");
			}
		    else if((Month==12)&&(Day>=20)&&(Day<=23)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Saggitarius - Capricorn (December 20 to December 23)");
			   System.out.println("Element: Fire and Earth");
			   System.out.print(" You could discover that you and a current or potential romantic partner have many spiritual interests in common.");
			   System.out.print("Schedule a few and stick to your plans.");
			   System.out.print("You might have intense dreams and visions tonight that could be almost prophetic.");
			   System.out.println("What you sense should be positive, so there are no warnings involved.");
			   System.out.println("Most Comfortable with other Saggitarius and the two other FIRE signs Aries and Leo.");
			   System.out.println("Most Comfortable with other Capricorn and the two other EARTH signs Taurus and Virgo.");
			}
		    else if(((Month==12)&&(Day>=24)&&(Day<=31))||((Month==1)&&(Day<=17))){
			   System.out.println("Zodiac Sign: Capricorn (December 22 to January 19)");
			   System.out.println("Element: Earth");
			   System.out.print("You might have intense dreams and visions tonight that could be almost prophetic.");
			   System.out.println("What you sense should be positive, so there are no warnings involved.");
			   System.out.println("Most Comfortable with other Capricorn and the two other EARTH signs Taurus and Virgo.");
			}
		    else if((Month==1)&&(Day>=18)&&(Day<=21)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Capricorn - Aquarius (January 18 to January 21)");
			   System.out.println("Element: Earth and Air");
			   System.out.print("You might have intense dreams and visions tonight that could be almost prophetic.");
			   System.out.print("What you sense should be positive, so there are no warnings involved.");
			   System.out.print("A lecture given by a magnetic speaker could excite your imagination and interest you in a new and intriguing field.");
			   System.out.println("You could also learn about some books on the subject that you want to read.");
			   System.out.println("Most Comfortable with other Capricorn and the two other EARTH signs Taurus and Virgo.");
			   System.out.println("Most Comfortable with other Aquarius and the two other AIR signs Gemini and Libra.\n");
			}
		    else if(((Month==1)&&(Day>=22)&&(Day<=31))||((Month==2)&&(Day<=16))){
			   System.out.println("Zodiac Sign: Aquarius (January 20 to February 18)");
			   System.out.println("Element: Air");
			   System.out.print("A lecture given by a magnetic speaker could excite your imagination and interest you in a new and intriguing field.");
			   System.out.println("You could also learn about some books on the subject that you want to read.");
			   System.out.println("Most Comfortable with other Aquarius and the two other AIR signs Gemini and Libra.");
			}
		    else if((Month==2)&&(Day>=17)&&(Day<=20)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Aquarius - Pisces (February 17 to February 20)");
			   System.out.println("Element: Air and Water");
			   System.out.print("A lecture given by a magnetic speaker could excite your imagination and interest you in a new and intriguing field.");
			   System.out.print("You could also learn about some books on the subject that you want to read.");
			   System.out.print("A friend or colleague could introduce you to a way to increase your income by doing what you love most.");
			   System.out.println("This may involve the creative arts, healing, or spiritual or metaphysical matters.");
			   System.out.println("Most Comfortable with other Aquarius and the two other AIR signs Libra and Gemini.");
			   System.out.println("Most Comfortable with other Pisces and the two other WATER signs Cancer and Scorpio.");
			}
		    else if(((Month==2)&&(Day>=21)&&(Day<=29))||((Month==3)&&(Day<=18))){
			   System.out.println("Zodiac Sign: Pisces (February 19 to March 20)");
			   System.out.println("Element: Water");
			   System.out.print("A friend or colleague could introduce you to a way to increase your income by doing what you love most.");
			   System.out.println("This may involve the creative arts, healing, or spiritual or metaphysical matters.");
			   System.out.println("Most Comfortable with other Pisces and the two other WATER signs Cancer and Scorpio.");
			}
		    else if((Month==3)&&(Day>=19)&&(Day<=22)){
			   System.out.println("Your Birthday is on a CUSP");
			   System.out.println("Zodiac Sign: Pisces - Aries (March 19 to March 22)");
			   System.out.println("Element: Fire and Water");
			   System.out.print("A friend or colleague could introduce you to a way to increase your income by doing what you love most.");
			   System.out.print("This may involve the creative arts, healing, or spiritual or metaphysical matters.");
			   System.out.print("Enthusiasm for spiritual and metaphysical studies could have you feeling optimistic about the future.");
			   System.out.println(" Let the insights flow, and write them down.");
			   System.out.println("Most Comfortable with other Pisces and the two other WATER signs Cancer and Scorpio.");
			   System.out.println("Most Comfortable with other Aries and the two other FIRE signs Leo and Sagittarius.");
			}
			}
		   do{
			   	System.out.print("\nDo you want to try again? (Y/N): ");
				Again=(char)System.in.read();
				System.in.read();System.in.read();
				Again=Character.toUpperCase(Again);
			}while((Again!='Y')&&(Again!='N'));
		}while(Again=='Y');
	}
}