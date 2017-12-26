package googlebook.mlahia.com.googlebook.data;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by marouanelahia on 26/12/2017.
 */
@AutoValue
public abstract class AccessInfo implements Parcelable {

    abstract String country();

    abstract String viewability();

    abstract Boolean embeddable();

    abstract Boolean publicDomain();

    abstract String textToSpeechPermission();

    abstract Epub epub();

    abstract Pdf pdf();

    abstract String webReaderLink();

    abstract String accessViewStatus();

    abstract Boolean quoteSharingAllowed();

}
