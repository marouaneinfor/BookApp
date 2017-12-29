package googlebook.mlahia.com.googlebook.data.models;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by marouanelahia on 26/12/2017.
 */


@AutoValue
public abstract class Item implements Parcelable {

    abstract String kind();

    abstract String id();

    abstract String etag();

    abstract String selfLink();

    abstract VolumeInfo volumeInfo();

    abstract SaleInfo saleInfo();

    abstract AccessInfo accessInfo();

    abstract SearchInfo searchInfo();

}