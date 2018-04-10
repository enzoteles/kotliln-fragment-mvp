package com.example.enzoteles.arquiteturamvpk.mvp.login;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginMVP;", "", "interactor", "presenter", "view", "app_debug"})
public abstract interface OnLoginMVP {
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginMVP$view;", "", "logoAlphaAndRotation", "", "logo", "Landroid/widget/ImageView;", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface view {
        
        public abstract void logoAlphaAndRotation(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView logo, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginMVP$presenter;", "", "callPresenter", "", "login", "", "password", "errorAuthentication", "showAddFragment", "app_debug"})
    public static abstract interface presenter {
        
        public abstract void callPresenter(@org.jetbrains.annotations.NotNull()
        java.lang.String login, @org.jetbrains.annotations.NotNull()
        java.lang.String password);
        
        public abstract void showAddFragment();
        
        public abstract void errorAuthentication();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginMVP$interactor;", "", "validationLogin", "", "login", "", "password", "app_debug"})
    public static abstract interface interactor {
        
        public abstract void validationLogin(@org.jetbrains.annotations.NotNull()
        java.lang.String login, @org.jetbrains.annotations.NotNull()
        java.lang.String password);
    }
}