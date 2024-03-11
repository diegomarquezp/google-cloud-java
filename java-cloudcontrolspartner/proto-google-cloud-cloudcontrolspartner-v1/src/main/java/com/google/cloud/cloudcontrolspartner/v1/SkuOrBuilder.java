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
// source: google/cloud/cloudcontrolspartner/v1/partners.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.cloudcontrolspartner.v1;

public interface SkuOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1.Sku)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Argentum product SKU, that is associated with the partner offerings to
   * customers used by Syntro for billing purposes. SKUs can represent resold
   * Google products or support services.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Argentum product SKU, that is associated with the partner offerings to
   * customers used by Syntro for billing purposes. SKUs can represent resold
   * Google products or support services.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Display name of the product identified by the SKU. A partner may want to
   * show partner branded names for their offerings such as local sovereign
   * cloud solutions.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display name of the product identified by the SKU. A partner may want to
   * show partner branded names for their offerings such as local sovereign
   * cloud solutions.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
