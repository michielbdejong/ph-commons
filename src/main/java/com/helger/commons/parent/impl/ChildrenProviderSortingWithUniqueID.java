/**
 * Copyright (C) 2014 Philip Helger (www.helger.com)
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
package com.helger.commons.parent.impl;

import java.util.Comparator;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.parent.IChildrenProviderWithUniqueID;

/**
 * An {@link com.helger.commons.parent.IChildrenProviderWithID} with ID that
 * returns the children in {@link #getAllChildren(Object)} sorted.
 *
 * @author Philip Helger
 * @param <KEYTYPE>
 *        The key type.
 * @param <CHILDTYPE>
 *        The data type of the child objects.
 */
public class ChildrenProviderSortingWithUniqueID <KEYTYPE, CHILDTYPE> extends ChildrenProviderSorting <CHILDTYPE> implements IChildrenProviderWithUniqueID <KEYTYPE, CHILDTYPE>
{
  public ChildrenProviderSortingWithUniqueID (@Nonnull final IChildrenProviderWithUniqueID <KEYTYPE, CHILDTYPE> aCP,
                                              @Nonnull final Comparator <? super CHILDTYPE> aComparator)
  {
    super (aCP, aComparator);
  }

  @SuppressWarnings ("unchecked")
  @Nullable
  public CHILDTYPE getItemWithID (@Nullable final KEYTYPE aID)
  {
    return ((IChildrenProviderWithUniqueID <KEYTYPE, CHILDTYPE>) getChildrenProvider ()).getItemWithID (aID);
  }
}
