package com.example.enzoteles.arquiteturamvpk.mvp.login;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginComponent;", "", "provideLoginInteractor", "Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginMVP$interactor;", "provideLoginPresenter", "Lcom/example/enzoteles/arquiteturamvpk/mvp/login/OnLoginMVP$presenter;", "app_debug"})
@dagger.Component(modules = {com.example.enzoteles.arquiteturamvpk.mvp.login.LoginModule.class})
public abstract interface OnLoginComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.enzoteles.arquiteturamvpk.mvp.login.OnLoginMVP.presenter provideLoginPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.enzoteles.arquiteturamvpk.mvp.login.OnLoginMVP.interactor provideLoginInteractor();
}