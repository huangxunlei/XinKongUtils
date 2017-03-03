# 我的个人工具 #

## 使用方法 ##
1.添加依赖来源

	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
2.添加依赖

	dependencies {
	        compile 'com.github.huangxunlei:XinKongUtils:1.0'
	}

#### 1.myutils包中类的说明 ####
| 类名       | 说明           
| :------------- |-------------:
| DisplayUtil      | 常用单位转换工具类 
| DateFormatUtil     | 日期格式转换工具     
| ScreenUtil | 屏幕相关(手机宽高,截屏)  

#### 2.myadapter包中类的说明 ####
| 类名       | 说明           
| :------------- |-------------:
| MultiRecyclerAdapter      | 实现了添加多种布局的万能Adapter 
| DateFormatUtil     | 日期格式转换工具     
| ScreenUtil | 屏幕相关(手机宽高,截屏)  