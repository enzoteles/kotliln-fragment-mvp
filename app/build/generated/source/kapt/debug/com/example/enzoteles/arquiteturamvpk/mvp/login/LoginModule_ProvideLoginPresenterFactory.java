// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.enzoteles.arquiteturamvpk.mvp.login;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class LoginModule_ProvideLoginPresenterFactory
    implements Factory<OnLoginMVP.presenter> {
  private final LoginModule module;

  public LoginModule_ProvideLoginPresenterFactory(LoginModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OnLoginMVP.presenter get() {
    return Preconditions.checkNotNull(
        module.provideLoginPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OnLoginMVP.presenter> create(LoginModule module) {
    return new LoginModule_ProvideLoginPresenterFactory(module);
  }
}