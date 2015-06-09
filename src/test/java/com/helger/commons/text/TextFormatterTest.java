/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
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
package com.helger.commons.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.helger.commons.text.util.TextHelper;

/**
 * Test class for class {@link TextHelper}.
 * 
 * @author Philip Helger
 */
public final class TextFormatterTest
{
  @Test
  public void test ()
  {
    assertEquals ("a", TextHelper.getFormattedText ("a", (Object []) null));
    assertEquals ("a", TextHelper.getFormattedText ("a", new Object [0]));
    assertEquals ("a{0}", TextHelper.getFormattedText ("a{0}", new Object [0]));
    assertEquals ("anull", TextHelper.getFormattedText ("a{0}", (Object) null));
    assertEquals ("ab", TextHelper.getFormattedText ("a{0}", "b"));
    assertEquals ("ab{1}", TextHelper.getFormattedText ("a{0}{1}", "b"));
    assertEquals ("anull{1}", TextHelper.getFormattedText ("a{0}{1}", (Object) null));
    assertNull (TextHelper.getFormattedText ((String) null, "b"));
  }
}
