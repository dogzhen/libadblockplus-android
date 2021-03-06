/*
 * This file is part of Adblock Plus <https://adblockplus.org/>,
 * Copyright (C) 2006-present eyeo GmbH
 *
 * Adblock Plus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as
 * published by the Free Software Foundation.
 *
 * Adblock Plus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Adblock Plus.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.adblockplus.libadblockplus.tests;

import org.adblockplus.libadblockplus.AppInfo;
import org.adblockplus.libadblockplus.FilterEngine;
import org.adblockplus.libadblockplus.JsEngine;
import org.adblockplus.libadblockplus.MockWebRequest;
import org.adblockplus.libadblockplus.Platform;
import org.adblockplus.libadblockplus.WebRequest;

import android.test.AndroidTestCase;

public class UpdaterTest extends BaseFilterEngineTest
{
  protected MockWebRequest mockWebRequest;

  @Override
  protected void setUp() throws Exception
  {
    AppInfo appInfo = AppInfo
      .builder()
      .setName("test")
      .setVersion("1.0.1")
      .build();
    mockWebRequest = new MockWebRequest();
    platform = new Platform(null, mockWebRequest,
        getContext().getFilesDir().getAbsolutePath());
    platform.setUpJsEngine(appInfo);
    filterEngine = platform.getFilterEngine();
  }
}
