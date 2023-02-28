/*
 * Copyright 2020 Google LLC
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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface CreateExpandedDataSetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateExpandedDataSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
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
   * Required. Example format: properties/1234
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
   * Required. The ExpandedDataSet to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the expandedDataSet field is set.
   */
  boolean hasExpandedDataSet();
  /**
   *
   *
   * <pre>
   * Required. The ExpandedDataSet to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The expandedDataSet.
   */
  com.google.analytics.admin.v1alpha.ExpandedDataSet getExpandedDataSet();
  /**
   *
   *
   * <pre>
   * Required. The ExpandedDataSet to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.ExpandedDataSetOrBuilder getExpandedDataSetOrBuilder();
}
