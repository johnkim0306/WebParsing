import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
	
	public static void main(String[] args) throws Exception {
		String target = "https://vsb.my.ucalgary.ca/criteria.jsp?access=0&lang=en&tip=0&page=results&scratch=0&advice=0&term=32191&sort=none&filters=iiiiiiiii&bbs=&ds=&cams=MAIN_OFF&locs=any&isrts=&course_0_0=CPSC-329&sa_0_0=&cs_0_0=UCALG--2191_11581-11657-&cpn_0_0=&csn_0_0=&ca_0_0=&dropdown_0_0=kp_UCALG--2191_11581-11657-&ig_0_0=0&rq_0_0=&course_1_0=ECON-203&sa_1_0=&cs_1_0=UCALG--2191_11053-12850-&cpn_1_0=&csn_1_0=&ca_1_0=&dropdown_1_0=kp_UCALG--2191_11053-12850-&ig_1_0=0&rq_1_0=&course_2_0=CPSC-481&sa_2_0=&cs_2_0=UCALG--2191_12212-12215-&cpn_2_0=&csn_2_0=&ca_2_0=&dropdown_2_0=kp_UCALG--2191_12212-12215-&ig_2_0=0&rq_2_0=&course_3_0=ECON-353&sa_3_0=&cs_3_0=UCALG--2191_15216--&cpn_3_0=&csn_3_0=&ca_3_0=&dropdown_3_0=kp_UCALG--2191_15216--&ig_3_0=0&rq_3_0=";
		HttpURLConnection con = (HttpURLConnection) new URL (target).openConnection();
		BufferedReader br = new BufferedReader (new InputStreamReader(con.getInputStream(), "UTF-8"));
		String temp;
		while ((temp = br.readLine()) != null) {
			System.out.println(temp);
		}
		con.disconnect();
		br.close();
	}

}
