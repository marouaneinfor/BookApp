package googlebook.mlahia.com.googlebook.data.source.remote;

import googlebook.mlahia.com.googlebook.data.models.Books;
import googlebook.mlahia.com.googlebook.data.source.BooksDataSource;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by marouanelahia on 22/12/2017.
 */

public class BooksRemoteDataSource implements BooksDataSource {
   private BooksApi booksApi;

    public BooksRemoteDataSource(BooksApi booksApi) {
        this.booksApi = booksApi;
    }

    public Observable<Books> getBooks(int position){
        final String searchTerms = "";
        return  booksApi.getBooks(searchTerms,position,40)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}

