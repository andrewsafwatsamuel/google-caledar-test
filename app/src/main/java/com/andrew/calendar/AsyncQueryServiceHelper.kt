/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.andrew.calendar

import android.app.IntentService
import android.content.ContentProviderOperation
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.OperationApplicationException
import android.database.Cursor
import android.net.Uri
import android.os.Handler
import android.os.Message
import android.os.RemoteException
import android.os.SystemClock
import android.util.Log
import java.util.ArrayList
import java.util.Arrays
import java.util.Iterator
import java.util.PriorityQueue
import java.util.concurrent.Delayed
import java.util.concurrent.TimeUnit

class AsyncQueryServiceHelper : IntentService {
    constructor(name: String?) : super(name) {}
    constructor() : super("AsyncQueryServiceHelper") {}

    protected override fun onHandleIntent(intent: Intent?) {
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    companion object {
        private const val TAG = "AsyncQuery"
    }
}