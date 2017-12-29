package googlebook.mlahia.com.googlebook.data.models;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by marouanelahia on 26/12/2017.
 */

@AutoValue
public abstract class SaleInfo implements Parcelable {

    abstract String country();

    abstract String saleability();

    abstract Boolean isEbook();


}