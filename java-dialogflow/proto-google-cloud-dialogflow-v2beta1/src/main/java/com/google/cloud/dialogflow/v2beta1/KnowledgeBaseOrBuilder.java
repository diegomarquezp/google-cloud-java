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
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public interface KnowledgeBaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.KnowledgeBase)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The knowledge base resource name.
   * The name must be empty when creating a knowledge base.
   * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The knowledge base resource name.
   * The name must be empty when creating a knowledge base.
   * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the knowledge base. The name must be 1024
   * bytes or less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the knowledge base. The name must be 1024
   * bytes or less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Language which represents the KnowledgeBase. When the KnowledgeBase is
   * created/updated, this is populated for all non en-us languages. If not
   * populated, the default language en-us applies.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language which represents the KnowledgeBase. When the KnowledgeBase is
   * created/updated, this is populated for all non en-us languages. If not
   * populated, the default language en-us applies.
   * </pre>
   *
   * <code>string language_code = 4;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
