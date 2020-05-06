package Fnlo.Test.Httpd;

public class HttpdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = HttpRequest.sendGet("http://www.baidu.com", "");
//		System.out.println(s);
//		String s = HttpRequest.sendPost("http://www.baidu.com", "");
//		System.out.println(s);
		
		
		String host = "127.0.0.1";
		String port = "8080";

//		String s = HttpRequest.sendGet(host, port, "");
		String s = HttpRequest.sendGet("http://127.0.0.1:8080/JavaWebDemo/getRecommandedDBServer", "");
		System.out.println(s);
	}

}
