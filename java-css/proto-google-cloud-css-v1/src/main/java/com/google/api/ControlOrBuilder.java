/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/control.proto

package com.google.api;

public interface ControlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.Control)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The service controller environment to use. If empty, no control plane
   * feature (like quota and billing) will be enabled. The recommended value for
   * most services is servicecontrol.googleapis.com
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();
  /**
   *
   *
   * <pre>
   * The service controller environment to use. If empty, no control plane
   * feature (like quota and billing) will be enabled. The recommended value for
   * most services is servicecontrol.googleapis.com
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();

  /**
   *
   *
   * <pre>
   * Defines policies applying to the API methods of the service.
   * </pre>
   *
   * <code>repeated .google.api.MethodPolicy method_policies = 4;</code>
   */
  java.util.List<com.google.api.MethodPolicy> getMethodPoliciesList();
  /**
   *
   *
   * <pre>
   * Defines policies applying to the API methods of the service.
   * </pre>
   *
   * <code>repeated .google.api.MethodPolicy method_policies = 4;</code>
   */
  com.google.api.MethodPolicy getMethodPolicies(int index);
  /**
   *
   *
   * <pre>
   * Defines policies applying to the API methods of the service.
   * </pre>
   *
   * <code>repeated .google.api.MethodPolicy method_policies = 4;</code>
   */
  int getMethodPoliciesCount();
  /**
   *
   *
   * <pre>
   * Defines policies applying to the API methods of the service.
   * </pre>
   *
   * <code>repeated .google.api.MethodPolicy method_policies = 4;</code>
   */
  java.util.List<? extends com.google.api.MethodPolicyOrBuilder> getMethodPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Defines policies applying to the API methods of the service.
   * </pre>
   *
   * <code>repeated .google.api.MethodPolicy method_policies = 4;</code>
   */
  com.google.api.MethodPolicyOrBuilder getMethodPoliciesOrBuilder(int index);
}
