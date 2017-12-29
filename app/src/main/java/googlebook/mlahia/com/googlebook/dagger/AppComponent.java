package googlebook.mlahia.com.googlebook.dagger;

import javax.inject.Singleton;

import dagger.Component;
import googlebook.mlahia.com.googlebook.BasePresenter;

/**
 * Created by marouanelahia on 27/12/2017.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface AppComponent {
    void inject(BasePresenter BasePresenter);
}
