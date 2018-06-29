package com.login.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class ARegisterBinding extends ViewDataBinding {
    @NonNull
    public final android.support.design.widget.TextInputEditText etCode;
    @NonNull
    public final android.support.design.widget.TextInputEditText etPassword1;
    @NonNull
    public final android.support.design.widget.TextInputEditText etPassword2;
    @NonNull
    public final android.support.design.widget.TextInputEditText etPhone;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilCode;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilPassword1;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilPassword2;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilPhone;
    @NonNull
    public final android.widget.TextView tvGetCode;
    @NonNull
    public final android.widget.TextView tvRegister;
    // variables
    protected com.login.bean.UserInfo mLoginInfo;
    protected android.view.View.OnClickListener mClick;
    protected ARegisterBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.support.design.widget.TextInputEditText etCode1
        , android.support.design.widget.TextInputEditText etPassword11
        , android.support.design.widget.TextInputEditText etPassword21
        , android.support.design.widget.TextInputEditText etPhone1
        , android.support.design.widget.TextInputLayout tilCode1
        , android.support.design.widget.TextInputLayout tilPassword11
        , android.support.design.widget.TextInputLayout tilPassword21
        , android.support.design.widget.TextInputLayout tilPhone1
        , android.widget.TextView tvGetCode1
        , android.widget.TextView tvRegister1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.etCode = etCode1;
        this.etPassword1 = etPassword11;
        this.etPassword2 = etPassword21;
        this.etPhone = etPhone1;
        this.tilCode = tilCode1;
        this.tilPassword1 = tilPassword11;
        this.tilPassword2 = tilPassword21;
        this.tilPhone = tilPhone1;
        this.tvGetCode = tvGetCode1;
        this.tvRegister = tvRegister1;
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
    public static ARegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ARegisterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ARegisterBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static ARegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ARegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static ARegisterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}