package googlebook.mlahia.com.googlebook.data;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by marouanelahia on 26/12/2017.
 */
@AutoValue
public abstract class Pdf implements Parcelable {

    abstract Boolean isAvailable();


}