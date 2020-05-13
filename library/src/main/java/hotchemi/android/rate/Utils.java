package hotchemi.android.rate;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

final class Utils {

    private Utils() {
    }



    static boolean isLollipop() {
        return Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP || Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP_MR1;
    }

    static int getDialogTheme() {
        return isLollipop() ? R.style.CustomLollipopDialogStyle : 0;
    }

    @SuppressLint("NewApi")
    static MaterialAlertDialogBuilder getDialogBuilder(Context context) {
            return new MaterialAlertDialogBuilder(context, R.style.MaterialAlertDialog_Rounded);
        }

}
