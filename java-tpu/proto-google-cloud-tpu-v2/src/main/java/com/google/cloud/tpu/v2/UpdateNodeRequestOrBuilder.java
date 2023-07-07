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
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

public interface UpdateNodeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.UpdateNodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Mask of fields from [Node][Tpu.Node] to update.
   * Supported fields: [description, tags, labels, metadata,
   * network_config.enable_external_ips].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields from [Node][Tpu.Node] to update.
   * Supported fields: [description, tags, labels, metadata,
   * network_config.enable_external_ips].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields from [Node][Tpu.Node] to update.
   * Supported fields: [description, tags, labels, metadata,
   * network_config.enable_external_ips].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The node. Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node node = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   *
   *
   * <pre>
   * Required. The node. Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node node = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The node.
   */
  com.google.cloud.tpu.v2.Node getNode();
  /**
   *
   *
   * <pre>
   * Required. The node. Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node node = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.tpu.v2.NodeOrBuilder getNodeOrBuilder();
}
