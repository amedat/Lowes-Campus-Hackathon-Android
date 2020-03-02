package com.justai.aimybox.components

import com.justai.aimybox.Aimybox


interface AimyboxProvider {

    val aimybox: Aimybox

    fun getViewModelFactory() = AimyboxAssistantViewModel.Factory.getInstance(aimybox)
}
