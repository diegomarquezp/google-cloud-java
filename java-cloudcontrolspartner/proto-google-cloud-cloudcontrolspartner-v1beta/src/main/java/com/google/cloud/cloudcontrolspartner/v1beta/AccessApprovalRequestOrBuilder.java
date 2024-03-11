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
// source: google/cloud/cloudcontrolspartner/v1beta/access_approval_requests.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.cloudcontrolspartner.v1beta;

public interface AccessApprovalRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1beta.AccessApprovalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}/accessApprovalRequests/{access_approval_request}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}/accessApprovalRequests/{access_approval_request}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The time at which approval was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   *
   * @return Whether the requestTime field is set.
   */
  boolean hasRequestTime();
  /**
   *
   *
   * <pre>
   * The time at which approval was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   *
   * @return The requestTime.
   */
  com.google.protobuf.Timestamp getRequestTime();
  /**
   *
   *
   * <pre>
   * The time at which approval was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The justification for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.AccessReason requested_reason = 3;</code>
   *
   * @return Whether the requestedReason field is set.
   */
  boolean hasRequestedReason();
  /**
   *
   *
   * <pre>
   * The justification for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.AccessReason requested_reason = 3;</code>
   *
   * @return The requestedReason.
   */
  com.google.cloud.cloudcontrolspartner.v1beta.AccessReason getRequestedReason();
  /**
   *
   *
   * <pre>
   * The justification for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.AccessReason requested_reason = 3;</code>
   */
  com.google.cloud.cloudcontrolspartner.v1beta.AccessReasonOrBuilder getRequestedReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * The requested expiration for the approval. If the request is approved,
   * access will be granted from the time of approval until the expiration time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_expiration_time = 4;</code>
   *
   * @return Whether the requestedExpirationTime field is set.
   */
  boolean hasRequestedExpirationTime();
  /**
   *
   *
   * <pre>
   * The requested expiration for the approval. If the request is approved,
   * access will be granted from the time of approval until the expiration time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_expiration_time = 4;</code>
   *
   * @return The requestedExpirationTime.
   */
  com.google.protobuf.Timestamp getRequestedExpirationTime();
  /**
   *
   *
   * <pre>
   * The requested expiration for the approval. If the request is approved,
   * access will be granted from the time of approval until the expiration time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_expiration_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestedExpirationTimeOrBuilder();
}
