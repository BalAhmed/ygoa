package tr.edu.medipol.yazılımort;
import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		String hatalimetin = "M e d ip o            l";
		System.out.println("Hatalı metin" + hatalimetin);
		
		String duzgunMetin = StringUtils.deleteWhitespace(hatalimetin);
		
		System.out.println("duzgunmetin" + duzgunMetin);

	}

}
