/*
 * This file is a component of thundr, a software library from 3wks.
 * Read more: http://3wks.github.io/thundr/
 * Copyright (C) 2015 3wks, <thundr@3wks.com.au>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.threewks.gaetools.exception;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 2489531688803100876L;

    public BaseException() {
        super();
    }

    public BaseException(Throwable cause, String format, Object... formatArgs) {
        super(formatArgs.length == 0 ? format : String.format(format, formatArgs), cause);
    }

    public BaseException(String format, Object... formatArgs) {
        super(formatArgs.length == 0 ? format : String.format(format, formatArgs));
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

}
