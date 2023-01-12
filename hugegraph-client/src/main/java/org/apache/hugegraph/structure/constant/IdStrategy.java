/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.apache.hugegraph.structure.constant;

public enum IdStrategy {

    DEFAULT(0, "default"),

    AUTOMATIC(1, "automatic"),

    PRIMARY_KEY(2, "primary_key"),

    CUSTOMIZE_STRING(3, "customize_string"),

    CUSTOMIZE_NUMBER(4, "customize_number"),

    CUSTOMIZE_UUID(5, "customize_uuid");

    private final byte code;
    private final String name;

    IdStrategy(int code, String name) {
        assert code < 256;
        this.code = (byte) code;
        this.name = name;
    }

    public byte code() {
        return this.code;
    }

    public String string() {
        return this.name;
    }

    public boolean isAutomatic() {
        return this == IdStrategy.AUTOMATIC;
    }

    public boolean isCustomize() {
        return this == IdStrategy.CUSTOMIZE_STRING ||
               this == IdStrategy.CUSTOMIZE_NUMBER ||
               this == IdStrategy.CUSTOMIZE_UUID;
    }

    public boolean isCustomizeString() {
        return this == IdStrategy.CUSTOMIZE_STRING;
    }

    public boolean isCustomizeNumber() {
        return this == IdStrategy.CUSTOMIZE_NUMBER;
    }

    public boolean isCustomizeUuid() {
        return this == IdStrategy.CUSTOMIZE_UUID;
    }

    public boolean isPrimaryKey() {
        return this == IdStrategy.PRIMARY_KEY;
    }
}
