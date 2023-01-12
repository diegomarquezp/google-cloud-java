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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface SourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Vmware type source details.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareSourceDetails vmware = 10;</code>
   *
   * @return Whether the vmware field is set.
   */
  boolean hasVmware();
  /**
   *
   *
   * <pre>
   * Vmware type source details.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareSourceDetails vmware = 10;</code>
   *
   * @return The vmware.
   */
  com.google.cloud.vmmigration.v1.VmwareSourceDetails getVmware();
  /**
   *
   *
   * <pre>
   * Vmware type source details.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareSourceDetails vmware = 10;</code>
   */
  com.google.cloud.vmmigration.v1.VmwareSourceDetailsOrBuilder getVmwareOrBuilder();

  /**
   *
   *
   * <pre>
   * AWS type source details.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsSourceDetails aws = 12;</code>
   *
   * @return Whether the aws field is set.
   */
  boolean hasAws();
  /**
   *
   *
   * <pre>
   * AWS type source details.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsSourceDetails aws = 12;</code>
   *
   * @return The aws.
   */
  com.google.cloud.vmmigration.v1.AwsSourceDetails getAws();
  /**
   *
   *
   * <pre>
   * AWS type source details.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AwsSourceDetails aws = 12;</code>
   */
  com.google.cloud.vmmigration.v1.AwsSourceDetailsOrBuilder getAwsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The Source name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The Source name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The create time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels of the source.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels of the source.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels of the source.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels of the source.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels of the source.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * User-provided description of the source.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User-provided description of the source.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  public com.google.cloud.vmmigration.v1.Source.SourceDetailsCase getSourceDetailsCase();
}
