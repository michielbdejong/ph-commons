/**
 * Copyright (C) 2014-2020 Philip Helger (www.helger.com)
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
package com.helger.datetime.expiration;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.state.EChange;

/**
 * Interface for objects that can expire but offer a replacement once the object
 * expires.
 *
 * @author Philip Helger
 * @param <DATATYPE>
 *        The type of the object use for defining a replacement.
 */
public interface IMutableExpirableWithReplacement <DATATYPE> extends IMutableExpirable, IExpirableWithReplacement <DATATYPE>
{
  /**
   * Define a replacement in case this object expires.
   *
   * @param aReplacement
   *        The replacement object to use.
   * @return {@link EChange#CHANGED} if something was changed,
   *         {@link EChange#UNCHANGED} otherwise.
   */
  @Nonnull
  EChange setReplacement (@Nullable DATATYPE aReplacement);
}
