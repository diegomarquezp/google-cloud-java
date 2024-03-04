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
// source: google/cloud/securitycenter/v2/database.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public interface DatabaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.Database)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Some database resources may not have the [full resource
   * name](https://google.aip.dev/122#full-resource-names) populated because
   * these resource types are not yet supported by Cloud Asset Inventory (e.g.
   * Cloud SQL databases). In these cases only the display name will be
   * provided.
   * The [full resource name](https://google.aip.dev/122#full-resource-names) of
   * the database that the user connected to, if it is supported by Cloud Asset
   * Inventory.
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
   * Some database resources may not have the [full resource
   * name](https://google.aip.dev/122#full-resource-names) populated because
   * these resource types are not yet supported by Cloud Asset Inventory (e.g.
   * Cloud SQL databases). In these cases only the display name will be
   * provided.
   * The [full resource name](https://google.aip.dev/122#full-resource-names) of
   * the database that the user connected to, if it is supported by Cloud Asset
   * Inventory.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The human-readable name of the database that the user connected to.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The human-readable name of the database that the user connected to.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The username used to connect to the database. The username might not be an
   * IAM principal and does not have a set format.
   * </pre>
   *
   * <code>string user_name = 3;</code>
   *
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   *
   *
   * <pre>
   * The username used to connect to the database. The username might not be an
   * IAM principal and does not have a set format.
   * </pre>
   *
   * <code>string user_name = 3;</code>
   *
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString getUserNameBytes();

  /**
   *
   *
   * <pre>
   * The SQL statement that is associated with the database access.
   * </pre>
   *
   * <code>string query = 4;</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * The SQL statement that is associated with the database access.
   * </pre>
   *
   * <code>string query = 4;</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The target usernames, roles, or groups of an SQL privilege grant, which is
   * not an IAM policy change.
   * </pre>
   *
   * <code>repeated string grantees = 5;</code>
   *
   * @return A list containing the grantees.
   */
  java.util.List<java.lang.String> getGranteesList();
  /**
   *
   *
   * <pre>
   * The target usernames, roles, or groups of an SQL privilege grant, which is
   * not an IAM policy change.
   * </pre>
   *
   * <code>repeated string grantees = 5;</code>
   *
   * @return The count of grantees.
   */
  int getGranteesCount();
  /**
   *
   *
   * <pre>
   * The target usernames, roles, or groups of an SQL privilege grant, which is
   * not an IAM policy change.
   * </pre>
   *
   * <code>repeated string grantees = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The grantees at the given index.
   */
  java.lang.String getGrantees(int index);
  /**
   *
   *
   * <pre>
   * The target usernames, roles, or groups of an SQL privilege grant, which is
   * not an IAM policy change.
   * </pre>
   *
   * <code>repeated string grantees = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the grantees at the given index.
   */
  com.google.protobuf.ByteString getGranteesBytes(int index);

  /**
   *
   *
   * <pre>
   * The version of the database, for example, POSTGRES_14.
   * See [the complete
   * list](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1/SqlDatabaseVersion).
   * </pre>
   *
   * <code>string version = 6;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version of the database, for example, POSTGRES_14.
   * See [the complete
   * list](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1/SqlDatabaseVersion).
   * </pre>
   *
   * <code>string version = 6;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
