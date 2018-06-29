package com.login.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ALoginBinding extends ViewDataBinding {
    @NonNull
    public final android.support.design.widget.TextInputEditText etPassword;
    @NonNull
    public final android.support.design.widget.TextInputEditText etPhone;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilPassword;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilPhone;
    @NonNull
    public final android.widget.TextView tvChangePassword;
    @NonNull
    public final android.widget.TextView tvForgetPassword;
    @NonNull
    public final android.widget.TextView tvGoRegister;
    @NonNull
    public final android.widget.TextView tvLogin;
    // variables
    protected com.login.bean.UserInfo mLoginInfo;
    protected android.view.View.OnClickListener mClick;
    protected ALoginBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.support.design.widget.TextInputEditText etPassword1
        , android.support.design.widget.TextInputEditText etPhone1
        , android.support.design.widget.TextInputLayout tilPassword1
        , android.support.design.widget.TextInputLayout tilPhone1
        , android.widget.TextView tvChangePassword1
        , android.widget.TextView tvForgetPassword1
        , android.widget.TextView tvGoRegister1
        , android.widget.TextView tvLogin1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.etPassword = etPassword1;
        this.etPhone = etPhone1;
        this.tilPassword = tilPassword1;
        this.tilPhone = tilPhone1;
        this.tvChangePassword = tvChangePassword1;
        this.tvForgetPassword = tvForgetPassword1;
        this.tvGoRegister = tvGoRegister1;
        this.tvLogin = tvLogin1;
    }
    //getters and abstract setters
    public abstract void setLoginInfo(@Nullable com.login.bean.UserInfo LoginInfo);
    @Nullable
    public com.login.bean.UserInfo getLoginInfo() {
        return mLoginInfo;
    }
    public abstract void setClick(@Nullable android.view.View.OnClickListener Click);
    @Nullable
    public android.view.View.OnClickListener getClick() {
        return mClick;
    }
    @NonNull
    public static ALoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ALoginBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ALoginBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ALoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ALoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ALoginBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}