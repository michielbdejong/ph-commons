/**
 * Copyright (C) 2014-2017 Philip Helger (www.helger.com)
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
package com.helger.commons.mutable;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Nonnull;

/**
 * Base interface for mutable numeric values
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
public interface IMutableNumeric <IMPLTYPE extends IMutableNumeric <IMPLTYPE>> extends IMutableObject <IMPLTYPE>
{
  /**
   * @return <code>true</code> if the value is 0
   */
  boolean is0 ();

  /**
   * @return <code>true</code> if the value is not 0
   */
  default boolean isNot0 ()
  {
    return !is0 ();
  }

  /**
   * @return <code>true</code> if the value is &lt; 0
   * @deprecated Use {@link #isLT0()} instead
   */
  @Deprecated
  default boolean isSmaller0 ()
  {
    return isLT0 ();
  }

  /**
   * @return <code>true</code> if the value is &lt; 0
   */
  boolean isLT0 ();

  /**
   * @return <code>true</code> if the value is &le; 0
   * @deprecated Use {@link #isLE0()} instead
   */
  @Deprecated
  default boolean isSmallerOrEqual0 ()
  {
    return isLE0 ();
  }

  /**
   * @return <code>true</code> if the value is &le; 0
   */
  boolean isLE0 ();

  /**
   * @return <code>true</code> if the value is &gt; 0
   * @deprecated Use {@link #isGT0()} instead
   */
  @Deprecated
  default boolean isGreater0 ()
  {
    return isGT0 ();
  }

  /**
   * @return <code>true</code> if the value is &gt; 0
   */
  boolean isGT0 ();

  /**
   * @return <code>true</code> if the value is &ge; 0
   * @deprecated Use {@link #isGE0()} instead
   */
  @Deprecated
  default boolean isGreaterOrEqual0 ()
  {
    return isGE0 ();
  }

  /**
   * @return <code>true</code> if the value is &ge; 0
   */
  boolean isGE0 ();

  @Nonnull
  Byte getAsByte ();

  @Nonnull
  Character getAsCharacter ();

  @Nonnull
  Double getAsDouble ();

  @Nonnull
  Float getAsFloat ();

  @Nonnull
  Integer getAsInteger ();

  @Nonnull
  Long getAsLong ();

  @Nonnull
  Short getAsShort ();

  @Nonnull
  BigInteger getAsBigInteger ();

  @Nonnull
  BigDecimal getAsBigDecimal ();
}
