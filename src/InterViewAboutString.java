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

		/** 将一串字符串从目标字符串中截取出来，并将你位置颠倒 **/
		/**
		 * 1.使用substring方法截取 2.使用正则表达式截取
		 **/

		System.err.println(sb.reverse().toString());
		System.out.println(src.substring(0, 10));
		/** 用split从“#”字符串的位置开始截取，截取的结果是产生三段对应字符串 **/
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
