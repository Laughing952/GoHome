package com.login.help;

import android.support.annotation.CheckResult;

import com.waterbase.utile.StrUtil;

/**
 * 校验的帮助类
 * Created by Water on 2018/3/26.
 */

public class CheckHelp {

    /**
     * 密码格式校验
     *
     * @param psw 密码
     */
    public static CheckResult checkPassword(String psw) {
        CheckResult result = new CheckResult();
        if (psw.matches("^[a-zA-Z0-9]{6,20}$")) {
            result.isSucceed = true;
        }
//        if (psw.matches("^.*[a-zA-Z]+.*$") && psw.matches("^.*[0-9]+.*$")
//                && psw.matches("^.*[/^/$/.//,;:'!@#%&/*/|/?/-/_/+/(/)/[/]/{/}]+.*$")) {
//            result.isSucceed = true;
//        }
        else {
            result.isSucceed = false;
            result.msg = "密码必须包含数字字母特殊字符";
        }


//        if(psw ==null||psw.isEmpty())
//    result.msg ="密码不能为空";
//        else if(psw.length() < 6)
//    result.msg ="密码你能少于6位";
//        else if(psw.length()>16)
//    result.msg ="密码你能超过16位";
//        else
//    result.isSucceed =true;
        return result;
    }

    /**
     * 手机号码校验
     *
     * @param phoneNum
     * @return
     */
    public static CheckResult checkPhoneNum(String phoneNum) {
        CheckResult result = new CheckResult();
        if (phoneNum == null || phoneNum.isEmpty() || !StrUtil.isMobileNo(phoneNum))
            result.msg = "请输入正确的手机号码";
        else
            result.isSucceed = true;
        return result;
    }

    public static class CheckResult {
        public boolean isSucceed; // 是否成功
        public String msg; // 失败原因
    }

}
