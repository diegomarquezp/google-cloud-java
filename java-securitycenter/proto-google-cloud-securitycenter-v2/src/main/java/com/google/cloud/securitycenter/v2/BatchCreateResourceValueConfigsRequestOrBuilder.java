/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/securitycenter/v2/securitycenter_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public interface BatchCreateResourceValueConfigsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.BatchCreateResourceValueConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the new ResourceValueConfig's parent.
   * The parent field in the CreateResourceValueConfigRequest
   * messages must either be empty or match this field.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the new ResourceValueConfig's parent.
   * The parent field in the CreateResourceValueConfigRequest
   * messages must either be empty or match this field.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource value configs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.CreateResourceValueConfigRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.securitycenter.v2.CreateResourceValueConfigRequest>
      getRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The resource value configs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.CreateResourceValueConfigRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v2.CreateResourceValueConfigRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The resource value configs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.CreateResourceValueConfigRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The resource value configs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.CreateResourceValueConfigRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.securitycenter.v2.CreateResourceValueConfigRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The resource value configs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.CreateResourceValueConfigRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v2.CreateResourceValueConfigRequestOrBuilder getRequestsOrBuilder(
      int index);
}
