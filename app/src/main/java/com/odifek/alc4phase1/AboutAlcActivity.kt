package com.odifek.alc4phase1

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.odifek.alc4phase1.databinding.ActivityAboutAlcBinding

class AboutAlcActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutAlcBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_alc)

        setSupportActionBar(binding.toolbar)
        binding.webviewAboutAlc.settings.javaScriptEnabled = true
        binding.webviewAboutAlc.webViewClient = object : WebViewClient() {

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                binding.progressBar.isVisible = true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.progressBar.isVisible = false
            }

            override fun onReceivedSslError(
                view: WebView?,
                handler: SslErrorHandler?,
                error: SslError?
            ) {
                val builder = AlertDialog.Builder(this@AboutAlcActivity)
                builder.setMessage(R.string.notification_invalid_ssl)
                builder.setPositiveButton(R.string.okay) { dialog, _ ->
                    handler?.proceed()
                    dialog.dismiss()
                }
                builder.setNegativeButton(android.R.string.cancel) { _, _ ->
                    handler?.cancel()
                    finish()
                }
                builder.create().show()
            }
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.webviewAboutAlc.loadUrl("https://andela.com/alc/")
    }
}
