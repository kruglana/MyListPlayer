package com.example.anastasiakruglova.mytestplayer;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Utils {

    private static AlertDialog mDialog = null;

    public static void dismissDialogs() {
        try {
            if (mDialog != null) {
                mDialog.dismiss();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
//
//    public static void showNetworkErrorRetry(Context context, DialogInterface.OnClickListener listener) {
//        dismissDialogs();
//        try {
//            AlertDialog.Builder alert = new AlertDialog.Builder(context);
//            alert.setTitle(R.string.connect_error_title);
//            alert.setMessage(R.string.connect_error);
//            alert.setNegativeButton(R.string.retry, listener);
//            alert.setPositiveButton(R.string.back, listener);
//            alert.setCancelable(false);
//            mDialog = alert.create();
//            mDialog.show();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//    public static void showErrorDialog(Context context, DialogInterface.OnClickListener listener) {
//        dismissDialogs();
//        try {
//            AlertDialog.Builder alert = new AlertDialog.Builder(context);
//            alert.setMessage(R.string.error_string);
//            alert.setNegativeButton(android.R.string.no, listener);
//            alert.setPositiveButton(android.R.string.yes, listener);
//            alert.setCancelable(false);
//            mDialog = alert.create();
//            mDialog.show();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

    public static void showError(Context context, String message) {
        dismissDialogs();
        try {
            AlertDialog.Builder alert = new AlertDialog.Builder(context);
            alert.setMessage(message);
            alert.setPositiveButton(android.R.string.ok, null);
            alert.setCancelable(false);
            mDialog = alert.create();
            mDialog.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
