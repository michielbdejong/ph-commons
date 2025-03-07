/**
 * Copyright (C) 2014-2021 Philip Helger (www.helger.com)
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
package com.helger.jaxb.adapter;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import javax.annotation.Nullable;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.datetime.PDTWebDateHelper;

/**
 * XML Adapter between LocalDateTime and String. Use it in your binding file
 * like this:<br>
 * <code>&lt;xjc:javaType name="java.time.LocalDateTime" xmlType="xsd:dateTime" adapter="com.helger.jaxb.adapter.AdapterLocalDateTime" /&gt;</code>
 *
 * @author Philip Helger
 * @since 9.4.7
 */
public class AdapterLocalDateTime extends XmlAdapter <String, LocalDateTime>
{
  private static final Logger LOGGER = LoggerFactory.getLogger (AdapterLocalDateTime.class);

  @Override
  public LocalDateTime unmarshal (@Nullable final String sValue)
  {
    if (sValue == null)
      return null;

    final String sTrimmed = sValue.trim ();
    final OffsetDateTime aODT = PDTWebDateHelper.getOffsetDateTimeFromXSD (sTrimmed);
    if (aODT != null)
    {
      // A timezone information is present
      // Get as canonical LocalDateTime
      return aODT.toLocalDateTime ().minusSeconds (aODT.getOffset ().getTotalSeconds ());
    }

    final LocalDateTime ret = PDTWebDateHelper.getLocalDateTimeFromXSD (sTrimmed);
    if (ret == null)
      LOGGER.warn ("Failed to parse '" + sValue + "' to a LocalDateTime");
    return ret;
  }

  @Override
  public String marshal (@Nullable final LocalDateTime aValue)
  {
    return PDTWebDateHelper.getAsStringXSD (aValue);
  }
}
