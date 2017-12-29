package googlebook.mlahia.com.googlebook.data.source.remote;

import googlebook.mlahia.com.googlebook.data.models.Books;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by marouanelahia on 27/12/2017.
 */

public interface BooksApi {
    @GET("books/v1/volumes")
    Observable<Books> getBooks(@Query("q") String searchTerms, @Query("startIndex") int startIndex, @Query("maxResults") int maxResults);

}
