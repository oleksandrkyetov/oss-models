/*
 *
 *
 * Copyright 2019 Symphony Communication Services, LLC.
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

package com.symphony.oss.models.object;

import org.symphonyoss.s2.canon.runtime.exception.BadRequestException;

public class ObjectModelUtils
{
  public static void validateFeedName(String name)
  {
    for(int i=0 ; i<name.length() ; i++)
    {
      char c = name.charAt(i);
      
      if(c>='a' && c<='z')
        break;
      
      if(c>='A' && c<='Z')
        break;
      
      if(c>='0' && c<='9')
          break;
      
      if(c=='_')
        break;
      
      throw new BadRequestException("Feed names may contain only alphanumerics and underscores");
    }
  }
}
