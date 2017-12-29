package googlebook.mlahia.com.googlebook.dagger;

import android.app.Application;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Provides;
import googlebook.mlahia.com.googlebook.data.source.remote.BooksApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by marouanelahia on 27/12/2017.
 */

public class NetworkModule {
    private Application mApplication;

    public NetworkModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }

    @Provides
    BooksApi provideBooksApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.googleapis.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return retrofit.create(BooksApi.class);
    }
}
