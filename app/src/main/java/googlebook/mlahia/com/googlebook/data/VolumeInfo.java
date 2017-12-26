package googlebook.mlahia.com.googlebook.data;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

import java.util.List;

/**
 * Created by marouanelahia on 26/12/2017.
 */

@AutoValue
public abstract class VolumeInfo implements Parcelable {

    abstract String title();

    abstract List<String> authors();

    abstract String publisher();

    abstract String publishedDate();

    abstract String description();

    abstract List<IndustryIdentifier> industryIdentifiers();

    abstract ReadingModes readingModes();

    abstract Integer pageCount();

    abstract String printType();

    abstract List<String> categories();

    abstract Double averageRating();

    abstract Integer ratingsCount();

    abstract String maturityRating();

    abstract Boolean allowAnonLogging();

    abstract String contentVersion();

    abstract ImageLinks imageLinks();

    abstract String language();

    abstract String previewLink();

    abstract String infoLink();

    abstract String canonicalVolumeLink();

}