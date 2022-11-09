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
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

public interface ProcessRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.ProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   *
   * @return Whether the inlineDocument field is set.
   */
  boolean hasInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   *
   * @return The inlineDocument.
   */
  com.google.cloud.documentai.v1.Document getInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.Document inline_document = 4;</code>
   */
  com.google.cloud.documentai.v1.DocumentOrBuilder getInlineDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.RawDocument raw_document = 5;</code>
   *
   * @return Whether the rawDocument field is set.
   */
  boolean hasRawDocument();
  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.RawDocument raw_document = 5;</code>
   *
   * @return The rawDocument.
   */
  com.google.cloud.documentai.v1.RawDocument getRawDocument();
  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.RawDocument raw_document = 5;</code>
   */
  com.google.cloud.documentai.v1.RawDocumentOrBuilder getRawDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the [Processor][google.cloud.documentai.v1.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion]
   * to use for processing. If a [Processor][google.cloud.documentai.v1.Processor] is specified, the server will use
   * its [default version][google.cloud.documentai.v1.Processor.default_processor_version]. Format:
   * `projects/{project}/locations/{location}/processors/{processor}`, or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [Processor][google.cloud.documentai.v1.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion]
   * to use for processing. If a [Processor][google.cloud.documentai.v1.Processor] is specified, the server will use
   * its [default version][google.cloud.documentai.v1.Processor.default_processor_version]. Format:
   * `projects/{project}/locations/{location}/processors/{processor}`, or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Whether Human Review feature should be skipped for this request. Default to
   * false.
   * </pre>
   *
   * <code>bool skip_human_review = 3;</code>
   *
   * @return The skipHumanReview.
   */
  boolean getSkipHumanReview();

  /**
   *
   *
   * <pre>
   * Specifies which fields to include in ProcessResponse's document.
   * Only supports top level document and pages field so it must be in the form
   * of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Specifies which fields to include in ProcessResponse's document.
   * Only supports top level document and pages field so it must be in the form
   * of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Specifies which fields to include in ProcessResponse's document.
   * Only supports top level document and pages field so it must be in the form
   * of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  public com.google.cloud.documentai.v1.ProcessRequest.SourceCase getSourceCase();
}
