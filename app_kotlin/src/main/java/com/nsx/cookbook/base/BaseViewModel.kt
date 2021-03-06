package com.nsx.cookbook.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.addTo
import android.arch.lifecycle.ViewModel

/**
 * 通用功能.RxJava取消订阅，记住 Rx流必须 bind()
 */
abstract class BaseViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()

    protected fun Disposable.bind() {
        addTo(compositeDisposable)
    }

    override fun onCleared() {
        compositeDisposable.dispose()
    }
}
