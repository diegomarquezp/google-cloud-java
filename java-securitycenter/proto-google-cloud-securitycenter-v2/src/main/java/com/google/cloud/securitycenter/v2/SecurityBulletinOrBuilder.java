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
// source: google/cloud/securitycenter/v2/vulnerability.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public interface SecurityBulletinOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.SecurityBulletin)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ID of the bulletin corresponding to the vulnerability.
   * </pre>
   *
   * <code>string bulletin_id = 1;</code>
   *
   * @return The bulletinId.
   */
  java.lang.String getBulletinId();
  /**
   *
   *
   * <pre>
   * ID of the bulletin corresponding to the vulnerability.
   * </pre>
   *
   * <code>string bulletin_id = 1;</code>
   *
   * @return The bytes for bulletinId.
   */
  com.google.protobuf.ByteString getBulletinIdBytes();

  /**
   *
   *
   * <pre>
   * Submission time of this Security Bulletin.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submission_time = 2;</code>
   *
   * @return Whether the submissionTime field is set.
   */
  boolean hasSubmissionTime();
  /**
   *
   *
   * <pre>
   * Submission time of this Security Bulletin.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submission_time = 2;</code>
   *
   * @return The submissionTime.
   */
  com.google.protobuf.Timestamp getSubmissionTime();
  /**
   *
   *
   * <pre>
   * Submission time of this Security Bulletin.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submission_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmissionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * This represents a version that the cluster receiving this notification
   * should be upgraded to, based on its current version. For example, 1.15.0
   * </pre>
   *
   * <code>string suggested_upgrade_version = 3;</code>
   *
   * @return The suggestedUpgradeVersion.
   */
  java.lang.String getSuggestedUpgradeVersion();
  /**
   *
   *
   * <pre>
   * This represents a version that the cluster receiving this notification
   * should be upgraded to, based on its current version. For example, 1.15.0
   * </pre>
   *
   * <code>string suggested_upgrade_version = 3;</code>
   *
   * @return The bytes for suggestedUpgradeVersion.
   */
  com.google.protobuf.ByteString getSuggestedUpgradeVersionBytes();
}
