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
// source: google/datastore/v1/datastore.proto

// Protobuf Java Version: 3.25.2
package com.google.datastore.v1;

public interface MutationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.Mutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The entity to insert. The entity must not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity insert = 4;</code>
   *
   * @return Whether the insert field is set.
   */
  boolean hasInsert();
  /**
   *
   *
   * <pre>
   * The entity to insert. The entity must not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity insert = 4;</code>
   *
   * @return The insert.
   */
  com.google.datastore.v1.Entity getInsert();
  /**
   *
   *
   * <pre>
   * The entity to insert. The entity must not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity insert = 4;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getInsertOrBuilder();

  /**
   *
   *
   * <pre>
   * The entity to update. The entity must already exist.
   * Must have a complete key path.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity update = 5;</code>
   *
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   *
   *
   * <pre>
   * The entity to update. The entity must already exist.
   * Must have a complete key path.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity update = 5;</code>
   *
   * @return The update.
   */
  com.google.datastore.v1.Entity getUpdate();
  /**
   *
   *
   * <pre>
   * The entity to update. The entity must already exist.
   * Must have a complete key path.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity update = 5;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getUpdateOrBuilder();

  /**
   *
   *
   * <pre>
   * The entity to upsert. The entity may or may not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity upsert = 6;</code>
   *
   * @return Whether the upsert field is set.
   */
  boolean hasUpsert();
  /**
   *
   *
   * <pre>
   * The entity to upsert. The entity may or may not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity upsert = 6;</code>
   *
   * @return The upsert.
   */
  com.google.datastore.v1.Entity getUpsert();
  /**
   *
   *
   * <pre>
   * The entity to upsert. The entity may or may not already exist.
   * The entity key's final path element may be incomplete.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity upsert = 6;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getUpsertOrBuilder();

  /**
   *
   *
   * <pre>
   * The key of the entity to delete. The entity may or may not already exist.
   * Must have a complete key path and must not be reserved/read-only.
   * </pre>
   *
   * <code>.google.datastore.v1.Key delete = 7;</code>
   *
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   *
   *
   * <pre>
   * The key of the entity to delete. The entity may or may not already exist.
   * Must have a complete key path and must not be reserved/read-only.
   * </pre>
   *
   * <code>.google.datastore.v1.Key delete = 7;</code>
   *
   * @return The delete.
   */
  com.google.datastore.v1.Key getDelete();
  /**
   *
   *
   * <pre>
   * The key of the entity to delete. The entity may or may not already exist.
   * Must have a complete key path and must not be reserved/read-only.
   * </pre>
   *
   * <code>.google.datastore.v1.Key delete = 7;</code>
   */
  com.google.datastore.v1.KeyOrBuilder getDeleteOrBuilder();

  /**
   *
   *
   * <pre>
   * The version of the entity that this mutation is being applied
   * to. If this does not match the current version on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>int64 base_version = 8;</code>
   *
   * @return Whether the baseVersion field is set.
   */
  boolean hasBaseVersion();
  /**
   *
   *
   * <pre>
   * The version of the entity that this mutation is being applied
   * to. If this does not match the current version on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>int64 base_version = 8;</code>
   *
   * @return The baseVersion.
   */
  long getBaseVersion();

  /**
   *
   *
   * <pre>
   * The update time of the entity that this mutation is being applied
   * to. If this does not match the current update time on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the entity that this mutation is being applied
   * to. If this does not match the current update time on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the entity that this mutation is being applied
   * to. If this does not match the current update time on the server, the
   * mutation conflicts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.datastore.v1.Mutation.OperationCase getOperationCase();

  com.google.datastore.v1.Mutation.ConflictDetectionStrategyCase getConflictDetectionStrategyCase();
}
