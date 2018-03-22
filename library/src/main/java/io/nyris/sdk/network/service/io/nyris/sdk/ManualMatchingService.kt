/*
 * Copyright (C) 2018 nyris GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nyris.sdk

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.HeaderMap
import retrofit2.http.POST
import retrofit2.http.Url

/**
 * ManualMatchingService.kt - http interface of Manual Matching Service
 *
 * @author Sidali Mellouk
 * Created by nyris GmbH
 * Copyright © 2018 nyris GmbH. All rights reserved.
 */
internal interface ManualMatchingService {
    /**
     * Http Post Mark For Manual Match
     *
     * @param url the url
     * @param headers the headers
     * @return the Single ResponseBody
     */
    @POST
    fun markForManualMatch(@Url url : String, @HeaderMap headers : Map<String, String>): Single<ResponseBody>
}