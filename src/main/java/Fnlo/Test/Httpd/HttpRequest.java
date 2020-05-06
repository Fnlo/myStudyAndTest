package Fnlo.Test.Httpd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpRequest {

	public static String sendPost(String host, String port, String param) {
		return sendPost("http://" + host + ":" + port, param);
	}
	
	public static String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// open connection 
			URLConnection conn = realUrl.openConnection();
			// set property
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// send post need these:
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// get outputStream
			out = new PrintWriter(conn.getOutputStream());
			// send param
			out.print(param);
			// flush
			out.flush();
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			
		} catch (Exception e) {
			System.out.println("send POST to " + url + " error, throws " + e);
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
			}
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
			}
		}
		return result;
	}
	
	public static String sendGet(String host, String port, String param) {
		return sendGet("http://" + host + ":" + port, param);
	}

	public static String sendGet(String url, String param) {
		BufferedReader in = null;
		String result = "";
		String urlNameString = "";
		try {
			urlNameString = url;
			if (param != null && !param.isEmpty()) {
				urlNameString += "?" + param;
			}
			URL realUrl = new URL(urlNameString);
			// open connection 
			URLConnection conn = realUrl.openConnection();
			// set property
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// connect
			conn.connect();
			// get all response header
			Map<String, List<String>> map = conn.getHeaderFields();
//			for(String key : map.keySet()) {
//				System.out.println(key + "--->" + map.get(key));
//			}
			// read response
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			
		} catch (Exception e) {
			System.out.println("send GET to " + urlNameString + " error, throws " + e);
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
			}
		}
		return result;
	}
	
}
