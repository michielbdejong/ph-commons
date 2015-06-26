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
package com.helger.commons.compare;

import java.util.Comparator;

import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * A {@link Comparator} for {@link Comparable} objects that can handle
 * <code>null</code> values.
 *
 * @author Philip Helger
 * @param <DATATYPE>
 *        Data type to compare
 */
@NotThreadSafe
public class ComparatorComparable <DATATYPE extends Comparable <? super DATATYPE>> extends AbstractComparator <DATATYPE>
{
  /**
   * Comparator with default sort order and no nested comparator.
   */
  public ComparatorComparable ()
  {}

  @Override
  protected final int mainCompare (@Nullable final DATATYPE aElement1, @Nullable final DATATYPE aElement2)
  {
    return CompareHelper.compare (aElement1, aElement2, isNullValuesComeFirst ());
  }
}
