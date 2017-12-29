package googlebook.mlahia.com.googlebook.data.models;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by marouanelahia on 26/12/2017.
 */


@AutoValue
public abstract class SearchInfo implements Parcelable {

    abstract String textSnippet();
}