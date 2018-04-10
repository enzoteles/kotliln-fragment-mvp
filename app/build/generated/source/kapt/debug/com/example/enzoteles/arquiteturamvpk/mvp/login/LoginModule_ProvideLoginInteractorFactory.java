// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.enzoteles.arquiteturamvpk.mvp.login;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class LoginModule_ProvideLoginInteractorFactory
    implements Factory<OnLoginMVP.interactor> {
  private final LoginModule module;

  public LoginModule_ProvideLoginInteractorFactory(LoginModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OnLoginMVP.interactor get() {
    return Preconditions.checkNotNull(
        module.provideLoginInteractor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OnLoginMVP.interactor> create(LoginModule module) {
    return new LoginModule_ProvideLoginInteractorFactory(module);
  }
}
