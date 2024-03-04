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
// source: google/cloud/securitycenter/v2/file.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public interface FileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.File)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Absolute path of the file as a JSON encoded string.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Absolute path of the file as a JSON encoded string.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Size of the file in bytes.
   * </pre>
   *
   * <code>int64 size = 2;</code>
   *
   * @return The size.
   */
  long getSize();

  /**
   *
   *
   * <pre>
   * SHA256 hash of the first hashed_size bytes of the file encoded as a
   * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
   * of the entire file.
   * </pre>
   *
   * <code>string sha256 = 3;</code>
   *
   * @return The sha256.
   */
  java.lang.String getSha256();
  /**
   *
   *
   * <pre>
   * SHA256 hash of the first hashed_size bytes of the file encoded as a
   * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
   * of the entire file.
   * </pre>
   *
   * <code>string sha256 = 3;</code>
   *
   * @return The bytes for sha256.
   */
  com.google.protobuf.ByteString getSha256Bytes();

  /**
   *
   *
   * <pre>
   * The length in bytes of the file prefix that was hashed.  If
   * hashed_size == size, any hashes reported represent the entire
   * file.
   * </pre>
   *
   * <code>int64 hashed_size = 4;</code>
   *
   * @return The hashedSize.
   */
  long getHashedSize();

  /**
   *
   *
   * <pre>
   * True when the hash covers only a prefix of the file.
   * </pre>
   *
   * <code>bool partially_hashed = 5;</code>
   *
   * @return The partiallyHashed.
   */
  boolean getPartiallyHashed();

  /**
   *
   *
   * <pre>
   * Prefix of the file contents as a JSON-encoded string.
   * </pre>
   *
   * <code>string contents = 6;</code>
   *
   * @return The contents.
   */
  java.lang.String getContents();
  /**
   *
   *
   * <pre>
   * Prefix of the file contents as a JSON-encoded string.
   * </pre>
   *
   * <code>string contents = 6;</code>
   *
   * @return The bytes for contents.
   */
  com.google.protobuf.ByteString getContentsBytes();

  /**
   *
   *
   * <pre>
   * Path of the file in terms of underlying disk/partition identifiers.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.File.DiskPath disk_path = 7;</code>
   *
   * @return Whether the diskPath field is set.
   */
  boolean hasDiskPath();
  /**
   *
   *
   * <pre>
   * Path of the file in terms of underlying disk/partition identifiers.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.File.DiskPath disk_path = 7;</code>
   *
   * @return The diskPath.
   */
  com.google.cloud.securitycenter.v2.File.DiskPath getDiskPath();
  /**
   *
   *
   * <pre>
   * Path of the file in terms of underlying disk/partition identifiers.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.File.DiskPath disk_path = 7;</code>
   */
  com.google.cloud.securitycenter.v2.File.DiskPathOrBuilder getDiskPathOrBuilder();
}
