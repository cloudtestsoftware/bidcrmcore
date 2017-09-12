package cms.service.test;

import cms.service.util.Base64Util;

public class GenerateToken {

	public GenerateToken() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 // String url="https://www.biderp.com/bidcrm/portal?servicekey=";
		 String url="http://localhost:8080/bidcrm/portal?servicekey=";
	  //for regular key without campaign id as 4th element
	  //String val="sjana@cloudtestsoftware.com;srijit96;training";
	  
	  //for campaign as with campaign id
	  // String val="sam@asahi.com;sam;sampleportal-campaignid";
	  String val="admin@biderp.com;sa$784;sampleportal-562018714A146C18E050960A6B3A3B51";
		try {
			System.out.println(val);
			String  token=new String(Base64Util.encode(val.getBytes()));
			System.out.println(token.toString());
			System.out.println("url="+url+token.toString());
			String decript=new String(Base64Util.decode(token.getBytes()));
			System.out.println(decript.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
