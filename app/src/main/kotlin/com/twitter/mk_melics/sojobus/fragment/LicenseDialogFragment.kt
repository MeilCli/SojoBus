package com.twitter.mk_melics.sojobus.fragment

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.webkit.WebView

class LicenseDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog? {
        var webView = WebView(activity)
        webView.loadUrl("file:///android_asset/license.html")
        return AlertDialog.Builder(activity).setTitle("オープンソースライセンス").setView(webView).create()
    }
}