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

package com.liulishuo.okdownload.core.file;

/**
 * @ClassName CustomProcessFileStrategy
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/12/30 17:01
 * @Version 1.0
 */

import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.breakpoint.DownloadStore;

/**
 * 来自 @see <a href="https://github.com/lingochamp/okdownload/issues/415">okdownload#415</a>
 * 用于解决 The current offset on block-info isn't update correct, 58953018 != 69212754 on 0
 */
public class ExtProcessFileStrategy extends ProcessFileStrategy {

    @Override
    public MultiPointOutputStream createProcessStream(DownloadTask task, BreakpointInfo info, DownloadStore store) {
        return new ExtMultiPointOutputStream(task, info, store);
    }
}