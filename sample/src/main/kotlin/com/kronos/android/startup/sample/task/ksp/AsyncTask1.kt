package com.kronos.android.startup.sample.task.ksp

import android.content.Context
import com.kronos.android.startup.sample.task.info
import com.kronos.lib.startup.SimpleStartupTask
import com.kronos.startup.annotation.Startup

/**
 *
 *  @Author LiABao
 *  @Since 2021/11/26
 *
 */
@Startup(group = "ksp")
class AsyncTask1 : SimpleStartupTask() {

    override fun mainThread(): Boolean {
        return false
    }

    override fun await(): Boolean {
        return true
    }

    override fun run(context: Context) {
        info("AsyncTask1")
    }
}