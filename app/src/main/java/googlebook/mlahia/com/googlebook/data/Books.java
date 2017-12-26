package googlebook.mlahia.com.googlebook.data;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

import java.util.List;

/**
 * Created by marouanelahia on 26/12/2017.
 */
@AutoValue
public abstract class Books implements Parcelable {

    abstract String kind();

    abstract Integer totalItems();

    abstract List<Item> items();

}