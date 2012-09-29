/*
 * Copyright (c) 2009, 2010, 2011, 2012, B3log Team
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
package org.b3log.latke.testhelper;

import java.util.Date;

import org.b3log.latke.servlet.annotation.PathVariable;

/**
 * Mockservice,for dispatch UT.
 * @author <a href="mailto:wmainlove@gmail.com">Love Yao</a>
 * @version 1.0.0.1, Sep 3, 2012
 */
public class MockService {

    /**
     * getString.
     * @return a String
     */
    public String getString() {
        return "string";
    }

    /**
     * getString1.
     * @param id id
     * @param name name
     * @return a String
     */
    public String getString1(final Integer id, final String name) {
        return id
                + name;
    }

    /**
     * getString2.
     * @param name name
     * @param password password
     * @return a String
     */
    public String getString2(@PathVariable("password") final String name, @PathVariable("name") final String password) {
        return name
                + password;
    }

    /**
     * getString2.
     * @param id id 
     * @param date data
     * @return string
     */
    public String getString2(final Integer id, final Date date) {
        return ""
                + id + date.getTime();
    }

}