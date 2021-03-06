/*
** Copyright 2021, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** See the License for the specific language governing permissions and
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** limitations under the License.
*/
package com.andrew.calendar

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle

class GoogleCalendarUriIntentFilter : Activity() {
    protected override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        val intent: Intent = getIntent()
        if (intent != null) {
            // Pass it on to the next Activity.
            try {
                startNextMatchingActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                // no browser installed? Just drop it.
            }
        }
        finish()
    }
}