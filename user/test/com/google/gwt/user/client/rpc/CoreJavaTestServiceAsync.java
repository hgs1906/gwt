/*
 * Copyright 2011 Google Inc.
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


package com.google.gwt.user.client.rpc;

import java.math.MathContext;
import java.util.logging.LogRecord;

/**
 * Async interface for serialization of GWT core.java emulations.
 */
public interface CoreJavaTestServiceAsync {

  void echoLogRecord(LogRecord value, AsyncCallback<LogRecord> callback);

  void echoMathContext(MathContext expected, AsyncCallback<MathContext> asyncCallback);
}