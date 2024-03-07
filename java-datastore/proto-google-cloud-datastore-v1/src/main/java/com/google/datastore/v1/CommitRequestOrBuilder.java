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

public interface CommitRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.CommitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The ID of the database against which to make the request.
   *
   * '(default)' is not allowed; please use empty string '' to refer the default
   * database.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   *
   * @return The databaseId.
   */
  java.lang.String getDatabaseId();
  /**
   *
   *
   * <pre>
   * The ID of the database against which to make the request.
   *
   * '(default)' is not allowed; please use empty string '' to refer the default
   * database.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   *
   * @return The bytes for databaseId.
   */
  com.google.protobuf.ByteString getDatabaseIdBytes();

  /**
   *
   *
   * <pre>
   * The type of commit to perform. Defaults to `TRANSACTIONAL`.
   * </pre>
   *
   * <code>.google.datastore.v1.CommitRequest.Mode mode = 5;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * The type of commit to perform. Defaults to `TRANSACTIONAL`.
   * </pre>
   *
   * <code>.google.datastore.v1.CommitRequest.Mode mode = 5;</code>
   *
   * @return The mode.
   */
  com.google.datastore.v1.CommitRequest.Mode getMode();

  /**
   *
   *
   * <pre>
   * The identifier of the transaction associated with the commit. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 1;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * The identifier of the transaction associated with the commit. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 1;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * Options for beginning a new transaction for this request.
   * The transaction is committed when the request completes. If specified,
   * [TransactionOptions.mode][google.datastore.v1.TransactionOptions] must be
   * [TransactionOptions.ReadWrite][google.datastore.v1.TransactionOptions.ReadWrite].
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions single_use_transaction = 10;</code>
   *
   * @return Whether the singleUseTransaction field is set.
   */
  boolean hasSingleUseTransaction();
  /**
   *
   *
   * <pre>
   * Options for beginning a new transaction for this request.
   * The transaction is committed when the request completes. If specified,
   * [TransactionOptions.mode][google.datastore.v1.TransactionOptions] must be
   * [TransactionOptions.ReadWrite][google.datastore.v1.TransactionOptions.ReadWrite].
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions single_use_transaction = 10;</code>
   *
   * @return The singleUseTransaction.
   */
  com.google.datastore.v1.TransactionOptions getSingleUseTransaction();
  /**
   *
   *
   * <pre>
   * Options for beginning a new transaction for this request.
   * The transaction is committed when the request completes. If specified,
   * [TransactionOptions.mode][google.datastore.v1.TransactionOptions] must be
   * [TransactionOptions.ReadWrite][google.datastore.v1.TransactionOptions.ReadWrite].
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions single_use_transaction = 10;</code>
   */
  com.google.datastore.v1.TransactionOptionsOrBuilder getSingleUseTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * The mutations to perform.
   *
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   *
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   *
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Mutation mutations = 6;</code>
   */
  java.util.List<com.google.datastore.v1.Mutation> getMutationsList();
  /**
   *
   *
   * <pre>
   * The mutations to perform.
   *
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   *
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   *
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Mutation mutations = 6;</code>
   */
  com.google.datastore.v1.Mutation getMutations(int index);
  /**
   *
   *
   * <pre>
   * The mutations to perform.
   *
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   *
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   *
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Mutation mutations = 6;</code>
   */
  int getMutationsCount();
  /**
   *
   *
   * <pre>
   * The mutations to perform.
   *
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   *
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   *
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Mutation mutations = 6;</code>
   */
  java.util.List<? extends com.google.datastore.v1.MutationOrBuilder> getMutationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The mutations to perform.
   *
   * When mode is `TRANSACTIONAL`, mutations affecting a single entity are
   * applied in order. The following sequences of mutations affecting a single
   * entity are not permitted in a single `Commit` request:
   *
   * - `insert` followed by `insert`
   * - `update` followed by `insert`
   * - `upsert` followed by `insert`
   * - `delete` followed by `update`
   *
   * When mode is `NON_TRANSACTIONAL`, no two mutations may affect a single
   * entity.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Mutation mutations = 6;</code>
   */
  com.google.datastore.v1.MutationOrBuilder getMutationsOrBuilder(int index);

  com.google.datastore.v1.CommitRequest.TransactionSelectorCase getTransactionSelectorCase();
}
