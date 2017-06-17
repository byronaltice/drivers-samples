/*
 * Copyright 2016, The Android Open Source Project
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

package com.example.androidthings.driversamples

import android.os.Build

object BoardDefaults {
    private val DEVICE_EDISON = "edison"
    private val DEVICE_JOULE = "joule"
    private val DEVICE_RPI3 = "rpi3"
    private val DEVICE_IMX6UL_PICO = "imx6ul_pico"
    private val DEVICE_IMX6UL_VVDN = "imx6ul_iopb"
    private val DEVICE_IMX7D_PICO = "imx7d_pico"
    /**
     * Return the preferred I2C port for each board.
     */
    // same for Edison Arduino breakout and Edison SOM
    val spiPort: String
        get() {
            when (Build.DEVICE) {
                DEVICE_EDISON -> return "SPI2"
                DEVICE_JOULE -> return "SPI0.0"
                DEVICE_RPI3 -> return "SPI0.0"
                DEVICE_IMX6UL_PICO -> return "SPI3.0"
                DEVICE_IMX6UL_VVDN -> return "SPI1.0"
                DEVICE_IMX7D_PICO -> return "SPI3.1"
                else -> throw IllegalStateException("Unknown Build.DEVICE " + Build.DEVICE)
            }
        }
}