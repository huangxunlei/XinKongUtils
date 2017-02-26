# 我的个人工具 #

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.huangxunlei:XinKongUtils:1.0'
	}
Share this release:
#### myutils类的说明 ####
| 类名       | 说明           
| :------------- |-------------:
| DisplayUtil      | 常用单位转换工具类 
| DateFormatUtil     | 日期格式转换工具     
| ScreenUtil | 屏幕相关(手机宽高,截屏)  