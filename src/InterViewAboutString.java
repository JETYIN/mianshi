import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterViewAboutString {

	public static void main(String[] args) {
		String src = "hsb#sdajb3uebndb#aj34";
		String regexSrc;
		String target = "([#].{0,}?[#])";

		String reverSrc = "abcd";

		Pattern pattern = Pattern.compile(target);
		Matcher matcher = pattern.matcher(src);
		StringBuffer sb = new StringBuffer(reverSrc);

		/** ��һ���ַ�����Ŀ���ַ����н�ȡ������������λ�õߵ� **/
		/**
		 * 1.ʹ��substring������ȡ 2.ʹ��������ʽ��ȡ
		 **/

		System.err.println(sb.reverse().toString());
		System.out.println(src.substring(0, 10));
		/** ��split�ӡ�#���ַ�����λ�ÿ�ʼ��ȡ����ȡ�Ľ���ǲ������ζ�Ӧ�ַ��� **/
		String splitSrc[] = src.split("#");
		for (int i = 0; i < splitSrc.length; i++) {
			System.out.println(splitSrc[i]);

		}
		System.out.println("000000000000000000000");
		while (matcher.find()) {
			regexSrc = matcher.group();
			System.out.println(regexSrc);
		}
	}

}
