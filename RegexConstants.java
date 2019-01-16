public class RegexConstants {

	/** 手机号（简单） */
	public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";

	/**
	 * 正则：手机号（精确）
	 * 移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
	 * 联通：130、131、132、145、155、156、175、176、185、186 电信：133、153、173、177、180、181、189
	 * 全球星：1349 虚拟运营商：170
	 */
	public static final String REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";

	/** 电话号码 */
	public static final String REGEX_TEL = "^0\\d{2,3}[- ]?\\d{7,8}";

	/** 身份证号码15位 */
	public static final String REGEX_ID_CARD15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";

	/** 身份证号码18位 */
	public static final String REGEX_ID_CARD18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$";

	/** 邮箱 */
	public static final String REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

	/** URL */
	public static final String REGEX_URL = "[a-zA-z]+://[^\\s]*";

	/** 汉字 */
	public static final String REGEX_ZH = "^[\\u4e00-\\u9fa5]+$";

	/** 用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位 */
	public static final String REGEX_USERNAME = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$";

	/** yyyy-MM-dd格式的日期校验，已考虑平闰年 */
	public static final String REGEX_DATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";

	/** IP地址 */
	public static final String REGEX_IP = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

	/************** 以下摘自http://tool.oschina.net/regex **************/

	/** 双字节字符(包括汉字在内) */
	public static final String REGEX_DOUBLE_BYTE_CHAR = "[^\\x00-\\xff]";

	/** 空白行 */
	public static final String REGEX_BLANK_LINE = "\\n\\s*\\r";

	/** QQ号 */
	public static final String REGEX_TENCENT_NUM = "[1-9][0-9]{4,}";

	/** 中国邮政编码 */
	public static final String REGEX_ZIP_CODE = "[1-9]\\d{5}(?!\\d)";

	/** 正整数 */
	public static final String REGEX_POSITIVE_INTEGER = "^[1-9]\\d*$";

	/** 负整数 */
	public static final String REGEX_NEGATIVE_INTEGER = "^-[1-9]\\d*$";

	/** 整数 */
	public static final String REGEX_INTEGER = "^-?[1-9]\\d*$";

	/** 非负整数(正整数 + 0) */
	public static final String REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";

	/** 非正整数（负整数 + 0） */
	public static final String REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";

	/** 正浮点数 */
	public static final String REGEX_POSITIVE_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";

	/** 负浮点数 */
	public static final String REGEX_NEGATIVE_FLOAT = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$";

	/**** https://www.cnblogs.com/zxin/archive/2013/01/26/2877765.html *******/

	/********************** 校验数字的表达式 **************************/

	/** 1 数字：^[0-9]*$ */
	public static final String REGEX_NUMBER = "^[0-9]*$";

	/** 2 n位的数字：^\d{n}$ */
	public static final String REGEX_N_BIT_NUMBER = "^\\d{n}$";

	/** 3 至少n位的数字：^\d{n,}$ */
	public static final String REGEX_LEAST_N_BIT_NUMBER = "^\\d{n}$";

	/** 4 m-n位的数字：^\d{m,n}$ */
	public static final String REGEX_M_TO_N_NUMBER = "^\\d{m,n}$";

	/** 5 零和非零开头的数字：^(0|[1-9][0-9]*)$ */
	public static final String REGEX_0_OR_NO_0_NUMBER = "^(0|[1-9][0-9]*)$";

	/** 6 非零开头的最多带两位小数的数字：^([1-9][0-9]*)+(.[0-9]{1,2})?$ */
	public static final String REGEX_NO_0_2_DECIMAL_NUMBER = "^([1-9][0-9]*)+(.[0-9]{1,2})?$";

	/** 7 带1-2位小数的正数或负数：^(\-)?\d+(\.\d{1,2})?$ */
	public static final String REGEX_1_OR_2_DECIMAL_NUMBER = "^(\\-)?\\d+(\\.\\d{1,2})?$";

	/** 8 正数、负数、和小数：^(\-|\+)?\d+(\.\d+)?$ */
	public static final String REGEX_P_N_D_NUMBER = "^(\\-|\\+)?\\d+(\\.\\d+)?$";

	/** 9 有两位小数的正实数：^[0-9]+(.[0-9]{2})?$ */
	public static final String REGEX_2_DECIMAL_NUMBER = "^[0-9]+(.[0-9]{2})?$";

	/** 10 有1~3位小数的正实数：^[0-9]+(.[0-9]{1,3})?$ */
	public static final String REGEX_1_TO_3_DECIMAL_NUMBER = "^[0-9]+(.[0-9]{1,3})?$";

	/** 11 非零的正整数：^[1-9]\d*$ 或 ^([1-9][0-9]*){1,3}$ 或 ^\+?[1-9][0-9]*$ */
	public static final String REGEX_NO_0_POSI_NUMBER = "^([1-9][0-9]*){1,3}$";

	/** 12 非零的负整数：^\-[1-9][]0-9"*$ 或 ^-[1-9]\d*$ */
	public static final String REGEX_NO_0_NEGA_NUMBER = "^-[1-9]\\d*$";

	/** 13 非负整数：^\d+$ 或 ^[1-9]\d*|0$ */
	public static final String REGEX_NO_NEGA_NUMBER = "^[1-9]\\d*|0$";

	/** 14 非正整数：^-[1-9]\d*|0$ 或 ^((-\d+)|(0+))$ */
	public static final String REGEX_NO_POSI_NUMBER = "^((-\\d+)|(0+))$";

	/** 15 非负浮点数：^\d+(\.\d+)?$ 或 ^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0$ */
	public static final String REGEX_NO_NEGA_FLOAT_NUMBER = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0$";

	/**
	 * 16 非正浮点数：^((-\d+(\.\d+)?)|(0+(\.0+)?))$ 或
	 * ^(-([1-9]\d*\.\d*|0\.\d*[1-9]\d*))|0?\.0+|0$
	 */
	public static final String REGEX_NO_POSI_FLOAT_NUMBER = "^(-([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*))|0?\\.0+|0$";

	/**
	 * 17 正浮点数：^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$ 或
	 * ^(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$
	 */
	public static final String REGEX_POSI_FLOAT_NUMBER = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";

	/**
	 * 18 负浮点数：^-([1-9]\d*\.\d*|0\.\d*[1-9]\d*)$ 或
	 * ^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$
	 */
	public static final String REGEX_NEGA_FLOAT_NUMBER = "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)))$";

	/** 19 浮点数：^(-?\d+)(\.\d+)?$ 或 ^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$ */
	public static final String REGEX_FLOAT_NUMBER = "^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$";

	/********************** 校验字符的表达式 **************************/

	/** 1 汉字：^[\u4e00-\u9fa5]{0,}$ */
	public static final String REGEX_CHINESE = "^[\\u4e00-\\u9fa5]{0,}$";

	/** 2 英文和数字：^[A-Za-z0-9]+$ 或 ^[A-Za-z0-9]{4,40}$ */
	public static final String REGEX_ENGLISH_AND_NUMBER = "^[A-Za-z0-9]{4,40}$";

	/** 3 长度为3-20的所有字符：^.{3,20}$ */
	public static final String REGEX_3_TO_20_CHAR = "^.{3,20}$";

	/** 4 由26个英文字母组成的字符串：^[A-Za-z]+$ */
	public static final String REGEX_ENGLISH = "^[A-Za-z]+$";

	/** 5 由26个大写英文字母组成的字符串：^[A-Z]+$ */
	public static final String REGEX_CAPS_ENGLISH = "^[A-Z]+$";

	/** 6 由26个小写英文字母组成的字符串：^[a-z]+$ */
	public static final String REGEX_LOW_ENGLISH = "^[a-z]+$";

	/** 7 由数字和26个英文字母组成的字符串：^[A-Za-z0-9]+$ */
	public static final String REGEX_NUMBER_ENGLISH = "^[A-Za-z0-9]+$";

	/** 8 由数字、26个英文字母或者下划线组成的字符串：^\w+$ 或 ^\w{3,20}$ */
	public static final String REGEX_NUMBER_UND_ENGLISH = "^\\w{3,20}$";

	/** 9 中文、英文、数字包括下划线：^[\u4E00-\u9FA5A-Za-z0-9_]+$ */
	public static final String REGEX_CH_NUMBER_UND_ENGLISH = "^[\\u4E00-\\u9FA5A-Za-z0-9_]+$";

	/**
	 * 10 中文、英文、数字但不包括下划线等符号：^[\u4E00-\u9FA5A-Za-z0-9]+$ 或
	 * ^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$
	 */
	public static final String REGEX_CH_NUMBER_ENGLISH_NO_UND = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$";

	/** 11 可以输入含有^%&',;=?$\"等字符：[^%&',;=?$\x22]+ */
	public static final String REGEX_SPECIAL_SYMBOLS = "[^%&',;=?$\\x22]+";

	/** 12 禁止输入含有~的字符：[^~\x22]+ */
	public static final String REGEX_NO_SPECIAL_SYMBOLS = "[^~\\x22]+";

	/********************** 特殊需求表达式 **************************/

	/** 1 Email地址：^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$ */
	public static final String REGEX_EMAIL_2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

	/** 2 域名：[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.? */
	public static final String REGEX_HOST = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(/.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+/.?";

	/**
	 * 3 InternetURL：[a-zA-z]+://[^\s]* 或 ^http://([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$
	 */
	public static final String REGEX_URL_2 = "[a-zA-z]+://[^\\s]* 或 ^http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";

	/**
	 * 4 手机号码：^(13[0-9]|14[0-9]|15[0-9]|16[0-9]|17[0-9]|18[0-9]|19[0-9])\d{8}$
	 * (由于工信部放号段不定时，所以建议使用泛解析 ^([1][3,4,5,6,7,8,9])\d{9}$)
	 */
	public static final String REGEX_PHONE_NUMBER = "^([1][3,4,5,6,7,8,9])\\d{9}$";

	/**
	 * 5
	 * 电话号码("XXX-XXXXXXX"、"XXXX-XXXXXXXX"、"XXX-XXXXXXX"、"XXX-XXXXXXXX"、"XXXXXXX"和"XXXXXXXX)：^(\(\d{3,4}-)|\d{3.4}-)?\d{7,8}$
	 */
	public static final String REGEX_TEL_NUMBER = "^(\\(\\d{3,4}-)|\\d{3.4}-)?\\d{7,8}$";

	/** 6 国内电话号码(0511-4405222、021-87888822)：\d{3}-\d{8}|\d{4}-\d{7} */
	public static final String REGEX_CN_TEL_NUMBER = "\\d{3}-\\d{8}|\\d{4}-\\d{7}";

	/** 7 18位身份证号码(数字、字母x结尾)：^((\d{18})|([0-9x]{18})|([0-9X]{18}))$ */
	public static final String REGEX_ID_CARD = "^((\\d{18})|([0-9x]{18})|([0-9X]{18}))$";

	/** 8 帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)：^[a-zA-Z][a-zA-Z0-9_]{4,15}$ */
	public static final String REGEX_NAME = "^((\\d{18})|([0-9x]{18})|([0-9X]{18}))$";

	/** 9 密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)：^[a-zA-Z]\w{5,17}$ */
	public static final String REGEX_PASSWORD = "^[a-zA-Z]\\w{5,17}$";

	/**
	 * 10
	 * 强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间)：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$
	 * 正确的是：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[\da-zA-Z]{8,10}$
	 */
	public static final String REGEX_PASSWORD_GOOD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[\\da-zA-Z]{8,10}$";

	/** 11 日期格式：^\d{4}-\d{1,2}-\d{1,2} */
	public static final String REGEX_DATA_FORMAT = "^\\d{4}-\\d{1,2}-\\d{1,2}";

	/** 12 一年的12个月(01～09和1～12)：^(0?[1-9]|1[0-2])$ */
	public static final String REGEX_MONTH = "^(0?[1-9]|1[0-2])$";

	/** 13 一个月的31天(01～09和1～31)：^((0?[1-9])|((1|2)[0-9])|30|31)$ */
	public static final String REGEX_DAY = "^((0?[1-9])|((1|2)[0-9])|30|31)$";

	/** 14 钱的输入格式： */

	/**
	 * 15 1.有四种钱的表示形式我们可以接受:"10000.00" 和 "10,000.00", 和没有 "分" 的 "10000" 和
	 * "10,000"：^[1-9][0-9]*$
	 */
	public static final String REGEX_MONEY_1 = "^[1-9][0-9]*$";

	/** 16 2.这表示任意一个不以0开头的数字,但是,这也意味着一个字符"0"不通过,所以我们采用下面的形式：^(0|[1-9][0-9]*)$ */
	public static final String REGEX_MONEY_2 = "^[1-9][0-9]*$";

	/** 17 3.一个0或者一个不以0开头的数字.我们还可以允许开头有一个负号：^(0|-?[1-9][0-9]*)$ */
	public static final String REGEX_MONEY_3 = "^(0|-?[1-9][0-9]*)$";

	/**
	 * 18
	 * 4.这表示一个0或者一个可能为负的开头不为0的数字.让用户以0开头好了.把负号的也去掉,因为钱总不能是负的吧.下面我们要加的是说明可能的小数部分：^[0-9]+(.[0-9]+)?$
	 */
	public static final String REGEX_MONEY_4 = "^[0-9]+(.[0-9]+)?$";

	/**
	 * 19 5.必须说明的是,小数点后面至少应该有1位数,所以"10."是不通过的,但是 "10" 和 "10.2"
	 * 是通过的：^[0-9]+(.[0-9]{2})?$
	 */
	public static final String REGEX_MONEY_5 = "^[0-9]+(.[0-9]{2})?$";

	/** 20 6.这样我们规定小数点后面必须有两位,如果你认为太苛刻了,可以这样：^[0-9]+(.[0-9]{1,2})?$ */
	public static final String REGEX_MONEY_6 = "^[0-9]+(.[0-9]{1,2})?$";

	/**
	 * 21
	 * 7.这样就允许用户只写一位小数.下面我们该考虑数字中的逗号了,我们可以这样：^[0-9]{1,3}(,[0-9]{3})*(.[0-9]{1,2})?$
	 */
	public static final String REGEX_MONEY_7 = "^[0-9]{1,3}(,[0-9]{3})*(.[0-9]{1,2})?$";

	/**
	 * 22 8.1到3个数字,后面跟着任意个
	 * 逗号+3个数字,逗号成为可选,而不是必须：^([0-9]+|[0-9]{1,3}(,[0-9]{3})*)(.[0-9]{1,2})?$
	 */
	public static final String REGEX_MONEY_8 = "^([0-9]+|[0-9]{1,3}(,[0-9]{3})*)(.[0-9]{1,2})?$";

	/**
	 * 23
	 * 备注：这就是最终结果了,别忘了"+"可以用"*"替代如果你觉得空字符串也可以接受的话(奇怪,为什么?)最后,别忘了在用函数时去掉去掉那个反斜杠,一般的错误都在这里
	 */

	/** 24 xml文件：^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$ */
	public static final String REGEX_XML = "^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\\\.[x|X][m|M][l|L]$";

	/** 25 中文字符的正则表达式：[\u4e00-\u9fa5] */
	public static final String REGEX_CHINESE_2 = "[\\u4e00-\\u9fa5]";

	/** 26 双字节字符：[^\x00-\xff] (包括汉字在内，可以用来计算字符串的长度(一个双字节字符长度计2，ASCII字符计1)) */
	public static final String REGEX_DOUBLE_CHAR = "[^\\x00-\\xff]";

	/** 27 空白行的正则表达式：\n\s*\r (可以用来删除空白行) */
	public static final String REGEX_BLANK = "\\n\\s*\\r";

	/**
	 * 28 HTML标记的正则表达式：<(\S*?)[^>]*>.*?</\1>|<.*? />
	 * (网上流传的版本太糟糕，上面这个也仅仅能部分，对于复杂的嵌套标记依旧无能为力)
	 */
	public static final String REGEX_HTML = "<(\\S*?)[^>]*>.*?</\\1>|<.*? />";

	/**
	 * 29 首尾空白字符的正则表达式：^\s*|\s*$或(^\s*)|(\s*$)
	 * (可以用来删除行首行尾的空白字符(包括空格、制表符、换页符等等)，非常有用的表达式)
	 */
	public static final String REGEX_BLANK_HEADER = "^\\s*|\\s*$";

	/** 0 腾讯QQ号：[1-9][0-9]{4,} (腾讯QQ号从10000开始) */
	public static final String REGEX_QQ = "[1-9][0-9]{4,}";

	/** 31 中国邮政编码：[1-9]\d{5}(?!\d) (中国邮政编码为6位数字) */
	public static final String REGEX_ZIP_CODE_2 = "[1-9]\\d{5}(?!\\d)";

	/** 32 IP地址：\d+\.\d+\.\d+\.\d+ (提取IP地址时有用) */
	public static final String REGEX_IP_2 = "[1-9]\\d{5}(?!\\d)";

	/**
	 * 33
	 * IP地址：((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))
	 * (由@飞龙三少 提供,感谢共享)
	 * ((?:(?:25[0-5]|2[0-4]\d|[01]?\d?\d)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d?\d))
	 */
	public static final String REGEX_IP_3 = "((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))";

}
