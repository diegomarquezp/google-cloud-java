/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface DependencyEdgeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.DependencyEdge)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Represents the head of this token in the dependency tree.
   * This is the index of the token which has an arc going to this token.
   * The index is the position of the token in the array of tokens returned
   * by the API method. If this token is a root token, then the
   * `head_token_index` is its own index.
   * </pre>
   *
   * <code>int32 head_token_index = 1;</code>
   *
   * @return The headTokenIndex.
   */
  int getHeadTokenIndex();

  /**
   *
   *
   * <pre>
   * The parse label for the token.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.DependencyEdge.Label label = 2;</code>
   *
   * @return The enum numeric value on the wire for label.
   */
  int getLabelValue();
  /**
   *
   *
   * <pre>
   * The parse label for the token.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.DependencyEdge.Label label = 2;</code>
   *
   * @return The label.
   */
  com.google.cloud.language.v1beta2.DependencyEdge.Label getLabel();
}
