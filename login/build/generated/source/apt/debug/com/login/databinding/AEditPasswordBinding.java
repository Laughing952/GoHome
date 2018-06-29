package com.login.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
public abstract class AEditPasswordBinding extends ViewDataBinding {
    @NonNull
    public final android.support.design.widget.TextInputEditText etEditPasswordCode;
    @NonNull
    public final android.support.design.widget.TextInputEditText etEditPasswordOldPassword;
    @NonNull
    public final android.support.design.widget.TextInputEditText etEditPasswordPassword1;
    @NonNull
    public final android.support.design.widget.TextInputEditText etEditPasswordPassword2;
    @NonNull
    public final android.support.design.widget.TextInputEditText etEditPasswordPhone;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilEditPasswordCode;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilEditPasswordOldPassword;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilEditPasswordPassword1;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilEditPasswordPassword2;
    @NonNull
    public final android.support.design.widget.TextInputLayout tilEditPasswordPhone;
    @NonNull
    public final android.widget.TextView tvEditPasswordCommit;
    @NonNull
    public final android.widget.TextView tvEditPasswordGetCode;
    // variables
    protected com.login.bean.UserInfo mLoginInfo;
    protected android.view.View.OnClickListener mClick;
    protected AEditPasswordBinding(@Nullable android.databinding.DataBindingComponent bindingComponent, @Nullable android.view.View root_, int localFieldCount
        , android.support.design.widget.TextInputEditText etEditPasswordCode1
        , android.support.design.widget.TextInputEditText etEditPasswordOldPassword1
        , android.support.design.widget.TextInputEditText etEditPasswordPassword11
        , android.support.design.widget.TextInputEditText etEditPasswordPassword21
        , android.support.design.widget.TextInputEditText etEditPasswordPhone1
        , android.support.design.widget.TextInputLayout tilEditPasswordCode1
        , android.support.design.widget.TextInputLayout tilEditPasswordOldPassword1
        , android.support.design.widget.TextInputLayout tilEditPasswordPassword11
        , android.support.design.widget.TextInputLayout tilEditPasswordPassword21
        , android.support.design.widget.TextInputLayout tilEditPasswordPhone1
        , android.widget.TextView tvEditPasswordCommit1
        , android.widget.TextView tvEditPasswordGetCode1
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.etEditPasswordCode = etEditPasswordCode1;
        this.etEditPasswordOldPassword = etEditPasswordOldPassword1;
        this.etEditPasswordPassword1 = etEditPasswordPassword11;
        this.etEditPasswordPassword2 = etEditPasswordPassword21;
        this.etEditPasswordPhone = etEditPasswordPhone1;
        this.tilEditPasswordCode = tilEditPasswordCode1;
        this.tilEditPasswordOldPassword = tilEditPasswordOldPassword1;
        this.tilEditPasswordPassword1 = tilEditPasswordPassword11;
        this.tilEditPasswordPassword2 = tilEditPasswordPassword21;
        this.tilEditPasswordPhone = tilEditPasswordPhone1;
        this.tvEditPasswordCommit = tvEditPasswordCommit1;
        this.tvEditPasswordGetCode = tvEditPasswordGetCode1;
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
    public static AEditPasswordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AEditPasswordBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AEditPasswordBinding bind(@NonNull android.view.View view) {
        return null;
    }
    @NonNull
    public static AEditPasswordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static AEditPasswordBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
    @NonNull
    public static AEditPasswordBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return null;
    }
}