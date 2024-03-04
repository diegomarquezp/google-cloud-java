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
// source: google/cloud/securitycenter/v2/valued_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public interface ValuedResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.ValuedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Valued resource name, for example,
   *  e.g.:
   *  `organizations/123/simulations/456/valuedResources/789`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Valued resource name, for example,
   *  e.g.:
   *  `organizations/123/simulations/456/valuedResources/789`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The
   * [full resource
   * name](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * of the valued resource.
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * The
   * [full resource
   * name](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * of the valued resource.
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The [resource
   * type](https://cloud.google.com/asset-inventory/docs/supported-asset-types)
   * of the valued resource.
   * </pre>
   *
   * <code>string resource_type = 3;</code>
   *
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   *
   *
   * <pre>
   * The [resource
   * type](https://cloud.google.com/asset-inventory/docs/supported-asset-types)
   * of the valued resource.
   * </pre>
   *
   * <code>string resource_type = 3;</code>
   *
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString getResourceTypeBytes();

  /**
   *
   *
   * <pre>
   * Human-readable name of the valued resource.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-readable name of the valued resource.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * How valuable this resource is.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.ValuedResource.ResourceValue resource_value = 5;</code>
   *
   * @return The enum numeric value on the wire for resourceValue.
   */
  int getResourceValueValue();
  /**
   *
   *
   * <pre>
   * How valuable this resource is.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.ValuedResource.ResourceValue resource_value = 5;</code>
   *
   * @return The resourceValue.
   */
  com.google.cloud.securitycenter.v2.ValuedResource.ResourceValue getResourceValue();

  /**
   *
   *
   * <pre>
   * Exposed score for this valued resource. A value of 0 means no exposure was
   * detected exposure.
   * </pre>
   *
   * <code>double exposed_score = 6;</code>
   *
   * @return The exposedScore.
   */
  double getExposedScore();

  /**
   *
   *
   * <pre>
   * List of resource value configurations' metadata used to determine the value
   * of this resource. Maximum of 100.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.ResourceValueConfigMetadata resource_value_configs_used = 7;
   * </code>
   */
  java.util.List<com.google.cloud.securitycenter.v2.ResourceValueConfigMetadata>
      getResourceValueConfigsUsedList();
  /**
   *
   *
   * <pre>
   * List of resource value configurations' metadata used to determine the value
   * of this resource. Maximum of 100.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.ResourceValueConfigMetadata resource_value_configs_used = 7;
   * </code>
   */
  com.google.cloud.securitycenter.v2.ResourceValueConfigMetadata getResourceValueConfigsUsed(
      int index);
  /**
   *
   *
   * <pre>
   * List of resource value configurations' metadata used to determine the value
   * of this resource. Maximum of 100.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.ResourceValueConfigMetadata resource_value_configs_used = 7;
   * </code>
   */
  int getResourceValueConfigsUsedCount();
  /**
   *
   *
   * <pre>
   * List of resource value configurations' metadata used to determine the value
   * of this resource. Maximum of 100.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.ResourceValueConfigMetadata resource_value_configs_used = 7;
   * </code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v2.ResourceValueConfigMetadataOrBuilder>
      getResourceValueConfigsUsedOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of resource value configurations' metadata used to determine the value
   * of this resource. Maximum of 100.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.ResourceValueConfigMetadata resource_value_configs_used = 7;
   * </code>
   */
  com.google.cloud.securitycenter.v2.ResourceValueConfigMetadataOrBuilder
      getResourceValueConfigsUsedOrBuilder(int index);
}
