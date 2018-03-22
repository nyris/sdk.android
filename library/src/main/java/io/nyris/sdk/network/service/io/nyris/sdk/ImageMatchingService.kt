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
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.HeaderMap
import retrofit2.http.POST
import retrofit2.http.Url

/**
 * ImageMatchingService.kt - http interface of Image Matching Service
 *
 * @author Sidali Mellouk
 * Created by nyris GmbH
 * Copyright © 2018 nyris GmbH. All rights reserved.
 */
internal interface ImageMatchingService {
    /**
     * Http Post Match image byte Array
     *
     * @param url the url
     * @param headers the headers
     * @param body the body
     * @return the Single Response Body
     */
    @POST
    fun match(@Url url : String, @HeaderMap headers : Map<String, String>,
                       @Body body : RequestBody): Single<ResponseBody>

    /**
     * http Post Match image byte Array
     *
     * @param url the url
     * @param headers the headers
     * @param body the body
     * @return the Single Response Offer Response Body
     */
    @POST
    fun matchAndGetRequestId(@Url url : String, @HeaderMap headers : Map<String, String>,
                                   @Body body : RequestBody): Single<Response<OfferResponseBody>>
}