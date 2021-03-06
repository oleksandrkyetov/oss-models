/*
 * Copyright 2018 Symphony Communication Services, LLC.
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

package com.symphony.oss.models.fundamental.canon.facade;

import java.security.PrivateKey;

import com.symphony.oss.models.fundamental.canon.facade.IOpenSimpleSecurityContext;
import com.symphony.oss.models.fundamental.canon.facade.ISecurityContext;

/**
 * An open SecurityContext which has private and secret keys available.
 * 
 * @author Bruce Skingle
 *
 */
public interface IOpenSecurityContext extends IOpenSimpleSecurityContext, ISecurityContext
{
  /**
   * Return the private asymmetric key for this security context.
   * 
   * @return the private asymmetric key for this security context.
   */
  PrivateKey getPrivateKey();
}
