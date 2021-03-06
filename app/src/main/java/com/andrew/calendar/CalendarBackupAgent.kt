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

import android.app.backup.BackupAgentHelper
import android.app.backup.BackupDataInput
import android.app.backup.SharedPreferencesBackupHelper
import android.content.Context
import android.content.SharedPreferences.Editor
import android.os.ParcelFileDescriptor

import java.io.IOException

class CalendarBackupAgent : BackupAgentHelper() {
    override fun onCreate() {
    }

    @Throws(IOException::class)
    override fun onRestore(data: BackupDataInput?, appVersionCode: Int,
                           newState: ParcelFileDescriptor?) {
        super.onRestore(data, appVersionCode, newState)
    }

    companion object {
        const val SHARED_KEY = "shared_pref"
    }
}