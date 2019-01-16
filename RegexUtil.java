import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import RegexConstants.*;


public class RegexUtil {

	private RegexUtil() {}

	/**
	 * 判断是否匹配正则
	 *
	 * @param regex 正则表达式
	 * @param input 要匹配的字符串
	 * @return {@code true}: 匹配
	 *         {@code false}: 不匹配
	 */
	public static boolean isMatch(String regex, CharSequence input) {
		return input != null && input.length() > 0 && Pattern.matches(regex, input);
	}

	/**
	 * 获取正则匹配的部分
	 *
	 * @param regex 正则表达式
	 * @param input 要匹配的字符串
	 * @return 正则匹配的部分
	 */
	public static List<String> getMatches(String regex, CharSequence input) {
		if (input == null)
			return null;
		List<String> matches = new ArrayList<>();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			matches.add(matcher.group());
		}
		return matches;
	}

	/**
	 * 获取正则匹配分组
	 *
	 * @param input 要分组的字符串
	 * @param regex 正则表达式
	 * @return 正则匹配分组
	 */
	public static String[] getSplits(String input, String regex) {
		if (input == null)
			return null;
		return input.split(regex);
	}

	/**
	 * 替换正则匹配的第一部分
	 *
	 * @param input       要替换的字符串
	 * @param regex       正则表达式
	 * @param replacement 代替者
	 * @return 替换正则匹配的第一部分
	 */
	public static String getReplaceFirst(String input, String regex, String replacement) {
		if (input == null)
			return null;
		return Pattern.compile(regex).matcher(input).replaceFirst(replacement);
	}

	/**
	 * 替换所有正则匹配的部分
	 *
	 * @param input       要替换的字符串
	 * @param regex       正则表达式
	 * @param replacement 代替者
	 * @return 替换所有正则匹配的部分
	 */
	public static String getReplaceAll(String input, String regex, String replacement) {
		if (input == null)
			return null;
		return Pattern.compile(regex).matcher(input).replaceAll(replacement);
	}
}
