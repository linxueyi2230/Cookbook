package com.nsx.cookbook.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nsx.cookbook.di.applicationKodein
import com.nsx.cookbook.utils.logInfo
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.KodeinContext
import org.kodein.di.TT

abstract class BaseActivity : AppCompatActivity(), KodeinAware {
    override val kodein: Kodein = applicationKodein

    @Suppress("LeakingThis")
    override val kodeinContext: KodeinContext<*> = KodeinContext(TT(javaClass), this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logInfo { "---------onCreate" }
    }

    override fun onResume() {
        super.onResume()
        logInfo { "---------onResume" }
    }

    override fun onDestroy() {
        super.onDestroy()
        logInfo { "---------onDestroy" }
    }

    override fun onRestart() {
        super.onRestart()
        logInfo { "---------onRestart" }
    }
}