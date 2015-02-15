/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.cache;

import org.apache.ignite.cache.query.annotations.*;

import java.io.*;

/**
 * Query embedded value.
 */
@SuppressWarnings("unused")
public class GridCacheQueryEmbeddedValue implements Serializable {
    /** Query embedded field. */
    @QuerySqlField
    private int embeddedField1 = 55;

    /** Query embedded field. */
    @QuerySqlField(groups = {"grp1"})
    private int embeddedField2 = 11;

    /** */
    @QuerySqlField
    private Val embeddedField3 = new Val();

    /**
     */
    @SuppressWarnings("PublicInnerClass")
    public static class Val implements Serializable {
        /** */
        @QuerySqlField
        private Long x = 3L;
    }
}
