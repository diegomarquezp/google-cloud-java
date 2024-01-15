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
// source: google/api/http.proto

package com.google.api;

public interface CustomHttpPatternOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.CustomHttpPattern)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this custom HTTP verb.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * The name of this custom HTTP verb.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The path matched by this custom verb.
   * </pre>
   *
   * <code>string path = 2;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * The path matched by this custom verb.
   * </pre>
   *
   * <code>string path = 2;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();
}
