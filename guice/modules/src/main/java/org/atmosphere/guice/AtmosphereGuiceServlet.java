/*
 * Copyright 2013 Jeanfrancois Arcand
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.guice;

import com.google.inject.Singleton;
import org.atmosphere.cpr.AtmosphereServlet;

/**
 * Google Guice Integration. The difference between this class and the {@link AtmosphereGuiceServlet} is you don't need
 * to define it in web.xml and instead use a pure Guice web.xml file.
 */
@Singleton
public class AtmosphereGuiceServlet extends AtmosphereServlet {
    public static final String PROPERTIES = GuiceObjectFactory.class.getName() + ".properties";

    public AtmosphereGuiceServlet() {
        this(false,true);
    }

    public AtmosphereGuiceServlet(boolean isFilter, boolean autoDetectHandlers) {
        super(isFilter, autoDetectHandlers);
    }
}
