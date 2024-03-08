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
// source: google/chat/v1/group.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public interface GroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.Group)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name for a Google Group.
   *
   * Represents a
   * [group](https://cloud.google.com/identity/docs/reference/rest/v1/groups) in
   * Cloud Identity Groups API.
   *
   * Format: groups/{group}
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
   * Resource name for a Google Group.
   *
   * Represents a
   * [group](https://cloud.google.com/identity/docs/reference/rest/v1/groups) in
   * Cloud Identity Groups API.
   *
   * Format: groups/{group}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
