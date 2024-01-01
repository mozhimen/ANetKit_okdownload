/*
 * Copyright (c) 2018 LingoChamp Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liulishuo.okdownload.core;

/**
 * @ClassName OkDownloadExt
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/30 17:02
 * @Version 1.0
 */

import android.content.Context;

import com.liulishuo.okdownload.OkDownload;
import com.liulishuo.okdownload.core.file.ExtProcessFileStrategy;

/**
 * 用于快速解决使用okdownload时的一些问题
 * 解决办法来自issues
 * @see <a href="https://github.com/xiandanin/okdownload-ext">xiandanin/okdownload-ext</a>
 */
public final class ExtOkDownload {
    public static void fix415Bug(Context context) {
        OkDownload.setSingletonInstance(
                new OkDownload.Builder(context)
                        .processFileStrategy(new ExtProcessFileStrategy())
                        .build()
        );
    }
}