package googlebook.mlahia.com.googlebook.data.models;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by marouanelahia on 26/12/2017.
 */
@AutoValue
public abstract class IndustryIdentifier implements Parcelable {

    abstract String type();

    abstract String identifier();


}